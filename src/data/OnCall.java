package data;

/**
 * @author Thodoris Tomadakis
 */
public class OnCall {
    private String onCallDate;
    private int AMKAOnCall;
    private String clinicName;
    private int num_OnCall;
    
    public OnCall (String onCallDt, int amka, String cl_name, int num){
        onCallDate = onCallDt;
        AMKAOnCall = amka;
        clinicName = cl_name;
        num_OnCall = num;
    }
    
    public String getOnCallDate(){
        return onCallDate;
    }
    
    public void setOnCallDate(String cdate){
        onCallDate  = cdate;
    }
    
    public int getAMKAOnCall(){
        return AMKAOnCall;
    }
    
    public void setAMKAOnCall(int AMKA){
        AMKAOnCall = AMKA;
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




