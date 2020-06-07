package data;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.format.FormatStyle;
import java.text.ParseException;

/**
 *
 * @author Nikolaos Skamnelos & Thodoris Tomadakis
 * 
 * Klash gia thn Klinikh
 */
public class Clinic {
    private String name; //Onoma
    private int num_of_patients; //Arithmos Asthenwn
    private int head_doctor; //Dieuthinths Klinikhs
    private int num_staff; //Arithmos prosopikou
    private int num_Beds; //Arithos dwmatiwn
    private ArrayList<Patient> patient_list = new ArrayList<Patient>(200); //Lista Asthenwn
    private ArrayList<Doctor>personnel_list = new ArrayList<Doctor>(200); //Lista Prosopikou
    private ArrayList<OnCall>OnCall_list = new ArrayList<OnCall>(200); //lista efhmeriwn
    private ArrayList<Application>Application_list = new ArrayList<Application>(200); //lista aithsewn
    
    //Constructors
    public Clinic(){}
    public Clinic(String name, int num_of_patients, int head_doctor, int num_staff, int beds){
        this.name = name;
        this.num_of_patients = num_of_patients;
        this.head_doctor = head_doctor;
        this.num_staff = num_staff;
        this.num_Beds = beds;
    }
    
    //getters kai setters
    public ArrayList<Doctor> getPersonnel(){
        return this.personnel_list;
    }
    public String getName(){
        return this.name;

    public String getClinicName(){
        return name;
    } 
    public ArrayList<Patient> getPatientList(){
        return this.patient_list;
    }
    public int getNumStaff(){
        return this.num_staff;
    }
    
    public int getNumOfBeds(){
        return num_Beds;
    }
    
    public void setNumOfBeds(int beds){
        num_Beds = beds;
    }
    
    public ArrayList<OnCall> getOnCallList(){
        return OnCall_list;
    }
    
    //elegxei an sumpeftoun oi imeromhnies twn efhmeriwn
    public boolean checkOnCallDate(String ocdate1, String ocdate2){ //orismata -> 2 hmrnies os string
        try{  
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //formatter gia date auths ths morfhs
            Date d1 = formatter.parse(ocdate1); //metatrepoyme apo string se date simfona me to formatter
            Date d2 = formatter.parse(ocdate2);
        
            if ( d2.before(d1) || d2.after(d1)) //an i 2h imerominia einai prin h meta thn prwth 
                return true;
            else
                return false;
        }catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //prosthetei sth lista efhmeriwn
    public void addtoOnCallList(String cdate, int amka, Doctor d){
        int j = 0;
        for (int i = 0; i<OnCall_list.size(); i++){
            if ((OnCall_list.get(i)).getAMKAOnCall() == amka){
                j++; //vriskume poses efhmeries exei kapios
            }
        }
            
        OnCall oc = new OnCall(cdate,d, this.name, j+1); //neo antikeimeno efhmerias 
        OnCall_list.add((OnCall_list.size()), oc); // to prosthetoume sth lista
    }
    
    // allazeii thn hmeromhnia sthn efhmeria kapoiou opou index = thesh sth lista efhmeriwn kai j = arithmos efhmerias (borei na min xreiazetai)
    public void updateOnCallList(String cdate, int amka, int index, int j){ 
        if (j>0)
            for (int i = 0; i <OnCall_list.size(); i++)
                if ((OnCall_list.get(index)).getAMKAOnCall() == amka && ((OnCall_list.get(index)).getNum_OnCall()== j)) //an to amka kai o arithmos efhmerias teriazei
                    (OnCall_list.get(index)).setOnCallDate(cdate); //kane update sth lista 
    }
    
    // epistrefei lisa eisitiriwn
    public ArrayList<Application> getAdmissionApps(){
        ArrayList<Application>Admission_list = null; //arxikopoioyme lista me admission me null
        for (int i = 0; i< Application_list.size(); i++){
            if(( Application_list.get(i).getType()) == "Αίτηση Εισιτηρίου"){ // an o typos ths aithshs = eisitirio
                Admission_list = new ArrayList<Application>(); //ftiakse lista 
                Admission_list.add(Application_list.get(i)); //prosthese to antikeimeno
            }  
        }
        return Admission_list;
    }
    
    //epistrefei lista eksithriwn, antistoixa me panw
    public ArrayList<Application> getDischargeApps(){
        ArrayList<Application>Discharge_list = null;
        for (int i = 0; i< Application_list.size(); i++){
            if(( Application_list.get(i).getType()) == "Αίτηση Εξιτηρίου"){
                Discharge_list = new ArrayList<Application>();
                Discharge_list.add(Application_list.get(i));
            }  
        }
        return Discharge_list;
    }
    
    // kanei remove aithsh apo lista aithsewn
    public void updateAppList(Application app){
        Application_list.remove(app);        
    }
}
