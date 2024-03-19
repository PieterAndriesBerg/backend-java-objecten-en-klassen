package BonusOpdrachten;

public class WheelType {
    private String brand;
    private double diameter;
    private String profile;
    private int topSpeed;

    public WheelType(String brand, double diameter, String profile, int topSpeed) {
        this.brand = brand;
        this.diameter = diameter;
        this.profile = profile;
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getWheelInfo() {
        return brand + " dia: " + diameter  + " profiel: " + profile + " tSpeed: " + topSpeed;
    }
}