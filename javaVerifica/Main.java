import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Treno treno = new Treno();
        try {
            Merci m = new Merci("1", 200, 5, 10,7); 
            Passeggero p = new Passeggero("Shabani", "Albion", LocalDate.of(2007, 8, 12)); 
            Passeggero p2 = new Passeggero("pogliacomi", "riccardo", LocalDate.of(2007, 8, 4) ); 
            Passeggeri vp = new Passeggeri("2", 300, 5, 60); 

            vp.addPasseggero(p);
            vp.addPasseggero(p2);
            
            treno.addVagonePassegerri(vp);
            treno.addVagoneMerci(m);
            
            System.out.println(vp.getElencoPasseggeri());
            
            System.out.println(treno);
            System.out.println(treno.lunghezzaTotale());
            System.out.println(treno.pesoTotale());
            System.out.println(treno.passageriMagioreni());

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}