
import java.sql.Date;
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dikshitakejriwal
 */
public class ReservationEntry {
    private String faculty;
    private String rooms;
    private Date date;
    private Integer seats;
    private Timestamp timestamp;

    public ReservationEntry(String faculty, String rooms,Date date,int seats, Timestamp timestamp){
        this.faculty=faculty;
        this.rooms=rooms;
        this.date=date;
        this.seats=seats;
        this.timestamp=timestamp;
        
    }
    public String getFaculty(){
        return faculty;
    }
    
    public String getRooms(){
        return rooms;
    }
    
    public Date getDate(){
        return date;
    }
    
    public Integer getSeats(){
        return seats;
    }
    
    public Timestamp getTimeStamp(){
        return timestamp;
    }
    
}
    





