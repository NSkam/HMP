package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Admission_Application extends Application {
    
    public final static Type typea = Type.admission_appl;

    
    private Patient admited_patient;//O asthenhs pou eisagetai
    
    //Constructors
    public Admission_Application(){super();}
    
    public Admission_Application(Doctor submited_by, Type type, Patient admited_patient){
        super(submited_by, type);
        this.admited_patient = admited_patient;
    }
    
    //Setters and Getters
    public Patient getPatient(){
        return this.admited_patient;
    }
}
