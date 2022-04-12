package RideShareSelector.controller;
import RideShareSelector.model.MapData;
import RideShareSelector.service.apiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;


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
        String city = test.getOriginAddresses().get(0);

        String durationTime = test.getRows().get(0).getElements().get(0).getDuration().getText();
        String distance = test.getRows().get(0).getElements().get(0).getDistance().getText();


        return distance;
    }




}
