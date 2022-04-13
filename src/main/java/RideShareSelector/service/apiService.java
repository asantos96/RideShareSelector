package RideShareSelector.service;

import RideShareSelector.controller.RideShareSelectorController;
import RideShareSelector.model.MapData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;


@Component

public class apiService {

    public MapData accessMapData(String originAddress, String destinationAddress) throws UnsupportedEncodingException {
    RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("https://maps.googleapis.com/maps/api/distancematrix/json?origins=1%20First%20Avenue%2C%20Baltimore%2C%20MD&destinations=15%20West%20North%20Avenue%2C%20Baltimore%2C%20MD&units=imperial&key=AIzaSyC92D7nxoEuB7-Epx6wBw-iNjdEIELhGkY", MapData.class);


        String encodedOriginAddress =  URLEncoder.encode(originAddress, "UTF-8");
        String encodedDestinationAddress = URLEncoder.encode(destinationAddress, "UTF-8");

        return restTemplate.getForObject("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + encodedOriginAddress +
         "&destinations=" + encodedDestinationAddress + "&units=imperial&key=AIzaSyC92D7nxoEuB7-Epx6wBw-iNjdEIELhGkY", MapData.class);
    }//end accessMapData

}//end apiService

