
package cz.itnetwork.pojistovna;
import java.util.ArrayList;
/**
 *
 * @author JK
 */
public class Databaze {
    
    // Nová kolekce záznamy Klientů
   
    private ArrayList<Zaznam> zaznamy;
    
    // vnoreni kolekce do objektu
   
    public Databaze(){
        zaznamy = new ArrayList<>();
    }
    
    // Metoda přidej záznam Klienta

    public void pridejKlienta(String jmeno, String prijmeni, int vek, int telefon){
        zaznamy.add(new Zaznam(jmeno,prijmeni,vek,telefon));
    }
    
    // Metoda najdi záznam Klienta

    public ArrayList<Zaznam> vyhledejKlienta(String jmeno, String prijmeni){
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for(Zaznam zaznam : zaznamy){
            if(jmeno.equals(zaznam.getJmeno()) && prijmeni.equals(zaznam.getPrijmeni())){
            nalezene.add(zaznam);  
            }
           
        }
    return nalezene;    
    }
    
    public ArrayList<Zaznam> getVsechnyZaznamy(){
        return zaznamy;
    }
    
}
