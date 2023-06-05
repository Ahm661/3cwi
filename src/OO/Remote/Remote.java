package OO.Remote;

import OO.Battery.Batterie;
import OO.Battery.Battery;

public class Remote {
    private Batterie battery1;
    private Battery battery2;

    public Remote(Batterie battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }


    public void turnOn()
    {
        this.battery1.setElectricityConsumption(this.battery1.getElectricityConsumption()-5);
        this.battery2.setElectricityConsumption(this.battery2.getElectricityConsumption()-5);
        System.out.println("Verbraucher angeschlossen");
    }

    public void turnOff(){
        System.out.println("Kein Verbraucher angeschlossen");
    }

    public float getStatus(){
        float mw = (this.battery1.getChargingStatus() + this.battery2.getChargingStatus())/2;
        return mw;
    }
}
