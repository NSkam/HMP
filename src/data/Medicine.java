/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

//import java.time.LocalDateTime;
/**
 *
 * @author John
 */
public class Medicine {
    
    
    private String name;
    private String type;
    private String recom_dosage;
    private String side_effects;
    //private Date date;
    private int remaining;
    
    public Medicine(){}
    public Medicine(String name,String type,String recom_dosage,String side_effects,int remaining){
        this.name = name;
        this.type = type;
        this.recom_dosage = recom_dosage;
        this.side_effects = side_effects;
        this.remaining = remaining;
    }
}
