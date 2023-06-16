

package cz.itnetwork.pojistovna;
import java.util.Scanner;

/**
 *
 * @author JK
 */
public class Pojistovna {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        
        //Tímto si vytvořím instanci Klienta
        
        Klient klient = new Klient(); 
        String moznosti = "";
        while(!moznosti.equals("4")){
            klient.hlavniStranka();                  // hlavní stránka aplikace
            System.out.println();
            System.out.println("Zadejte prosím číslo pro spuštění pokynu a pokračuj pomocí klávesy ENTER");
            System.out.println();
            System.out.println("1 - Přidat nového klienta");
            System.out.println("2 - Zobrazit stávající klienty");
            System.out.println("3 - Vyhledej stávajícího klienta");
            System.out.println("4 - Ukončit program");
            moznosti = scanner.nextLine();
            System.out.println();

         // switch podmínky pro výběr možnosti uživatele
         
        switch(moznosti){
                
        case "1":
        klient.pridejKlienta();
        System.out.println();
        System.out.println("Klient byl založený.");
        break;
                
        case "2":
        klient.vypisKLienty();
        System.out.println();
        System.out.println("Pokračuj prosím další volbou");
        System.out.println();
        break;
                
        case "3":
        klient.vyhledejKlienta();
        System.out.println();
        System.out.println("Pokračuj prosím další volbou");
        System.out.println();
        break;
                  
        case "4":
        System.out.println("Konec programu");
        break;
        
        // pokud uživatel zvolí jinou možnost než 1-4 vypíše se chyba
        
        default:
        System.out.println("Použil jste neplatnou volbu, zvol prosím číslo 1 - 4 ");
            }
        }
    }
}

