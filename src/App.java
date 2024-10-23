import projects.Camera.File;

public class App {
    public static void main(String[] args) throws Exception {

        File file1 = new File("photo1", 1200, 23102024);
        System.out.println(file1.getFileSize());
    }
}
