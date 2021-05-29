package Main;

public class DishWashingLiquid extends Supply{
    int amount;

    public DishWashingLiquid(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
