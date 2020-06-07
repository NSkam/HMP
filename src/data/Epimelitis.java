package data;

/**
 *
 * @author Nikolaos Skamnelos
 * 
 * Klash gia tous Epimelites
 */
public class Epimelitis extends Doctor {
    
    private char rank = ' ';//o bathmos tou epimeliti
    private int num_of_eidik = 0; //Arithmos Eidikeuomenwn
    private int[] eidik = new int[100]; //Lista Eidikeuomenwn symfwna me ta AMKA tous
    
    //Contructor
    public Epimelitis(){}
    public Epimelitis(int amka, String name, String speciality, Clinic doc_clinic, char rank, int num_eidik){
        super(amka,name,speciality,doc_clinic);
        this.rank = rank;
        this.num_of_eidik=num_eidik;
    }
    
    //getters
    public char getRank(){
        return this.rank;
    }
}
