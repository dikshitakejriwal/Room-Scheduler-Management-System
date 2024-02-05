
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dikshitakejriwal
 */
public class ReservationQueries {
    private static Connection connection;
    private static PreparedStatement addReservationEntry;
    private static PreparedStatement deleteReservation;
    private static PreparedStatement getReservationByDate;
    private static PreparedStatement getRoomsReservedByDate;
    private static PreparedStatement getReservationByFaculty;
    private static ResultSet resultSet;
    
    //this class retrieves data as an array(date, room) from the Reservation table in the database 
    public static ArrayList<ReservationEntry> getReservationByDate(Date date){
        connection = DBConnection.getConnection();
        ArrayList<ReservationEntry> ReservationList = new ArrayList<ReservationEntry>();
        try
        {
            getReservationByDate= connection.prepareStatement("select faculty, room, seats,timestamp from Reservation order by timestamp");
            resultSet = getReservationByDate.executeQuery();
            
            while(resultSet.next())
            {
                ReservationList.add(new ReservationEntry(resultSet.getString(1),resultSet.getString(2),date,resultSet.getInt(3),resultSet.getTimestamp(4)));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return ReservationList;
        }
    
    public static ArrayList<String>getRoomsReservedByDate(Date date){
        connection = DBConnection.getConnection();
        ArrayList<String> ReservationList = new ArrayList<String>();
        try
        {
            getRoomsReservedByDate=connection.prepareStatement("select rooms from Reservation where date=? order by rooms");
            getRoomsReservedByDate.setDate(1, date);
            resultSet = getRoomsReservedByDate.executeQuery();
            
            while(resultSet.next())
            {
                ReservationList.add(resultSet.getString(1));
            }
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return ReservationList;
    }
        

    
    public static boolean addReservationEntry(String Faculty, Date Date, int Seats){
        connection = DBConnection.getConnection();
        ArrayList<String> possibleRooms = RoomQueries.getAllPossibleRooms(Seats);
        ArrayList<String> reservedRooms= getRoomsReservedByDate(Date);
        for(String rooms: possibleRooms ){
            if(!reservedRooms.contains(possibleRooms)){
                try{
                    addReservationEntry=connection.prepareStatement("insert into Reservations (Faculty, Rooms, Date , Seats, Timestamp) values (?,?,?,?,?)");
                    addReservationEntry.setString(1, Faculty);
                    addReservationEntry.setString(2,rooms);
                    addReservationEntry.setDate(3, Date);
                    addReservationEntry.setInt(4, Seats);
                    addReservationEntry.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
                    addReservationEntry.executeUpdate();
                }
                catch(SQLException sqlException)
                {
                    sqlException.printStackTrace();
                }
                return true;
            }
        }return false;
    }
    
    public static ArrayList<String>getReservationByFaculty(){
        connection = DBConnection.getConnection();
        ArrayList<String> ReservationList = new ArrayList<String>();
        try
        {
            getReservationByFaculty=connection.prepareStatement("select faculty from reservation order by timestamp");
            resultSet = getReservationByFaculty.executeQuery();
            
            while(resultSet.next())
            {
                ReservationList.add(resultSet.getString(1));
            }
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return ReservationList;
    }
    
    public static void deleteReservation(String name, Date date){
        connection = DBConnection.getConnection();
        try{
            deleteReservation = connection.prepareStatement("delete from reservation where (faculty, date)=(?,?)");
            deleteReservation.setString(1, name);
            deleteReservation.setDate(2, date);
            deleteReservation.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    }

    
    

