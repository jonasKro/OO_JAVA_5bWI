package projects.Camera;

public class Camera {
    private String color;
    private int weight;
    private int resoltionInMegapixel;
    private SDCard sdCard;

    public Camera(String color, int weight, int resoltionInMegapixel, SDCard sdCard) {
        this.color = color;
        this.weight = weight;
        this.resoltionInMegapixel = resoltionInMegapixel;
        this.sdCard = sdCard;

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

    public void takePicture(String name, int date, int size) {
        this.sdCard.saveImage(null);
    }

}
