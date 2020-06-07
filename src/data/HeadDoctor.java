package data;

import java.util.ArrayList;
/**
 *
 * @author Thodoris Tomadakis
 */
public class HeadDoctor extends Doctor{
    
    public static final String rank = "Head Doctor"; //panta tha einai head doctor
    private String supervisedClinic =" "; //kliniki poy epilvepei
    private ArrayList <Doctor> supervised_doctors = new ArrayList <Doctor>(100); //giatrous poy epivlepei
    
    //Constructors
    public HeadDoctor(){}
    
    public HeadDoctor (int amka, String name, String speciality, Clinic doc_clinic, String sprv_clinic, ArrayList <Doctor> sprv_doc){
        super (amka, name, speciality, doc_clinic);
        supervisedClinic = sprv_clinic;
        supervised_doctors = sprv_doc;
        
    }
    
    //setters 
    
    //prosthetei nea efhmeria
    public void addOnCall(String cdate, Doctor d){
        (this.getClinic()).addtoOnCallList(cdate, d.getAMKA(), d);
    }
    
    //enhmerwnei hmeromhnia sugkekrimenhs efhmerias
    public void setOnCall(String cdate, Doctor d, int index, int efhm_j){
        (this.getClinic()).updateOnCallList(cdate, d.getAMKA(), index, efhm_j);
    }
    
    //kanei approve aithsh
    public void approveApp( Application app){
       app.setStatus(Application.Status_enum.approved);
    }
    
    // kanei reject aithsh
    public void rejectApp( Application app){
       app.setStatus(Application.Status_enum.rejected);
    }
}   
    
