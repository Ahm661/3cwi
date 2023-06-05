package OO.Handy;

import java.util.ArrayList;
import java.util.List;

public class SDcard {
    private String id;
    private long capacity;
    private List<File> files;

    public SDcard(String id, long capacity) {
        this.id = id;
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public long getCapacity() {
        return capacity;
    }

    public List<File> getFiles() {
        return files;
    }

    public boolean addFile(File file) {
        if (file.getSize() > getFreeSpace()) {
            return false;
        }
        files.add(file);
        return true;
    }

    public long getFreeSpace() {
        long usedSpace = 0;
        for (File file : files) {
            usedSpace += file.getSize();
        }
        return capacity - usedSpace;
    }
}
