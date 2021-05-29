package Main;

public class Tomato extends FoodWeight {
    double weight;

    public Tomato(String item, double costPerKilo, double weight) {
        super(item, costPerKilo);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }
}
