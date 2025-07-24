package live;

import Music.Playable;
import Music.string.Veena;
import Music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        // a. Create Veena instance and call play()
        Veena veena = new Veena();
        veena.play();

        // b. Create Saxophone instance and call play()
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        // c. Use interface references
        Playable p1 = veena;
        Playable p2 = saxophone;

        p1.play();
        p2.play();
    }
}
