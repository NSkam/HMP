package data;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Patient {
    private int amka;//AMKA
    private String name;//ONOMA
    private int age;//Hlikia
    private String patient_history;//Istoriko Asthenh
    private String patient_cond;//Istoriko pathisewn Asthenh
    private Doctor supervised_by;//Ypeuthinos Iatros
    public enum status_enum{
        excellent, good, ok, bad, very_bad, life_threatening
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
    public int getAmka(){
        return this.amka;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getHistory(){
        return this.patient_history;
    }
    public String getConditions(){
        return this.patient_cond;
    }
    public void setSupervisedBy(int amka){
        this.supervised_by.setAMKA(amka);
    }
    public Doctor getSupervisedBy(){
        return this.supervised_by;
    }
    public String getStatus(){
    
        switch (this.status) {
        
            case excellent:
                return "Excellent";
            case good:
                return "Good";
            case ok:
                return "OK";
            case bad:
                return "Bad";
            case very_bad:
                return "Very Bad";
            case life_threatening:
                return "Life Threatening";
            default:
                return "Not Available";
        
        }

    }
    public void setStatus(status_enum status){
    
        this.status = status;
    }
    
    public Patient getPatientInfo(){
        return this;
    }
}
