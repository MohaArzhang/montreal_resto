package Main;

public class Ketchup extends FoodItem {
    int amount;

    public Ketchup(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
