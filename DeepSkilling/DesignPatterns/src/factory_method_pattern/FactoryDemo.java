package factory_method_pattern;

public class FactoryDemo {

    public static void run()
    {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.getVehicle("car");
        car.drive();

        Vehicle bike = factory.getVehicle("bike");
        bike.drive();
    }
}
