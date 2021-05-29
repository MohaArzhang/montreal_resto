package Main;

public class ScrubbingSponge extends Supply{
    int amount;

    public ScrubbingSponge(String item, double costPerUnit, int amount) {
        super(item, costPerUnit);
        this.amount = amount;
    }
}
