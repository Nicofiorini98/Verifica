package registrostudenti;
//Creazione della classe inserendo gli attributi
public class Studenti {
    private String nome;
    private String cognome;
    private String matricola;

    // Costruttore della classe Studente
    public Studenti(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    // Metodi per far ritornare i valori inseriti nel main
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getMatricola() {
        return matricola;
    }
    // Metodo per visualizzare le informazioni dello studente
    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Matricola: " + matricola;
    }
}