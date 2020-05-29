package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Admission_Application extends Application {
    
    /***********************************
    
    public final static Type type = Type.admission_appl;
    
    ***********************************/
    
    private Patient admited_patient = new Patient();//O asthenhs pou eisagete
    
    //Constructors
    public Admission_Application(){super();}
    
    public Admission_Application(Doctor submited_by, Type type, Patient admited_patient){
        super(submited_by, type);
        this.admited_patient = admited_patient;
    }
    
        
    /***********************************
    public Admission_Application(Doctor submited_by, Patient admited_patient){
        super();
        super.setDoctor(submited_by);
        this.admited_patient = admited_patient;
    }
    ***********************************/
    
    //Setters and Getters
    public void setType(Type type){super.setType(type);}
    public Patient getPatient(){
        return this.admited_patient;
    }
    public void setDoctor(Doctor doc){super.setDoctor(doc);}
}
