import java.util.Scanner;

public class Tempo {

    public static void main(String[] args) {
        int secondi = leggiTempo();
        String risultato = convertiTempo(secondi);
        System.out.println(risultato);
    }

    public static int leggiTempo() {
        Scanner scanner = new Scanner(System.in);
        int secondi;
        
        while (true) {
            System.out.print("Inserisci il tempo in secondi (tra 0 e 84600): ");
            secondi = scanner.nextInt();
            
            if (secondi >= 0 && secondi <= 84600) {
                break; 
            } else {
                System.out.println("Errore: Il tempo deve essere tra 0 e 84600 secondi.");
            }
        }
        
        return secondi;
    }

    public static String convertiTempo(int secondi) {
        int ore = secondi / 3600;  
        secondi = secondi % 3600;  
        int minuti = secondi / 60;  
        secondi = secondi % 60; 
        return ore + " h, " + minuti + " m, " + secondi + " s";
    }
}
