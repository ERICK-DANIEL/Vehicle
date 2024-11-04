public abstract class WaterVehicle extends Vehicle {
    protected String pathProgramming;

    public WaterVehicle(int power, int year, String brand) {
        super(power, year, brand);
    }

    public abstract String description();
}
