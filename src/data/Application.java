package data;

import java.util.Date;
        
/**
 *
 * @author Nikolaos Skamnelos
 */
public class Application {
    
    public static int counter = 0;//Counter pou metraei ta applications gia to id
    private int id = 0;//to id kathe application
    private Date date = new Date();//Hmeronymia ypobolis
    private Doctor submited_by = new Doctor();//Apo poion giatro ypoblithike
    //To status tou application
    public enum Status_enum{
        approved, rejected, in_progress, not_available;
    }
    Status_enum status = Status_enum.not_available;
    //To eidos tou application
    public enum Type{
        admission_appl , discharge_appl, exam_appl, transfer_appl, not_available
    }
    Type type = Type.not_available;
    
    //Constructors
    public Application(Doctor submited_by, Type type){
        counter++;
        this.id=counter;
        this.submited_by = submited_by;
        this.date = new Date();
        this.status = Status_enum.in_progress;
        this.type = type;
    }
    
    public Application(){
        this.id=counter;
        this.date = new Date();
        this.status = Status_enum.in_progress;
    }
    
    //Setters and Getters
    public int getID(){
        return this.id;
    }
    public Date getDate(){
        return this.date;
    }
    public Doctor getDoctor(){
        return this.submited_by;
    }
    public void setDoctor(Doctor doc){
        this.submited_by = doc;
    }
    public String getStatus(){
    
        switch (this.status) {
        
            case approved:
                return "Approved";
            case rejected:
                return "Rejected";
            case in_progress:
                return "In Progress";
            default:
                return "Not Available";
        
        }    
    }
    public String getType(){
    
        switch (this.type) {
        
            case admission_appl:
                return "Αίτηση Εισιτηρίου";
            case discharge_appl:
                return "Αίτηση Εξιτηρίου";
            case exam_appl:
                return "Αίτηση για εξέταση σε άλλη κλινίκη";
            case transfer_appl:
                return "Αίτηση για μεταφορά σε άλλη κλινική";
            default:
                return "Not Available";
        
    }   
  }
    
    public void setType(Type type){
        this.type = type;
    }
    public void IncID(){
        counter++;
        this.id= counter;
    }
}
