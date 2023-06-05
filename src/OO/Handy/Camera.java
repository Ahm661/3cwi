package OO;


public class Camera {
    private int pixel;

    private File.FILE_SIZE pictureSize;
    private int weight;
    private String color;
    private Producer producer;
    private Lens lens;
    private SDCard sDcard;
    private int filenumber = 0;

    public Camera(int pixel, int weight, String color, Producer producer, Lens lens, SDCard sDcard) {
        this.pixel = pixel;
        this.weight = weight;
        this.color = color;
        this.producer = producer;
        this.lens = lens;
        this.sDcard = sDcard;
        this.pictureSize = File.FILE_SIZE.mittel;
    }


    public void makePicture() {
        if (pictureSize == File.FILE_SIZE.klein) {
            setPixel(2);
        } else if (pictureSize == File.FILE_SIZE.mittel) {
            setPixel(4);
        } else if (pictureSize == File.FILE_SIZE.groß) {
            setPixel(6);
        } else {
            System.out.println("Error");
        }

        String name = "DC0_" + filenumber;
        File file = new File(name, "jpeg", pictureSize);

        this.sDcard.addFile(file);
        filenumber++;

    }

    public SDCard getsDcard() {
        return sDcard;
    }

    public void setsDcard(SDCard sDcard) {
        this.sDcard = sDcard;
    }

    public File.FILE_SIZE getPictureSize() {
        return pictureSize;
    }

    public void setPictureSize(File.FILE_SIZE pictureSize) {
        this.pictureSize = pictureSize;
    }

    public int getPixel() {
        return pixel;
    }

    public void setPixel(int pixel) {
        this.pixel = pixel;
    }
}