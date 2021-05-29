package Main;

public class Bean extends FoodWeight {
    double weight;

    public Bean(String item, double costPerKilo, double weight) {
        super(item, costPerKilo);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
