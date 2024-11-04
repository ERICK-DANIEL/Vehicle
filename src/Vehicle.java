public abstract class Vehicle {
    protected int power;
    protected int year;
    protected String brand;

    public Vehicle(int power, int year, String brand) {
        this.power = power;
        this.year = year;
        this.brand = brand;
    }

    public abstract String description();

    protected String getDescription() {
        return "Matricula: " + brand + ", Año: " + year + ", Caballos de fuerza: " + power;
    }
}
