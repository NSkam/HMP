package data;

/**
 * @author Thodoris Tomadakis
 */
public class OnCall {
    private String onCallDate; //hmeromhnia efhmerias
    private String clinicName; //kliniki pou tha einai h efhmeria
    private int num_OnCall; //arithmos efhmerias p.x 1 atomo borei na exei 3 efhmeries 
    private Doctor d;
    
    //constructor
    public OnCall (String onCallDt, Doctor d1, String cl_name, int num){
        onCallDate = onCallDt;
        clinicName = cl_name;
        if (num>0) 
            num_OnCall = num;
        else
            num_OnCall = 1;
        d = d1;
    }
    
    //getters & setters
    public String getOnCallDate(){
        return onCallDate;
    }
    
    public Doctor getOnCallDoc(){
        return this.d;
    }
    
    public void setOnCallDate(String cdate){
        onCallDate  = cdate;
    }
    
    public int getAMKAOnCall(){
        return this.d.getAMKA();
    }
    
    public String getClinicName(){
        return clinicName;
    }
    
    public void setClinicName(String cname){
        clinicName = cname;
    }
    
    public int getNum_OnCall(){
        return num_OnCall;
    }
}




