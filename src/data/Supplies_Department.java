/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import data.Medicine;
import data.MedEquipment;

/**
 *
 * @author John
 */
public class Supplies_Department {
    private String medicine;
    private String supplies;
    
    public String getMaterialInfo(){
        return "Medicine: " + medicine;
    }
    
    public String getMedEquipmentInfo(){
        return "Medical Supplies: " + supplies;
    }
    
}
