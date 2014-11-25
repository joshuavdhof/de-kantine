
/**
 * Write a description of class Artikel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Artikel
{
    // instance variables - replace the example below with your own
    private int prijs;
    private String naam;

    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String naamArtikel, int prijsArtikel)
    {
        prijs = prijsArtikel;
        naam = naamArtikel;
    }

    /**
     * met deze methode kun je een object maken zonder parameters op te geven
     */
    public Artikel (){

    }

    /**
     * Wijst artikel een prijst toe
     */
    public void setArtikelPrijs(int prijs){
        this.prijs = prijs;
    }

    /**
     * Wijst artikel een naam toe
     */
    public void setArtikelNaam(String naam){
        this.naam = naam;
    }

    /**
     * Geeft prijs weer
     */
    public int getArtikelPrijs(){
        return prijs;
    }

    /**
     * Geeft naam weer
     */
    public String getArtikelNaam(){
        return naam;
    }
    
   /**
    * drukt alle gegevens af
    */
    public void drukAf(){
        System.out.println(prijs);
        System.out.println(naam);

    }
}
