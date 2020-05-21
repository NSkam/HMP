package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Patient {
    private int amka;
    private String name;
    private int age;
    private String patient_history;
    private String patient_cond;
    private Doctor supervised_by;
    enum status_enum{
        excellent, good, ok, bad, very_bad, life
    }
    status_enum status;
    
    public Patient(int amka, String name, int age, String patient_history, String patient_cond, Doctor supervised_by, status_enum status){
        this.amka = amka;
        this.name = name;
        this.age = age;
        this.patient_history = patient_history;
        this.patient_cond = patient_cond;
        this.supervised_by = supervised_by;
        this.status = status;
    }
    
    public Patient(){}
    
    public boolean CheckDocPermissions(int AMKA, String Permissions){
        
        if(Permissions.equals("Check")){
            if(AMKA == this.supervised_by.getAMKA()){return true;}
            for(int i=0 ; i<this.supervised_by.getClinic().getNumStaff(); i++){
                if(AMKA == this.supervised_by.getClinic().getPersonnel()[i]){
                    return true;
                }
            }
        }
        else if(Permissions.equals("Change")){if(AMKA == this.supervised_by.getAMKA()){return true;}
        }
        return false;
    }
    
    //Setters kai Getters
    public void setSupervisedBy(int amka){
        this.supervised_by.setAMKA(amka);
    }
    public Doctor getSupervisedBy(){
        return this.supervised_by;
    }
}
