import projects.Camera.Camera;
import projects.Camera.File;
import projects.Camera.SDCard;

public class App {
    public static void main(String[] args) throws Exception {

        File file1 = new File("photo1", 1200, 23102024);
        File file2 = new File("photo2", 1200, 23102024);
        File file3 = new File("photo3", 1200, 23102024);

        SDCard card1 = new SDCard(2000);
        Camera cam = new Camera("black", 500, 3, card1);
        card1.saveImage(file1);
        card1.saveImage(file2);
        card1.saveImage(file3);
        file1.getFileName();
        card1.getFiles();
        System.out.println(file1.getFileSize());
    }
}
