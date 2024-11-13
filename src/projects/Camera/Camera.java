package projects.Camera;

import projects.Camera.File.size;

public class Camera {
    private String color;
    private int weight;
    private int resoltionInMegapixel;
    private SDCard sdCard;
    private Manufacturer manufacturer;
    private Lens lens;

    public Camera(String color, int weight, int resoltionInMegapixel, SDCard sdCard, Manufacturer manufacturer,
            Lens lens) {
        this.color = color;
        this.weight = weight;
        this.resoltionInMegapixel = resoltionInMegapixel;
        this.sdCard = sdCard;
        this.manufacturer = manufacturer;
        this.lens = lens;

    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public int getResoltionInMegapixel() {
        return resoltionInMegapixel;
    }

    public void setResoltionInMegapixel(int resoltionInMegapixel) {
        this.resoltionInMegapixel = resoltionInMegapixel;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    };

    public void takePicture(String name, int date, size size) {
        File file = new File(name, size, date);
        this.sdCard.saveImage(file);
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public void deletePicture(String imageName) {
        sdCard.removeImage(imageName);
    }
}
