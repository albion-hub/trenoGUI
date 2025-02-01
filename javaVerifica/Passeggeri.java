import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import ex.IllegalNumException;

public class Passeggeri extends Vagone{ //vagone passegeri

    private int numeroPasseggeri;
    private ArrayList<Passeggero> elencoPasseggeri;
    private int passageriMagioreni = 0;

    public Passeggeri(String matricola, int lunghezzaInCentimetri, double pesoVuoto, int numeroPasseggeri) throws IllegalNumException {
        super(matricola, lunghezzaInCentimetri, pesoVuoto);
        if(numeroPasseggeri < 0 || numeroPasseggeri > 60){
            throw new IllegalNumException("il numero dei passegeri attuali non puo essere negativo o maggiore di 60"); 
        }
        this.elencoPasseggeri = new ArrayList<>();  
        this.numeroPasseggeri = numeroPasseggeri; 
    } 
    public void addPasseggero(Passeggero p){
        this.elencoPasseggeri.add(p); 
        if(checkPassegeriMaggioreni(p)){
            passageriMagioreni++;
        }
    } 
    public void addPasseggero(String cognome, String nome, LocalDate dataNascita){
        this.elencoPasseggeri.add(new Passeggero(cognome,nome,dataNascita));
        if(checkPassegeriMaggioreni(new Passeggero(cognome,nome,dataNascita))){
            passageriMagioreni++;
        } 
    }

    public int getNumeroPasseggeri() {return numeroPasseggeri;}
    public ArrayList<Passeggero> getElencoPasseggeri() {return elencoPasseggeri;}

    private boolean checkPassegeriMaggioreni(Passeggero p){
        return true ? ( Period.between(p.getDataNascita(),LocalDate.now()).getYears() >= 18) : false; 
    }    
    @Override
    public String toString() {
        return "Passeggeri [numeroPasseggeri=" + numeroPasseggeri + ", elencoPasseggeri=" + elencoPasseggeri + "]";
    }
    public int getPassageriMagioreni() {
        return passageriMagioreni;
    }
}
