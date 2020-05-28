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
    }