package BonusOpdrachten;

public class Manager {
    private String name;
    private int age;

    public Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getManagerInfo() {
        return  name + " Age: " + age;
    }
}
