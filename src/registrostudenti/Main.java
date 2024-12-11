package registrostudenti;
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Nota generale:
caricare link alla repo GitHub, entro le ore 12 e 45, e inserire in risposta all'annuncio il link alla repo caricata.

Gestione di un Registro di Studenti
Creare un programma Java che consenta di gestire un registro degli studenti. Il programma deve:
Registrare nuovi studenti con:
-Nome,
-Cognome,
-Matricola (univoca).

-Visualizzare l'elenco degli studenti.
-Cercare uno studente tramite la matricola.
Requisiti Tecnici:
-Creare una classe Studente con i campi necessari.
Utilizzare un ArrayList per memorizzare gli studenti.
Creare un menu testuale che permetta all'utente di:
-Aggiungere uno studente.
-Visualizzare tutti gli studenti.
-Cercare uno studente per matricola.
-Uscire dal programma

 */

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);   //Apertura scanner
       ArrayList<Studenti> studenti = new ArrayList<>(); // Creazione dell'Arraylista degli studenti

       while (true) {
       // Menu dove si accede alle funzioni
         System.out.println("MENU");
         System.out.println("1) Aggiungi studente");
         System.out.println("2) Visualizza tutti gli studenti");
         System.out.println("3) Cerca studente per matricola");
         System.out.println("4) Esci");
         System.out.print("Inserisci richiesta: ");     
         int scelta = scanner.nextInt();
         
         scanner.nextLine(); //per evitare che non dia errore nell inserimento degli attributi
         
         System.out.println("");

            if (scelta == 1) {
                // Aggiungiamo studente inserendo i suoi attributi
              System.out.println("Inserisci il nome: ");
              String nome = scanner.nextLine();
              System.out.println("Inserisci il cognome: ");
              String cognome = scanner.nextLine();
              System.out.println("Inserisci la matricola: ");
              String matricola = scanner.nextLine();
              
              // Crea lo studente e lo aggiunge nell' Arraylist
                studenti.add(new Studenti(nome, cognome, matricola));
                System.out.println("Studente aggiunto con successo!");
                
            } 
            else if (scelta == 2) {
                // Visualizza tutti gli studenti inseriti
                if (studenti.isEmpty()) {  //se l'Arraylist è vuoto
                    System.out.println("Nessun studente registrato."); //stampa messaggio
                } else {
                    System.out.println("\nElenco degli studenti:"); //altrimenti se ci sono elementi nell Arraylist
                    for (Studenti studente : studenti) {
                        System.out.println(studente);              //stampa elementi in tutta l Arraylist
                    }
                }
            } 
            else if (scelta == 3) {
                // Cerca uno studente per matricola inserita
                System.out.print("Inserisci la matricola da cercare: ");  //inseriamo matricola da cercare
                String matricolaRicerca = scanner.nextLine();
                boolean trovato = false;         //dichiarazione e inizializzazione variabile  booleana per trovare la matricola e si asegna false per dare per certo che la matricola non sia quella
                for (Studenti studente : studenti) {  //ciclo per verificare ogni elemnto dell'arraylist per trovare la matricola
                    if (studente.getMatricola().equals(matricolaRicerca)) { //verifichiamo se il valore inserito da utente è uguale a alla matricola della ricerca
                        System.out.println("Studente trovato: " + studente);
                        trovato = true; //se il valore è true allora la matricola è corretta
                        break;
                    }
                }  
                if (!trovato) {//se il valore è diverso
                    System.out.println("Studente non trovato con la matricola: " + matricolaRicerca); //stampa messaggio
                }
            } 
            else if (scelta == 4) {
                // Uscita dal programma
                System.out.println("Grazie e arrivederci!.");
                break;
            } 
            //Altrimenti non è corretto
            else {
                System.out.println("Opzione non valida. Riprova.");
            }
        }

        scanner.close(); //chiusura scanner
    }
}