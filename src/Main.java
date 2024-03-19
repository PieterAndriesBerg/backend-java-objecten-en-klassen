
import BonusOpdrachten.*;

import java.text.SimpleDateFormat;


public class Main {
    public static void main(String[] args) {

        ApplePieRecipe applePieRecipe = new ApplePieRecipe();

        applePieRecipe.printIngredients();

        applePieRecipe.printAllSteps();

        //BONUS

        // Opdracht 1
        Film theGodFather = new Film("The Godfather", "Francis Ford Coppola", new SimpleDateFormat("24-03-1972"), "Crime");

        theGodFather.printFilmInfo();

        // Opdracht 2
        Winkel winkel = new Winkel();
        winkel.addProduct("Cola", 10);
        winkel.addProduct("Candles", 20);
        winkel.addProduct("Chips", 30);
        winkel.addProduct("M&MS", 40);

        winkel.removeProduct("M&MS");

        winkel.getStoreWares();

        // Opdracht 3
        Bedrijf bedrijf = new Bedrijf("CoolCompany");
        bedrijf.getCompanyInfo();

        //Opdracht 4
        Zoo zoo = new Zoo("Artis");
        zoo.getZooInfo();

        //Opdracht 5
        Car ferrari = new Car("Red", "Diesel", "Ferrari", new WheelType("Asanti",300,"dik",300), new Engine(5000, 300));

        ferrari.displayInfo();
        ferrari.refillFuel();



    }
}
