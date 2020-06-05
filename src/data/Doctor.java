package data;

import java.util.ArrayList;
/**
 *
 * @author Nikolaos Skamnelos
 * Klash gia tous giatrous
 */
public class Doctor extends MedicalStaff {
    
    private int amka=1;  //AMKA
    private String name=" "; //Onoma kai epwnymo
    private String speciality= " "; //Eidikothta
    private Clinic doc_clinic = new Clinic(); //Klinikh pou briskete o giatros
    private ArrayList<Patient> patient_list = new ArrayList<Patient>(200); // Lista me tous astheneis tou giatrou
    //Constructor
    public Doctor(){}
    
    public Doctor(int amka, String name, String speciality, Clinic doc_clinic){
        
        this.amka = amka;
        this.name = name;
        this.speciality = speciality;
        this.doc_clinic = doc_clinic;
    }
    
    //Getters kai Setters
    public int getAMKA(){
        return this.amka;
    }
    
    public void setAMKA(int amka_set){
        this.amka = amka_set;
    }
    
    public String getName(){
        return this.name;
    }
    
    public ArrayList<Patient> getPatientList(){
        return this.patient_list;
    }
    
    public void setPatientList(ArrayList<Patient> PatList){
        this.patient_list.clear();
        for(int i=0; i<PatList.size(); i++){
            this.patient_list.add(PatList.get(i));
        }
    }
    
    public Clinic getClinic(){
        return this.doc_clinic;
    }

    
    public String getSpeciality(){
        return speciality;
    }
  

    public void setClinic(Clinic clinic){
        this.doc_clinic = clinic;
    }
}

