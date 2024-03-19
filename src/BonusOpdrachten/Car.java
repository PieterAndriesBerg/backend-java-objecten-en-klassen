package BonusOpdrachten;

public class Car {
    private String color;
    private String fuelType;
    private String brandName;
    private WheelType wheelType;
    private Engine engine;

    public Car(String color, String fuelType, String brandName, WheelType wheelType, Engine engine) {
        this.color = color;
        this.fuelType = fuelType;
        this.brandName = brandName;
        this.wheelType = wheelType;
        this.engine = engine;
    }

    public void displayInfo() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Color: " + color);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Capacity: " + engine.getCapacity());
        System.out.println("Engine Power: " + engine.getPower());
        System.out.println("Top Speed: " + wheelType.getTopSpeed());
        System.out.println("Wheel Info: " + wheelType.getWheelInfo());
    }

    public void refillFuel() {
        System.out.println("The fuel has been refilled.");
    }
}