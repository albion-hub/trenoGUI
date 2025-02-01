import ex.IllegalNumException;

public abstract class Vagone {
    protected String matricola; 
    protected int lunghezzaInCentimetri;
    protected double pesoVuoto;  //peso a vuoto in quantità

    public Vagone(String matricola, int lunghezzaInCentimetri, double pesoVuoto) throws IllegalNumException{
        this.matricola = matricola;
        if(lunghezzaInCentimetri < 0){
            throw new IllegalNumException("la lunghezza del vagone non puo' essere negativa"); 
        }
        this.lunghezzaInCentimetri = lunghezzaInCentimetri;
        if(pesoVuoto < 0){
            throw new IllegalNumException("il peso a vuoto del vagone non puo' essere negativa"); 
        }
        this.pesoVuoto = pesoVuoto;
    }

    public Vagone() {
        this.matricola = "N/D";
        this.lunghezzaInCentimetri = 0;
        this.pesoVuoto = 0;
    }

    public String getMatricola() {return matricola;}
    public void setMatricola(String matricola) {this.matricola = matricola;}
    public int getLunghezzaInCentimetri() {return lunghezzaInCentimetri;}
    public void setLunghezzaInCentimetri(int lunghezzaInCentimetri) {this.lunghezzaInCentimetri = lunghezzaInCentimetri;}
    public double getPesoVuoto() {return pesoVuoto;}
    public void setPesoVuoto(double pesoVuoto) {this.pesoVuoto = pesoVuoto;}

    @Override
    public String toString() {
        return "Vagone [matricola=" + matricola + ", lunghezzaInCentimetri=" + lunghezzaInCentimetri + ", pesoVuoto="+ pesoVuoto + "]";
    }

    

}
