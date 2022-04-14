package RideShareSelector.model;

public class Client {
   String name;
    private String originAddress;
    private String destinationAddress;
    private double fare;
    private int rating;

    public Client(String name, String originAddress, String destinationAddress, double fare, int rating) {
        this.name = name;
        this.originAddress = originAddress;
        this.destinationAddress = destinationAddress;
        this.fare = fare;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getOriginAddress() {
        return originAddress;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public double getFare() {
        return fare;
    }

    public int getRating() {
        return rating;
    }

    public void Print(){
        System.out.println( "**************************************" + '\n' +
                "Name: " +  name +'\n' +
                "Current Address: " + originAddress + "\n" +
                "Destination Address: " + destinationAddress + "\n" +
                "Fare Cost: $"  + fare + "  \n" +
                "Rating: " + rating);

    }
}
