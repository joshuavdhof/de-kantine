
/**
 * Write a description of class Persoon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persoon
{
    // instance variables - replace the example below with your own
    private int burgerServiceNummer;
    private String voornaam;
    private String achternaam;
    private String temporary;
    private int geboorteDag;
    private int geboorteMaand;
    private int geboorteJaar;
    private String geslacht;
    boolean isSchrikkeljaar;
    boolean geldigeDag;
    private String temp;
    private char nieuweGeslacht;

    /**
     * Constructor for objects of class Persoon
     * alle functies die onder vermeld staan worden aangeroepen
     */
    public Persoon(int burgerServiceNummer, String voornaam, String achternaam, int geboorteDag, int geboorteMaand, int geboorteJaar, char geslacht)
    {
        setBurgerServiceNummer(burgerServiceNummer);
        setVoornaam(voornaam);
        setAchternaam(achternaam);
        setGeboorteDatum(geboorteDag, geboorteMaand, geboorteJaar);
        setGeslacht(geslacht);

    }
    
    public Persoon(){
        geboorteDag = 0;
        geboorteMaand = 0;
        geboorteJaar = 0;
        nieuweGeslacht = 'x';
    }
    
    /**
     * 
     */
    public void setBurgerServiceNummer(int BurgerServiceNummer)
    {
        this.burgerServiceNummer = burgerServiceNummer;
    }

    /**
     * 
     */
    public void setVoornaam(String voornaam)
    {
        this.voornaam = voornaam;
    }

    /**
     * 
     */
    public void setAchternaam(String achternaam)
    {
        this.achternaam = achternaam;
    }

    /**
     * 
     */
    public void setGeboorteDatum(int geboorteDag, int geboorteMaand, int geboorteJaar)
    {
        switch (geboorteMaand){
            case 1 : 
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10:
            case 12:
            if (geboorteDag >= 1 && geboorteDag <= 31){
                this.geboorteDag = geboorteDag;
                geldigeDag = true;
            }
            else {
                System.out.println ("Dag voldoet niet aan de voorwaarden."); 
            }
            break ;
            case 4 :
            case 6 :
            case 9 :
            case 11:
            if (geboorteDag >= 1 && geboorteDag <= 30){
                this.geboorteDag = geboorteDag;
                geldigeDag = true;
            }
            else {
                System.out.println ("Dag voldoet niet aan de voorwaarden deze maand heeft geen 31 dagen.");

            }
            break ;
            case 2 :
            if(geboorteJaar % 4 == 0)
            {
                if((geboorteJaar % 100 == 0) && (geboorteJaar % 400 != 0))
                {
                    isSchrikkeljaar = false;
                }
                else
                {
                    isSchrikkeljaar = true;
                }
            }
            else
            {
                isSchrikkeljaar = false;
            }           

            if(isSchrikkeljaar == false)
            {
                if(geboorteDag >= 1 && geboorteDag <= 28){
                    geboorteDag = geboorteDag;
                    geldigeDag = true;
                }
                else{
                    geboorteDag = 0;
                    geldigeDag = false;
                    System.out.println ("deze maand gaat maar tot 28 dagen");
                }
            }

            if(isSchrikkeljaar == true)
            {
                if(geboorteDag >= 1 && geboorteDag <= 29){
                    geboorteDag = geboorteDag;
                    geldigeDag = true;
                }
                else{
                    geboorteDag = 0;
                    geldigeDag = false;
                    System.out.println ("deze maand gaat maar tot 29 dagen");
                }
            }
            break ;
        }

        if (geboorteMaand >= 1 && geboorteMaand <= 12 && geldigeDag == true){
            this.geboorteMaand = geboorteMaand;
        }
        else {
            System.out.println ("Maand voldoet niet aan de voorwaarden.");
            geboorteMaand = 0;
        }

        if (geboorteJaar >= 1900 && geboorteJaar <= 2100 && geldigeDag == true){
            this.geboorteJaar = geboorteJaar;
        }
        else {
            System.out.println ("Jaar voldoet niet aan de voorwaarden.");
            geboorteJaar = 0;
        }        
    }

    /**
     * word het geslacht mee ingevoerd
     */
    public void setGeslacht(char geslacht)
    {
        if (geslacht == 'm' || geslacht == 'v'){

            if (geslacht == 'm'){
                this.geslacht = "man";
            }

            if (geslacht == 'v'){
                this.geslacht = "vrouw";        
            }
        }
        else {
            System.out.println ("geslacht moet m of v zijn");  
        }
    }

    /**
     * Getter voor geboortedatum
     * @return Geboortedatum 
     */
    public String getGeboorteDatum() {
        if (geboorteDag==0 && geboorteMaand==0 && geboorteJaar==0) {
            temp="Onbekend";
        } else {
            temp=geboorteDag+"/"+geboorteMaand+"/"+geboorteJaar;
        }
        return temp;
    }

    public String getVoorNaam(){
        return voornaam;
    }
    
    public String getAchterNaam(){
        return achternaam;
    } 
    
    /**
     * geeft het opgegeven burgerServiceNummer weer
     */
    public int getBurgerServiceNummer(){
        return burgerServiceNummer;
    }
    
    /**
     * geeft het opgegeven geslacht weer
     */
    public String getGeslacht(){
        if(geslacht == "man" || geslacht == "vrouw"){
            return geslacht;
        }
        else {
            return "onbekent";
        }
    }
    
    /**
     * print alle ingevoerde informatie uit
     */
    public void drukAf(){
        System.out.println("BSN :" + burgerServiceNummer);
        System.out.println("voornaam :" + voornaam);
        System.out.println("achternaam :" + achternaam);
        System.out.println("geboortedatum :" + geboorteDag + "/" + geboorteMaand + "/" + geboorteJaar);
        System.out.println("geslacht :" + geslacht);       
    }
}