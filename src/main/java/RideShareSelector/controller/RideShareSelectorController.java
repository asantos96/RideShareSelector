package RideShareSelector.controller;
import RideShareSelector.model.DestinationAddress;
import RideShareSelector.model.MapData;
import RideShareSelector.service.apiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;


@Controller
public class RideShareSelectorController {
    //@Autowired
    //public apiService apiService;
    @RequestMapping("/")
    @ResponseBody

    public String testMapData() {
        apiService mapAPI = new apiService();
        MapData test = mapAPI.accessMapData();
        String currentStatus = test.getStatus();
        String city = test.getDestinationAddresses().get(0);



        return city;
    }


}
