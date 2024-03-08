// Immagine.java
package entities;

public class Immagine implements ElementoMultimediale {
    private String titolo;
    private int luminosita;

    public Immagine(String titolo) {
        this.titolo = titolo;
        this.luminosita = 50; // Valore di luminosità di default
    }

    @Override
    public void play() {
        System.out.println("La visualizzazione delle immagini non è supportata.");
    }

    @Override
    public void show() {
        System.out.println("Visualizzazione dell'immagine: " + titolo);
        // Simuliamo la visualizzazione dell'immagine utilizzando una serie di asterischi
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    @Override
    public boolean isRiproducibile() {
        return false;
    }

    @Override
    public int getDurata() {
        return 0; // Immagine non riproducibile, quindi durata 0
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = Math.min(Math.max(luminosita, 0), 100); // Limitiamo la luminosità tra 0 e 100
    }

    // Metodo specifico per Immagine
    public void esegui() {
        show(); // Eseguiamo la visualizzazione quando il metodo esegui() viene chiamato
    }
}
