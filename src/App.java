public class App {
    public static void main(String[] args) {
        // Crear una Locacion
        Location loc1 = new Location("Veracruz", "México");
        
        // Crear un vehiculo terrestre
        Land landVehicle = new Land(200, 2022, "Toyota", "Carreras", loc1);
        System.out.println(landVehicle.description());
        System.out.println(landVehicle.moveWheels());

        // Crear un vehiculo anfibio
        Amphibian amphibianVehicle = new Amphibian( 450, 1972, " General Dynamics Land Systems", "Amphibious Assault Vehicles (AAV)", loc1);
        System.out.println(amphibianVehicle.description());
        System.out.println(amphibianVehicle.moveWheels());
        System.out.println(amphibianVehicle.moveJetPropulsion());
    }
}
