package RideShareSelector.model;

public class Driver extends Client {
    private double profit;

    public Driver(String name, String originAddress, String destinationAddress, double fare, int rating) {
        super(name, originAddress, destinationAddress, fare, rating);
        this.profit = profit;
    }

    @Override
    public void Print() {
        super.Print();

    }

}
