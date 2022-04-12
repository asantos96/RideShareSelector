package RideShareSelector.controller;
import RideShareSelector.model.MapData;
import RideShareSelector.service.apiService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;


@Controller
public class RideShareSelectorController {

    @RequestMapping( "/")
    //@ResponseBody
    public String loadPage(){
        return "test1.html";
    }

    @RequestMapping(value = "/destination", method = RequestMethod.POST)
    @ResponseBody

    public String testMapData(@RequestParam("destinationAddress") String destinationAddress,
                              @RequestParam("originAddress") String originAddress, ModelMap modelMap) {
        apiService mapAPI = new apiService();
        MapData test = mapAPI.accessMapData();
        //modelMap.put(" ", );
        String currentStatus = test.getStatus();
        String city = test.getOriginAddresses().get(0);

        String durationTime = test.getRows().get(0).getElements().get(0).getDuration().getText();
        String distance = test.getRows().get(0).getElements().get(0).getDistance().getText();


        return "Destination Address: " + destinationAddress + " Origin Address: " + originAddress;
    }




}
