package OO.Handy;
import java.util.ArrayList;
import java.util.List;
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

public class Camera {
    private final String id;
    private final int resolution;

    public Camera(String id, int resolution) {
        this.id = id;
        this.resolution = resolution;
    }

    public String getId() {
        return id;
    }

    public int getResolution() {
        return resolution;
    }

    public File takePhoto() {
        int fileSize = resolution * 1024; // assuming each pixel takes up 1 byte
        return new File("photo_" + System.currentTimeMillis(), fileSize);
    }
}

public class File {
    private final String name;
    private final int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}

public class Handy {
    private final SimCard simCard;
    private final SDcard sdCard;
    private final Camera camera;

    public Handy(SimCard simCard, SDcard sdCard, Camera camera) {
        this.simCard = simCard;
        this.sdCard = sdCard;
        this.camera = camera;
    }

    public boolean makePhoto() {
        File photo = camera.takePhoto();
        return sdCard.addFile(photo);
    }

    public List<File> getAllFiles() {
        return sdCard.getFiles();
    }

    // Login methods
    public boolean login(String username, String password) {
        // implementation of authentication
        return true;
    }

    public void logout() {
        // implementation of logout
    }
}

public class Main {
    public static void main(String[] args) {
        // create components
        SimCard simCard = new SimCard("123456", "0123456789");
        SDcard sdCard = new SDcard("ABC", 100000000);
        Camera camera = new Camera("DEF", 800);

        // create phone
        Handy handy = new Handy(simCard, sdCard, camera);

        // take photo
        handy.makePhoto();

        // display all files
        List<File> files = handy.getAllFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

        // login
        if (handy.login("username", "password")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }

        // logout
        handy.logout();
    }
}