package BonusOpdrachten;

public class Animal {
    private String name;
    private String species;
    private int age;
    private String eatingHabit;

    public Animal(String name, String species, int age, String eatingHabit) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.eatingHabit = eatingHabit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEatingHabit() {
        return eatingHabit;
    }

    public void setEatingHabit(String eatingHabit) {
        this.eatingHabit = eatingHabit;
    }
}
