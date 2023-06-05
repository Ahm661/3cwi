package OO.Handy;

//ChatGPT wird korrigiert
public class CAMERRA {
    private String id;
    private String phoneNumber;

    public void SimCard(String id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
