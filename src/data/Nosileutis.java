/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author John
 */
public class Nosileutis {
    
    private int amka;
    private String name;
    private Clinic clinic;
    private Doctor supervised_by;
    
    public Nosileutis() {}
    public Nosileutis(int amka,String name,Clinic clinic,Doctor supervised_by){
        this.amka = amka;
        this.name = name;
        this.clinic = clinic;
        this.supervised_by = supervised_by;
       }
    
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public int getAmka(){
        return this.amka;
    }
    public void setAmka(int amka){
        this.amka  = amka;
    }
    
    public Clinic getClinic(){
        return this.clinic;
    }
    public void setClinic(Clinic clinic){
        this.clinic = clinic;
    }
    
    public String getClinicName(){
        return this.clinic.getName();
    }
    
    public Doctor getSupervisedBy(){
        return this.supervised_by;
    }
    public void setSupervisedBy(Doctor doc){
        this.supervised_by = doc;
    }
    public String getDocName(){
        return this.supervised_by.getName();
    }
    }