package RideShareSelector.data;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;


import RideShareSelector.controller.RideShareSelectorController;
import RideShareSelector.model.Client;
import RideShareSelector.model.MapData;
import RideShareSelector.service.apiService;
import org.springframework.stereotype.Component;

@Component
public class ClientRepository {
    private double fare;

    static final List<Client> ALL_CLIENTS = Arrays.asList(
            new Client("Client1", "2401 W Belvedere Ave, Baltimore, MD",
                    "5601 Loch Raven Blvd, Baltimore, MD", 25.00,  5),


            new Client("Client2", "900 S Caton Ave, Baltimore, MD",
                    "4940 Eastern Ave, Baltimore, MD", 25.00,  5),


            new Client("Client3", "3001 S Hanover St, Baltimore, MD",
                    "575 E Ordnance Rd, Glen Burnie, MD", 25.00,  5));



    public List<Client> getAllClients() {
        return ALL_CLIENTS;
    }//end getAllClients

    //TODO: THIS METHOD HAS NO PURPOSE YET.. NEED TO DEFINE AND MAKE USEFUL
    public Client findByName(String name){
        for(Client client: ALL_CLIENTS){

            if(client.getName().equals(name)){
                return  client;
            }
        }
        return  null;
    }//end findByName


    public String getDistance(String originAddress, String destinationAddress) throws UnsupportedEncodingException {
        apiService getAPI = new apiService();
        MapData testDistance = getAPI.accessMapData(originAddress, destinationAddress);
        String distance = testDistance.getRows().get(0).getElements().get(0).getDistance().getText();
        return distance;
    }

}
