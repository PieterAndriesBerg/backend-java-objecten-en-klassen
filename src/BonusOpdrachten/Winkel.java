//package BonusOpdrachten;
//
//public class Winkel {
//    private String cola = "Coca Cola";
//    private String candles = "Candles";
//    private String chips = "Chips";
//    private int colaAmount;
//    private int candlesAmount;
//    private int chipsAmount;
//
//    public Winkel(int colaAmount, int candlesAmount, int chipsAmount) {
//        this.cola = cola;
//        this.candles = candles;
//        this.chips = chips;
//        this.colaAmount = colaAmount;
//        this.candlesAmount = candlesAmount;
//        this.chipsAmount = chipsAmount;
//    }
//
//    public void getStoreWares() {
//        System.out.println(  cola + " Amount: " + colaAmount);
//        System.out.println(  candles + " Amount: " + candlesAmount);
//        System.out.println( chips + " Amount: " + chipsAmount);
//    }
//
//    public void setColaAmount(int colaAmount) {
//        this.colaAmount = colaAmount;
//    }
//
//    public void setCandlesAmount(int candlesAmount) {
//        this.candlesAmount = candlesAmount;
//    }
//
//    public void setChipsAmount(int chipsAmount) {
//        this.chipsAmount = chipsAmount;
//    }
//
//
//
//
//
//}

package BonusOpdrachten;

import java.util.HashMap;

public class Winkel {
    private HashMap<String, Integer> products;

    public Winkel() {
        this.products = new HashMap<>();
    }

    public void addProduct(String product, int amount) {
        this.products.put(product, amount);
    }

    public void removeProduct(String product) {
        this.products.remove(product);
    }

    public void getStoreWares() {
        for (String product : this.products.keySet()) {
            System.out.println(product + " Amount: " + this.products.get(product));
        }
    }
}
