package RideShareSelector.service;

public class AddressInformation {
    private String originStreetNumber;
    private String originStreetName;
    private String destinationStreetNumber;
    private String getDestinationStreetName;

    public AddressInformation(String originStreetNumber, String originStreetName, String destinationStreetNumber, String getDestinationStreetName) {
        this.originStreetNumber = originStreetNumber;
        this.originStreetName = originStreetName;
        this.destinationStreetNumber = destinationStreetNumber;
        this.getDestinationStreetName = getDestinationStreetName;
    }
}
