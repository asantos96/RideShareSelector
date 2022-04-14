package RideShareSelector.data;

import RideShareSelector.model.Client;
import RideShareSelector.model.Driver;

import java.util.Arrays;
import java.util.List;

import static RideShareSelector.data.ClientRepository.ALL_CLIENTS;

public class DriverRepository {
    private static final List<Driver> ALL_DRIVERS = Arrays.asList(
            new Driver("Client1", "501 E Pratt St, Baltimore, MD",
                    "6323 Ritchie Hwy, Glen Burnie, MD", 25.00,  5));




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


}
