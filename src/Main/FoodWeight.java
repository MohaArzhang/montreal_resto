package Main;

public class FoodWeight extends Inventory{
    double costPerKilo;

    public FoodWeight(String item, double costPerKilo) {
        super(item);
        this.costPerKilo = costPerKilo;
    }
}
