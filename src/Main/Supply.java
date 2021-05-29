package Main;

public class Supply extends Inventory {
    double costPerUnit;

    public Supply(String item, double costPerUnit) {
        super(item);
        this.costPerUnit = costPerUnit;
    }
}
