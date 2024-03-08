// Video.java
package entities;

public class Video implements ElementoMultimediale {
    private String titolo;
    private int volume;
    private int luminosita;
    private int durata;

    public Video(String titolo, int durata) {
        this.titolo = titolo;
        this.volume = 50; // Valore di volume di default
        this.luminosita = 50; // Valore di luminosità di default
        this.durata = durata;
    }

    @Override
    public void play() {
        System.out.println("Riproduzione del video: " + titolo);
        // Simulazione della riproduzione del video
        for (int i = 0; i < durata; i++) {
            StringBuilder frame = new StringBuilder();
            for (int j = 0; j < luminosita; j++) {
                frame.append("*");
            }
            System.out.println(frame);
        }
    }

    @Override
    public void show() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Durata: " + durata + " minutti");
        System.out.println("Volume: " + volume);
        System.out.println("Luminosita: " + luminosita);
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

    public void aumentaVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuisciVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void aumentaLuminosita() {
        if (luminosita < 100) {
            luminosita++;
        }
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }
}
