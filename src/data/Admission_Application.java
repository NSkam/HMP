package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Admission_Application extends Application {

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
