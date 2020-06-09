package data;
import java.util.ArrayList;
/**
 *
 * @author Thodoris Tomadakis
 */
public class Hospital {
    private String name;  //onoma nosokomeioo
    private String dname; //onoma dioikhth
    private ArrayList<Clinic> Clinics_list = new ArrayList<Clinic>(15); //lista klinikwn nosokomeiou
    private ArrayList<Doctor> Doctors_list = new ArrayList<Doctor>(100); //lista giatrwn nosokomeiou
    private ArrayList<Patient> Patients_list = new ArrayList <Patient>(200); //lista asthenwn nosokomeiou
    
    //constructor
    public Hospital(String name1, String dname1, ArrayList <Clinic> clist, ArrayList <Doctor> dlist, ArrayList <Patient> plist){
        name = name1;
        dname = dname1;
        Clinics_list = clist; //Arxikopoihsh listas klinikwn
        Doctors_list = dlist;//Arxikopoihsh listas giatrwn
        Patients_list = plist; //Arxikopoihsh listas asthenwn        
    }
    
    //getters
    public String getName(){
        return name;
    }
    
    public String getDName(){
        return dname;
    }
    
    public ArrayList<Clinic> getClinicsList(){
        return Clinics_list;
    }
    
    public ArrayList<Doctor> getDoctorsList(){
        return Doctors_list;
    }
    
    public ArrayList<Patient> getPatientsList(){
        return Patients_list;
    }
    
    //epistrefei krevatia klinikwn
    public String[][] getAvailableClinicBeds(){
        String [][] ClinicBeds = new String[Clinics_list.size()][1]; //pinakas me grammes ises me plithos twn klinikwn kai 1 sthlh
        for (int i = 0; i<Clinics_list.size(); i++)
            ClinicBeds[i][0] = String.valueOf(Clinics_list.get(i).getNumOfBeds()); // vazume se kathe grammi ton arithmo twn krevatiwn ws String
        return ClinicBeds;
    }
    
    //enhmerwnei krevati klinikhs
    public void updateAvailableClinicBeds(Clinic c, int i){
        c.setNumOfBeds(i);
    }
}
