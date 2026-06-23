package factory_method_pattern;

public class VehicleFactory {

    public Vehicle getVehicle(String type)
    {
        if(type == null)
        {
            return null;
        }
        if(type.equalsIgnoreCase("car"))
        {
            return new Car();
        }
        if(type.equalsIgnoreCase("bike"))
        {
            return new Bike();
        }

        return null;
    }
}
