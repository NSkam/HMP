package data;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Nikolaos Skamnelos
 * 
 * Klash gia thn Klinikh
 */
public class Clinic {
    private String name; //Onoma
    private int num_of_patients; //Arithmos Asthenwn
    private int head_doctor; //Dieuthinths Klinikhs
    private int num_staff; //Arithmos prosopikou
    private ArrayList<Patient> patient_list = new ArrayList<Patient>(200); //Lista Asthenwn
    private ArrayList<Doctor>personnel_list = new ArrayList<Doctor>(200); //Lista Prosopikou
    private ArrayList<OnCall>OnCall_list = new ArrayList<OnCall>(); //lista efhmeriwn
    //Constructors
    public Clinic(String name, int num_of_patients, int head_doctor, int num_staff){
        this.name = name;
        this.num_of_patients = num_of_patients;
        this.head_doctor = head_doctor;
        this.num_staff = num_staff;
    }
    
    public Clinic(){}
    
    //getters kai setters
    public ArrayList<Doctor> getPersonnel(){
        return this.personnel_list;
    }
    public int getNumStaff(){
        return this.num_staff;
    }
    
    public ArrayList<OnCall> getOnCallList(){
        return OnCall_list;
    }
    
    public boolean checkOnCallDate(String ocdate1, String ocdate2){
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy", Locale.ENGLISH);
        LocalDate d1 = LocalDate.parse(ocdate1, formatter);
        LocalDate d2 = LocalDate.parse(ocdate2, formatter);
        
        if ( d2.isBefore(d1) || d2.isAfter(d1))
            return true;
        else
            return false;
    }
    
    public void updateOnCallList(String cdate, int amka){
        int j = 0;
        for (int i = 0; i<= OnCall_list.size(); i++){
            if ((OnCall_list.get(i)).getAMKAOnCall() == amka){
                j++;
            }
        }
            
        OnCall oc = new OnCall(cdate,amka, name, j);
        OnCall_list.add((OnCall_list.size()+1), oc);
    }
    
    public void updateOnCallList(String cdate, int amka, int index){ 
        if ((OnCall_list.get(index)).getAMKAOnCall() == amka)
                (OnCall_list.get(index)).setOnCallDate(cdate);
    }
}   
