package projects.Camera;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int memory;
    private List<File> files = new ArrayList();

    public SDCard(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void getFiles() {

        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i).getFileName());
        }
    }

    public void saveImage(File file) {
        this.files.add(file);
    }

}
