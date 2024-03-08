// Main.java
package entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci il titolo dell'elemento multimediale " + (i + 1) + ":");
            String titolo = scanner.nextLine();
            System.out.println("Inserisci la durata dell'elemento multimediale (in secondi):");
            int durata = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il tipo dell'elemento multimediale (1=Immagine, 2=Video, 3=Registrazione Audio):");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    elementi[i] = new Immagine(titolo);
                    break;
                case 2:
                    elementi[i] = new Video(titolo, durata);
                    break;
                case 3:
                    elementi[i] = new RegistrazioneAudio(titolo, durata);
                    break;
                default:
                    System.out.println("Scelta non valida");
            }
        }

        // Esecuzione degli elementi multimediali
        int scelta;
        do {
            System.out.println("Scegli l'elemento multimediale da eseguire (1-" + elementi.length + ", 0=Esci):");
            scelta = scanner.nextInt();
            scanner.nextLine();
            if (scelta >= 1 && scelta <= elementi.length) {
                elementi[scelta - 1].play();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida");
            }
        } while (scelta != 0);

        scanner.close();
    }
}
