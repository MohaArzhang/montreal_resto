package Main;

public class ToiletTowel extends Supply{
    int amount;

    public ToiletTowel(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
