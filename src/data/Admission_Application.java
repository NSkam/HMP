package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Admission_Application extends Application {
    
    private Patient admited_patient = new Patient();//O asthenhs pou eisagete
    
    //Constructors
    public Admission_Application(){}
    
    public Admission_Application(Doctor submited_by, Type type, Patient admited_patient){
        super(submited_by, type);
        this.admited_patient = admited_patient;
    }
    
    public void setType(Type type){super.setType(type);}
}
