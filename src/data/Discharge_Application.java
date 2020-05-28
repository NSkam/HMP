package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Discharge_Application extends Application {
        
    private Patient discharged_patient = new Patient();//O asthenhs pou pairnei e3itirio
    
    //Constructors
    public Discharge_Application(){super();}
    
    public Discharge_Application(Doctor submited_by, Application.Type type, Patient discharged_patient){
        super(submited_by, type);
        this.discharged_patient = discharged_patient;
    }
    
    //Setters and Getters
    public void setType(Type type){super.setType(type);}
    public Patient getPatient(){
        return this.discharged_patient;
    }
    public void setDoctor(Doctor doc){super.setDoctor(doc);}
}
