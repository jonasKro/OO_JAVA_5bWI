package projects.Camera;

public class Lens {
    private int brennweite;
    private Manufacturer manufacturer;

    public Lens(int brennweite, Manufacturer manufacturer) {
        this.brennweite = brennweite;
        this.manufacturer = manufacturer;
    }

    public int getBrennweite() {
        return brennweite;
    }

    public void setBrennweite(int brennweite) {
        this.brennweite = brennweite;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

}
