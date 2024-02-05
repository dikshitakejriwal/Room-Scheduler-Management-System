/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dikshitakejriwal
 */
public class RoomEntry {
    private String name;
    private Integer seats; 
    
    public RoomEntry(String name, int seats){
        this.name=name;
        this.seats=seats;      
    }
    
    public String getName(){
        return name;
    }
    
    public Integer getSeats(){
        return seats;
    }

}
