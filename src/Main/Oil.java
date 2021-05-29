package Main;

public class Oil extends FoodItem {
    int amount;

    public Oil(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
