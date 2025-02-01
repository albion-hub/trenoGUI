

import java.util.ArrayList;

public class Treno {
    private ArrayList<Vagone> treno;
    public Treno() {
        this.treno = new ArrayList<>(0); 
    } 

    public void addVagoneMerci(Merci m){
        this.treno.add(m); 
    }
    public void addVagonePassegerri(Passeggeri p){
        this.treno.add(p); 
    }

    @Override
    public String toString() {
        String r = "lista vagoni: \n"; 
        for (Vagone vagone : treno)
            r+= vagone + "\n";
        return r; 
    }

    public int lunghezzaTotale(){
        int sum = 0; 
        for (Vagone vagone : treno) 
            sum += vagone.getLunghezzaInCentimetri(); 
        return sum; 
    }

    public double pesoTotale(){
        double sum = 0;
        for (Vagone vagone : treno)
            if(vagone instanceof Merci)
                sum += ((Merci)vagone).getCaricoAttuale(); 
            else
                sum +=  (double)((((Passeggeri)vagone).getElencoPasseggeri()).size() * 70)/1000;   //scopro grazie al size quanti passageri ci sono e faccio una stima
        return sum; 
    }
 
    public int passageriMagioreni(){
        int sum = 0; 
        for (Vagone vagone : treno)
            if(vagone instanceof Passeggeri)
                sum += ((Passeggeri)vagone).getPassageriMagioreni();
        return sum;
    }
}
