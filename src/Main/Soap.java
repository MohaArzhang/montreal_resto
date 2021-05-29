package Main;

public class Soap extends Supply{
    int amount;

    public Soap(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
