package Main;

public class FacialTissue extends Supply{
    int amount;

    public FacialTissue(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
