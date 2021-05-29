package Main;

public class HandSanitizer extends Supply{
    int amount;

    public HandSanitizer(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
