public class Dog {
    private final double originWeight;
    private double weight;

    public Dog() {
        this(1500.0+3000.0*Math.random());
    }

    public Dog(double weight) {
        this.weight=weight;
        originWeight=weight;
    }

    public void woof() {
        weight--;
        System.out.println("Woof!");
    }

    public void feed(Double amount) {
        weight=weight+amount;
    }

    public void drink(Double amount) {
        weight=weight+amount;
    }

    public void pee() {
        weight=weight-10;
        System.out.println("Убери за мной");
    }

    public Double getWeight() {
        return weight;
    }
}
