package Main;

public class Rice extends FoodWeight {
    double weight;

    public Rice(String item, double costPerKilo, double weight) {
        super(item, costPerKilo);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
