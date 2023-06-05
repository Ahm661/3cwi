package OO.Remote;

import OO.Battery.Batterie;
import OO.Battery.Battery;

public class Main {

    public static void main(String[] args) {
        Batterie b1 = new Batterie(90);
        Battery b2 = new Batterie(80);
        Remote r1 = new Remote(b1, b2);


    }
}