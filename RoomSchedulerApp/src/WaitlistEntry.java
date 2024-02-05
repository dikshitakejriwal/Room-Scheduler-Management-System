
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
public class WaitlistEntry {
    private String faculty;
    private Date date;
    private int seats;
    private Timestamp timestamp;
    
    public WaitlistEntry(String faculty, Date date,int seats, Timestamp timestamp){
        this.faculty=faculty;
        this.date=date;
        this.seats=seats;
        this.timestamp=timestamp;
    }
    
        public String getFaculty(){
        return faculty;
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
