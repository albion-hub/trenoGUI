import ex.IllegalNumException;; 

public class Merci extends Vagone{
    private double caricoMassimo; // in quintali
    private double caricoAttuale; // in quintali

    public Merci(String matricola, int lunghezzaInCentimetri, double pesoVuoto, double caricoMassimo,double caricoAttuale) throws IllegalNumException{
        super(matricola, lunghezzaInCentimetri, pesoVuoto);
        if(caricoMassimo < 0){
            throw new IllegalNumException("il carico massimo del vagone non puo' essere negativa"); 
        }
        this.caricoMassimo = caricoMassimo;
        if(caricoAttuale > caricoMassimo || caricoAttuale < 0){
            throw new IllegalNumException("il carico attuale del vagone non puo' essere negativa o essere maggiore del carico massimo"); 
        }
        this.caricoAttuale = caricoAttuale;
    }
    public Merci() {
        super();
        this.caricoMassimo = 0;
        this.caricoAttuale = 0;
    }
    public double getCaricoMassimo() {return caricoMassimo;}
    public void setCaricoMassimo(double caricoMassimo) {this.caricoMassimo = caricoMassimo;}
    public double getCaricoAttuale() {return caricoAttuale;}
    public void setCaricoAttuale(double caricoAttuale) {this.caricoAttuale = caricoAttuale;}
    
    @Override
    public String toString() {
        return "vagone Merci [caricoMassimo=" + caricoMassimo + ", caricoAttuale=" + caricoAttuale + "]";
    }
}
