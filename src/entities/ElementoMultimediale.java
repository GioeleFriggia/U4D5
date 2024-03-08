// ElementoMultimediale.java
package entities;

public interface ElementoMultimediale {
    void play();
    void show();
    String getTitolo();
    boolean isRiproducibile();
    int getDurata();

    default void esegui() {
        show(); // Implementazione predefinita per il metodo esegui()
    }
}
