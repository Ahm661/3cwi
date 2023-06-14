package Nachliefern.OO.Camera;

public class ManufacturerCamera {
    private String name;
    private  String country;

    public ManufacturerCamera(String name, String country){
        this.name = name;
        this.country = country;
    }

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setCountry(String country) {this.country = country;}
    public String getCountry() {return country;}
}