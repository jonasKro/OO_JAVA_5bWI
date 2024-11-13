package projects.Camera;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import projects.Camera.File.size;

public class CameraTest {

    private Manufacturer manufacturer;
    private SDCard sdCard;
    private Lens lens;
    private Camera camera;

    @BeforeEach
    void setup() {
        this.manufacturer = new Manufacturer("canon");
        this.sdCard = new SDCard(500);
        this.lens = new Lens(500, manufacturer);
        this.camera = new Camera("green", 500, 4, sdCard, manufacturer, lens);
    }

    @Test
    void testGetColor() {
        Assertions.assertEquals(camera.getColor(), "green");
    }

    @Test
    void testGetLens() {
        Assertions.assertEquals(camera.getLens(), lens);
    }

    @Test
    void testGetManufacturer() {
        Assertions.assertEquals(camera.getManufacturer(), manufacturer);

    }

    @Test
    void testGetResoltionInMegapixel() {
        Assertions.assertEquals(camera.getResoltionInMegapixel(), 4);
    }

    @Test
    void testGetSdCard() {
        Assertions.assertEquals(camera.getSdCard(), sdCard);

    }

    @Test
    void testGetWeight() {
        Assertions.assertEquals(camera.getWeight(), 500);

    }

    @Test
    void testSetLens() {
        camera.setLens(lens);
        Assertions.assertEquals(camera.getLens(), lens);

    }

    @Test
    void testSetManufacturer() {
        camera.setManufacturer(manufacturer);
        Assertions.assertEquals(camera.getManufacturer(), manufacturer);

    }

    @Test
    void testSetResoltionInMegapixel() {
        camera.setResoltionInMegapixel(5);
        Assertions.assertEquals(camera.getResoltionInMegapixel(), 5);

    }

    @Test
    void testSetSdCard() {
        camera.setSdCard(sdCard);
        Assertions.assertEquals(camera.getSdCard(), sdCard);

    }

    @Test
    void testTakePicture() {
        camera.takePicture("test", 1, size.large);
        // Assertions.assertEquals(sdCard.getFiles(), );

    }
}
