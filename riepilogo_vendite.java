import java.util.Scanner;

public class riepilogo_vendite {
    public static void main(String[] args) {
        Scanner utente = new Scanner(System.in);

        System.out.print("Inserisci quanti prodotti sono stati venduti: ");
        int Numero_prodtti_venduti = utente.nextInt();

        
        int[] numVendite = new int[4];
        double[] ricavi = new double[4]; 
        double ricavoTotale = 0;

        for (int i = 0; i < Numero_prodtti_venduti; i++) {
            System.out.println("Vendita " + (i + 1) + ":");

            System.out.print("Inserisci il tipo di prodotto (1=televisore, 2=frigorifero, 3=lavatrici, 4=altro): ");
            int tipoProdotto = utente.nextInt();

            System.out.print("Inserisci il prezzo del prodotto: ");
            double prezzo = utente.nextDouble();

            if (tipoProdotto >= 1 && tipoProdotto <= 4) {
                numVendite[tipoProdotto - 1]++;
                ricavi[tipoProdotto - 1] += prezzo;
                ricavoTotale += prezzo;
            } else {
                System.out.println("Tipo di prodotto non valido. Ignorando la vendita.");
            }
        }

        System.out.println("\nRicavo totale delle vendite: " + ricavoTotale + " Euro");

        System.out.println("\nNumero di prodotti venduti per categoria:");
        String[] categorie = {"Televisori", "Frigoriferi", "Lavatrici", "Altro"};
        for (int i = 0; i < 4; i++) {
            double percentualeVendite = (double) numVendite[i] / Numero_prodtti_venduti * 100;
            System.out.printf("%s: %d venduti (%.2f%% del totale)\n", categorie[i], numVendite[i], percentualeVendite);
        }

        System.out.println("\nRicavo per categoria:");
        for (int i = 0; i < 4; i++) {
            double percentualeRicavo = (ricavi[i] / ricavoTotale) * 100;
            System.out.printf("%s: %.2f Euro (%.2f%% del ricavo totale)\n", categorie[i], ricavi[i], percentualeRicavo);
        }

    }
}
