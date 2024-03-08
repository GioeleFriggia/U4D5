// RegistrazioneAudio.java
package entities;

public class RegistrazioneAudio implements ElementoMultimediale {
    private String titolo;
    private int volume;
    private int durata;

    public RegistrazioneAudio(String titolo, int durata) {
        this.titolo = titolo;
        this.volume = 50; // Valore di volume di default
        this.durata = durata;
    }

    @Override
    public void play() {
        System.out.println("Riproduzione della registrazione audio: " + titolo);
        // Riproduciamo la registrazione audio per la sua durata
        for (int i = 0; i < durata; i++) {
            StringBuilder audio = new StringBuilder(titolo + ": ");
            for (int j = 0; j < volume; j++) {
                audio.append("!");
            }
            System.out.println(audio);
        }
    }

    @Override
    public void show() {
        System.out.println("La registrazione audio non è un'immagine e non può essere visualizzata.");
    }

    @Override
    public String getTitolo() {
        return titolo;
    }

    @Override
    public boolean isRiproducibile() {
        return true;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public void esegui() {
        show(); // Eseguiamo la visualizzazione quando il metodo esegui() viene chiamato
    }
}
