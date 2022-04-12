package RideShareSelector.service;

import RideShareSelector.model.MapData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component

public class apiService {
    public MapData accessMapData(){
    RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://maps.googleapis.com/maps/api/distancematrix/json?origins=Baltimore%2C%20MD&destinations=New%20York%20City%2C%20NY&units=imperial&key=AIzaSyC92D7nxoEuB7-Epx6wBw-iNjdEIELhGkY", MapData.class);
    }//end accessMapData

}//end apiService

