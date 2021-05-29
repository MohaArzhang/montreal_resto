package Main;

public class Meat extends FoodWeight {
    double weight;

    public Meat(String item, double costPerKilo, double weight) {
        super(item, costPerKilo);
        this.weight = weight;
    }
}
