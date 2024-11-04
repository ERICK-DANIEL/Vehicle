public class Amphibian extends WaterVehicle implements IJetPropulsion, IWheels{
    private String type;
    private Location location;

    public Amphibian(int power, int year, String brand, String type, Location location) {
        super(power, year, brand);
        this.type = type;
        this.location = location;
    }

    @Override
    public String description() {
        return getDescription() + ", Tipo: " + type + ", Locacion: " + location.getLocationInfo();
    }

    @Override
    public String moveWheels() {
        return "Moviendo con ruedas";
    }

    @Override
    public String moveJetPropulsion() {
        return "Moviendo con prpulsion de chorro";
    }
}
