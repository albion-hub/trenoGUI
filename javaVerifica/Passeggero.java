import java.time.LocalDate;


public class Passeggero {
    private int codice; // calcolato automatico e univoco, 
    private String cognome;
    private String nome;
    private LocalDate dataNascita;
    
    private static int c = 0; 

    public Passeggero(String cognome, String nome, LocalDate dataNascita) {
        this.codice = ++c;
        this.cognome = cognome;
        this.nome = nome;
        this.dataNascita = dataNascita;
    }

    public Passeggero() {
        this.codice = 0;
        this.cognome = "N/D";
        this.nome = "N/D";
        this.dataNascita = LocalDate.of(0, 0, 0);
    }

    public int getCodice() {return codice;}
    public void setCodice(int codice) {this.codice = codice;}
    public String getCognome() {return cognome;}
    public void setCognome(String cognome) {this.cognome = cognome;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public LocalDate getDataNascita() {return dataNascita;}
    public void setDataNascita(LocalDate dataNascita) {this.dataNascita = dataNascita;}
    public static int getC() {return c;}
    public static void setC(int c) {Passeggero.c = c;}

    @Override
    public String toString() {
        return "Passeggero [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", dataNascita="+ dataNascita + "]";
    }    

    
}
