package OO.Calculator;

public class Calculator2 {
    public static void main(String[] args) {
        Rechner r1 = new Rechner();
        r1.add(5,4);
        r1.divide(8, 2);
        WissenschaftlicherRechner wr1 = new WissenschaftlicherRechner();
        wr1.cosin(90);
        wr1.sin(90);
        wr1.sqrt(9);
        r1.multiply(23,35.2);
    }
}