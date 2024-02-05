
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
public class WaitlistQueries {

    private static Connection connection;
    private static PreparedStatement addWaitlistEntry;
    private static PreparedStatement getWaitlistByDate;
    private static PreparedStatement getWaitlistByFaculty;
    private static PreparedStatement deleteWaitList;
    private static ResultSet resultSet;

    public static ArrayList<WaitlistEntry> getWaitlistByDate(Date date) {
        connection = DBConnection.getConnection();
        ArrayList<WaitlistEntry> WaitListArray = new ArrayList<WaitlistEntry>();
        try {
            getWaitlistByDate = connection.prepareStatement("select faculty,seats,timestamp from Waitlist order by timestamp");
            resultSet = getWaitlistByDate.executeQuery();

            while (resultSet.next()) {
                WaitListArray.add(new WaitlistEntry(resultSet.getString(1),date, resultSet.getInt(3), resultSet.getTimestamp(4)));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return WaitListArray;

    }

    public static ArrayList<String> getWaitlistByFaculty() {  
        connection = DBConnection.getConnection();
        ArrayList<String> WaitListArray = new ArrayList<String>();
        try
        {
            getWaitlistByFaculty=connection.prepareStatement("select faculty from waitlist order by timestamp");
            resultSet =getWaitlistByFaculty.executeQuery();
            
            while(resultSet.next())
            {
                WaitListArray.add(resultSet.getString(1));
            }
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
        return WaitListArray;
    }
    

    public static void addWaitlistEntry(String Faculty, Date date, Integer Seats) {
        connection = DBConnection.getConnection();
        try {
            addWaitlistEntry = connection.prepareStatement("insert into Waitlist(Faculty, Date, Seats, Timestamp) values (?,?,?,?)");
            addWaitlistEntry.setString(1, Faculty);
            addWaitlistEntry.setDate(2, date);
            addWaitlistEntry.setInt(3, Seats);
            addWaitlistEntry.setTimestamp(4, new Timestamp(System.currentTimeMillis()));
            addWaitlistEntry.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }  
    }

    public static void deleteWaitlistEntry(String name, Date date) {
        connection = DBConnection.getConnection();
        try{
            deleteWaitList = connection.prepareStatement("delete from waitlist where (faculty, date)=(?,?)");
            deleteWaitList.setString(1, name);
            deleteWaitList.setDate(2, date);
            deleteWaitList.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
}
