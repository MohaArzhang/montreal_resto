package Main;

public class PlasticBag extends Supply{
    int amount;

    public PlasticBag(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
