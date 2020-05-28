package data;

import java.util.ArrayList;
/**
 *
 * @author Thodoris Tomadakis
 */
public class HeadDoctor extends Doctor{
    
    public static final String rank = "Head Doctor";
    private String supervisedClinic;
    private ArrayList <Doctor> supervised_doctors = new ArrayList <Doctor>();
    
    public HeadDoctor (int amka, String name, String speciality, Clinic doc_clinic, String sprv_clinic, ArrayList <Doctor> sprv_doc){
        super (amka, name, speciality, doc_clinic);
        supervisedClinic = sprv_clinic;
        for (int i = 0; i<= sprv_doc.size(); i++){
            supervised_doctors.add(i, sprv_doc.get(i));
        }
    }
    
    public void setOnCall(String cdate, Doctor d){
        (this.getClinic()).updateOnCallList(cdate, d.getAMKA());
    }
    
    public void setOnCall(String cdate, Doctor d, int index){
        (this.getClinic()).updateOnCallList(cdate, d.getAMKA(), index);
    }
}
