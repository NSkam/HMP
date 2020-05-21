package data;

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
    private int[] patient_list = new int[2000]; //Lista Asthenwn
    private int[] personnel_list = new int[500]; //Lista Prosopikou
    
    //Constructors
    public Clinic(String name, int num_of_patients, int head_doctor, int num_staff){
        this.name = name;
        this.num_of_patients = num_of_patients;
        this.head_doctor = head_doctor;
        this.num_staff = num_staff;
    }
    
    public Clinic(){}
    
    //getters kai setters
    public int[] getPersonnel(){
        return this.personnel_list;
    }
    public int getNumStaff(){
        return this.num_staff;
    }
}
