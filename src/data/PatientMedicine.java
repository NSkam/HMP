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
public class PatientMedicine extends Medicine{
    
    private String patient_name;
    //private Medicine medicine;
    private Patient taken_by;
    //private String type;
    //private String dosage;
    public PatientMedicine(){}
    public PatientMedicine(String patient_name, Patient taken_by,String medName,String type,String recom_dosage,String side_effects,int remaining){
        //Medicine med = new Medicine(medName,type,recom_dosage,side_effects,remaining);
        setType(type);
        setName(medName);
        setDosage(recom_dosage);
        setSideEffects(side_effects);
        setQuantity(remaining);
        this.patient_name = patient_name;
        this.taken_by = taken_by;
        //this.medicine = med;
    }
    
    /*public Medicine getMeds(){
        return medicine;
    }*/
    
    public Patient getPatient(){
        return taken_by;
    }
    //public String displayPills(){
        
    //}
}
