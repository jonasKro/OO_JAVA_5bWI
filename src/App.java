import projects.Camera.Camera;
import projects.Camera.File;
import projects.Camera.File.size;
import projects.Camera.Lens;
import projects.Camera.Manufacturer;
import projects.Camera.SDCard;

public class App {
    public static void main(String[] args) throws Exception {

        Manufacturer canon = new Manufacturer("canon");
        Lens lens1 = new Lens(100, canon);
        File file1 = new File("photo1", size.small, 23102024);
        File file2 = new File("photo2", size.medium, 23102024);
        File file3 = new File("photo3", size.large, 23102024);

        SDCard card1 = new SDCard(2000);
        Camera cam = new Camera("black", 500, 3, card1, canon, lens1);

        card1.saveImage(file1);
        card1.saveImage(file2);
        card1.saveImage(file3);
        file1.getFileName();
        card1.getFiles();
        cam.takePicture("wald", 7112024, size.large);
        cam.getSdCard().getFiles();
        cam.deletePicture("photo1");
        cam.getSdCard().getFiles();
        card1.getImage("photo2");

    }
}
