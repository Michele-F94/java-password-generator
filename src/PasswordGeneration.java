
import java.util.Scanner;

public class PasswordGeneration {
    public static void main(String[] args) {
       
         // Creazione di uno scanner per l'input dell'utente
        Scanner scan = new Scanner(System.in);

        // Richiesta dei dati all'utente
        System.out.println("Inserisci il tuo nome: ");

        String nome = scan.next();

        System.out.println("Inserisci il tuo cognome: ");

        String cognome = scan.next();

        System.out.println("Inserisci il giorno di nascita (1-31): ");
        
        int giorno = scan.nextInt();
        
        System.out.println("Inserisci il mese di nascita (1-12): ");
        
        int mese = scan.nextInt();

        System.out.println("Inserisci il tuo anno di nascita: ");

        int anno = scan.nextInt();
 
        System.out.println("Inserisci il tuo colore preferito: ");

        String colore = scan.next();

        //somma della data di nascita

        int sommaData = giorno + mese + anno;

        // Generazione della password
        String password = nome + "-" + cognome + "-" + colore + "-" + sommaData;

        // Stampa della password
        System.out.println("La tua password generata è: " + password);
       
        // Chiusura dello scanner
        scan.close();
        
    }

}
