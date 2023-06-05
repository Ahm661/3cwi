package OO;


import OO.Calculator.Rechner;

public class sciencal1 extends Rechner {

    //Sinus
    public double sin(double a){
        System.out.println(Math.sin(a));
        return Math.sin(a);
    }

    //Cosinus
    public double cosin(double a){
        System.out.println(Math.cos(a));
        return Math.cos(a);
    }

    //Wurzelziehen
    public double sqrt(double a){
        System.out.println(Math.sqrt(a));
        return Math.sqrt(a);
    }

}
