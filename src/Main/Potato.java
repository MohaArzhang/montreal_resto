package Main;

public class Potato extends FoodWeight {
    double weight;

    public Potato(String item, double costPerKilo, double weight) {
        super(item, costPerKilo);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

