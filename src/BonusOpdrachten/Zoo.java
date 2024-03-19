package BonusOpdrachten;

public class Zoo {
    private String name;
    Animal lion = new Animal("Lion", "Mammal", 5, "Carnivore");
    Animal elephant = new Animal("Elephant", "Mammal", 10, "Herbivore");
    Animal giraffe = new Animal("Giraffe", "Mammal", 7, "Herbivore");


    public Zoo(String name) {
        this.name = name;
    }

    public void getZooInfo() {
        System.out.println("Zoo name: " + name);
        System.out.println("Animals: ");
        System.out.println("Name: " + lion.getName() + " Species: " + lion.getSpecies() + " Age: " + lion.getAge() + " Eating habit: " + lion.getEatingHabit());
        System.out.println("Name: " + elephant.getName() + " Species: " + elephant.getSpecies() + " Age: " + elephant.getAge() + " Eating habit: " + elephant.getEatingHabit());
        System.out.println("Name: " + giraffe.getName() + " Species: " + giraffe.getSpecies() + " Age: " + giraffe.getAge() + " Eating habit: " + giraffe.getEatingHabit());
    }



}
