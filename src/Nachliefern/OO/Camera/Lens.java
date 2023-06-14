package Nachliefern.OO.Camera;

public class Lens {
    private float focalWidth;
    private ManufacturerLens manufacturerLens;
    public Lens(float focalWidth, ManufacturerLens manufacturerLens){
        this.focalWidth = focalWidth;
        this.manufacturerLens = manufacturerLens;
    }

    //Methods
    public void setFocalWidth(float focalWidth) {this.focalWidth = focalWidth;}
    public float getFocalWidth() {return focalWidth;}

}