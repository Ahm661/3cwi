package Nachliefern.OO.Camera;

public class Camera {
    private float pixel;
    private float weight;
    private String color;
    public enum RESOLUTION{k,m,s}
    private RESOLUTION resolution;
    private Nachliefern.OO.Camera.SDCard SDCard;

    private Nachliefern.OO.Camera.Lens Lens;
    private ManufacturerCamera manufacturerCamera;

    public Camera(float pixel, float weight, String color, RESOLUTION resolution, Nachliefern.OO.Camera.SDCard SDCard, Nachliefern.OO.Camera.Lens Lens, ManufacturerCamera manufacturerCamera){
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
        this.SDCard = SDCard;
        this.Lens = Lens;
        this.manufacturerCamera = manufacturerCamera;

    }

    //Methods
    public void setPixel(float pixel) {this.pixel = pixel;}
    public float getPixel() {return pixel;}

    public void setWeight(float weight) {this.weight = weight;}
    public float getWeight() {return weight;}

    public void setColor(String color) {this.color = color;}
    public String getColor() {return color;}

    public void setResolution(RESOLUTION resolution) {this.resolution = resolution;}
    public RESOLUTION getResolution() {return resolution;}

    public void setSDCard(Nachliefern.OO.Camera.SDCard SDCard) {this.SDCard = SDCard;}
    public Nachliefern.OO.Camera.SDCard getSDCard() {return SDCard;}


    public void takePic(){
        PhoneFile picture ;
        if (resolution == RESOLUTION.k) {
            //  make picture
            picture = new PhoneFile("image","jpg",2000);
        }
        else if (resolution == RESOLUTION.m){
            picture = new PhoneFile("image","jpg",4000);
        } else  {
            picture = new PhoneFile("image","jpg",6000);
        }
        this.SDCard.saveFile(picture);
    }

    public void newSDCard(){
        SDCard = new SDCard(16000);
    }

}