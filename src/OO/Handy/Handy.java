package OO.Handy;
public class Handy {
    private SIM sim;
    private SD sd;
    private Camera camera;

    public Handy(SIM sim, SD sd, Camera camera) {
        this.sim = sim;
        this.sd = sd;
        this.camera = camera;
    }

    public void makePhoto() {
        if (sd.getFreierSpeicherplatz() < camera.getResolution()) {
            System.out.println("Nicht genügend Speicherplatz verfügbar.");
            return;
        }

        File photo = camera.makePhoto();
        SDcard speicherkarte;
        speicherkarte.addFile(photo);
    }

    public List<File> getAllFiles() {
        return SD.getFiles();
    }

    // Login-Methoden
    public boolean login(String benutzername, String passwort) {
        // Implementierung der Authentifizierung
        return true;
    }

    public void logout() {
        // Implementierung der Abmeldung
    }
}
