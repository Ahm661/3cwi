package Nachliefern.OO.Camera;

public class ManufacturerLens {
    private String name;
    private  String country;

    public ManufacturerLens(String name, String country){
        this.name = name;
        this.country = country;
    }

    //Methods

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setCountry(String country) {this.country = country;}
    public String getCountry() {return country;}
}