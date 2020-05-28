package data;

import java.util.ArrayList;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Application_History {
    
    Doctor history_of = new Doctor();//Giatros pou tou anoikei to sygekrimeno application_history
    ArrayList<Application> appl_history = new ArrayList<Application>(200);//H Lista
    
    //Constructor
    public Application_History(Doctor history_of){
    
        this.history_of = history_of;
        this.appl_history = new ArrayList<Application>(200);
    
    }
    
    //Setters and Getters
    public ArrayList<Application> getApplHistory(){
        return this.appl_history;
    }
    
    //Prosthetei ena neo application sto history
    public void updateAppHistory(Application appl_to_save){
        this.appl_history.add(appl_to_save);
    }
}
