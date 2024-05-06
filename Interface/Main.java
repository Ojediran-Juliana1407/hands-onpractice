package Interface;

import static Interface.Musician.playInstrument;

public class Main {
    public static void main(String[]args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        playInstrument(guitar);
        playInstrument(piano);
    }
}
