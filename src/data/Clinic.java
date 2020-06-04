package data;
import java.util.ArrayList;

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
    
    public String getName(){
        return this.name;
    }
}
