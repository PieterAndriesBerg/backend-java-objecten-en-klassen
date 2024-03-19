package BonusOpdrachten;

public class Engine {
    private double capacity;
    private int power;

    public Engine(double capacity, int power) {
        this.capacity = capacity;
        this.power = power;
    }

    public double getCapacity() {
        return capacity;
    }

    public int getPower() {
        return power;
    }
}