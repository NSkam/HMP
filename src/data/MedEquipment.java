/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.util.Date;
/**
 *
 * @author John
 */
public class MedEquipment {
    private String name;
    private String type;
    private Date date;
    private int remaining;
    
    public MedEquipment(){}
    public MedEquipment(String name,String type,Date date,int remaining){
        this.name = name;
        this.type = type;
        this.date = date;
        this.remaining = remaining;
    }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    
    public Date getDate(){
        return this.date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    
    public int getRemaining(){
        return this.remaining;
    }
    public void setRemaining(int remaining){
        this.remaining = remaining;
    }
    
}
