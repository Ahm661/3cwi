package OO.Lamp;

import OO.Battery.Batterie;

public class Main {
    public static void main(String[] args) {
        Batterie b1 = new Batterie(4);
        Lamp l1 = new Lamp(b1);
    }

}