package Main;

public class FoodItem extends Inventory{
    double costPerUnit;

    public FoodItem(String item, double costPerUnit) {
        super(item);
        this.costPerUnit = costPerUnit;
    }
}
