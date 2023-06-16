package cz.itnetwork.pojistovna;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author JK
 */
public class Klient {
    
    private Databaze databaze;    
    /**
     * Vytvoření scanneru pro příjem dat od uživatela
     */
    private Scanner scanner = new Scanner(System.in, "Windows-1250");

    public Klient(){                      // Konstruktor Klienta
        databaze = new Databaze();
        
    }
    
     //Metoda pro přidání klienta 
    
    public void pridejKlienta(){
        System.out.println("Zadej prosím jméno Klienta:");
        String jmeno = scanner.nextLine().trim();
        System.out.println("Zadej prosím příjmení Klienta:");
        String prijmeni = scanner.nextLine().trim();
        System.out.println("Zadej prosím věk Klienta:");
        int vek = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("Zadej prosím Klientův telefon:");
        int telefon = Integer.parseInt(scanner.nextLine().trim());
        databaze.pridejKlienta(jmeno, prijmeni, vek, telefon);
    }
    
    // Metoda pro vypsání seznamu klientů 
     
    public void vypisKLienty(){
        ArrayList<Zaznam> zaznamy = databaze.getVsechnyZaznamy();
        for(Zaznam zaznam : zaznamy){
            System.out.println(zaznam);    
        }
        if(zaznamy.size() == 0)
            System.out.println("Žádní klienti nenalezeni.");
    }
    
     //Metoda pro vyhledání zaznamu KLienta
    
    public void vyhledejKlienta(){
        
        System.out.println("Zadej jméno stávajícího Klienta:");
            String jmeno = scanner.nextLine().trim();
        System.out.println("Zadej příjméní stávajícího Klienta:");
            String prijmeni = scanner.nextLine().trim();
        System.out.println();    
        ArrayList<Zaznam> zaznamy = databaze.vyhledejKlienta(jmeno, prijmeni);
        
        if(zaznamy.size() > 0) {
            
            for(Zaznam zaznam : zaznamy){
                System.out.println(zaznam);
            }
        }
        else{
            System.out.println("Žádní klienti nenalezeni");
        }
    }
 
     //Metoda pro vypsání hlavní stránky
     
    public void hlavniStranka(){
        System.out.println("xxxxxxxxxxxxxxxxxxx");
        System.out.println();
        System.out.println("Databáze klientů");
        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxx");
    }
}

