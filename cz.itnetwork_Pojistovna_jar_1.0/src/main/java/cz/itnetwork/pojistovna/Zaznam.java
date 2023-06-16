
package cz.itnetwork.pojistovna;

/**
 *
 * @author JK
 */
public class Zaznam {
    
   // vytvoření atributů Klienta
    
    private String jmeno;
 
    private String prijmeni;
  
    private int vek;

    private int telefon;
    
    //Založení instance Zaznam s @ param jmeno, přijemní, vek, telefon

    public Zaznam(String jmeno, String prijmeni, int vek, int telefon){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    // Getter Jméno

    public String getJmeno() {
        return jmeno;
    }

    // Setter Jméno
   
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    
    // Getter Příjmení

    public String getPrijmeni() {
        return prijmeni;
    }
    
    // Setter Příjmení
   
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }
    
    // Getter věk
   
    public int getVek() {
        return vek;
    }

    // Setter věk
   
    public void setVek(int vek) {
        this.vek = vek;
    }

    // Getter telefon
   
    public int getTelefon() {
        return telefon;
    }

    // Setter telefon
  
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
   
    // vrácení textové podobny pomocí toString
    
@Override
public String toString(){
    return jmeno + " " + prijmeni + " " + vek + " " + telefon;
}
}
    

