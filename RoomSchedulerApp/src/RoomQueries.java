
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class RoomQueries {
    private static Connection connection;
    private static ArrayList<String> rooms = new ArrayList<String>();
    private static PreparedStatement getAllPossibleRoomsList;
    private static PreparedStatement addRoom;
    private static PreparedStatement dropRoom;
    private static ResultSet resultSet;
    
    public static ArrayList<String> getAllPossibleRooms(Integer int_seats){
        connection = DBConnection.getConnection();
        ArrayList<String> rooms = new ArrayList<String>();
        try 
        {
            getAllPossibleRoomsList=connection.prepareStatement("select name, seats from rooms where seats>=? order by seats");
            getAllPossibleRoomsList.setInt('1', int_seats);
            resultSet = getAllPossibleRoomsList.executeQuery();
            while(resultSet.next())
            {
                rooms.add(resultSet.getString(1));
            }
        } 
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return rooms;
    }
    
    
    public static void addRoom(){
        
    }
    public static void dropRoom(){
        
    }
}
