package RideShareSelector.controller;
import RideShareSelector.data.ClientRepository;
import RideShareSelector.model.MapData;
import RideShareSelector.service.apiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.stereotype.Controller;

import java.io.UnsupportedEncodingException;


@Controller
public class RideShareSelectorController {

    @RequestMapping( "/")
    //@ResponseBody
    public String loadPage(){
        return "test1.html";
    }

    @Autowired
    private apiService apiService;

    @RequestMapping(value = "/destination", method = RequestMethod.POST)


    public String testMapData(@RequestParam("destinationAddress") String destinationAddress,
                              @RequestParam("originAddress") String originAddress, ModelMap modelMap) throws UnsupportedEncodingException {

        MapData test = apiService.accessMapData(originAddress, destinationAddress);
        ClientRepository fare = new ClientRepository();
        double cost = fare.calcFare(fare.getDistance(originAddress, destinationAddress));
        modelMap.put("fareKey", cost );
        modelMap.put("apiKey", test);
//        String currentStatus = test.getStatus();
//        String city = test.getOriginAddresses().get(0);
//
        String durationTime = test.getRows().get(0).getElements().get(0).getDuration().getText();
//        String distance = test.getRows().get(0).getElements().get(0).getDistance().getText();
//
        //originAddress and destinationAddress are for the client
        if (originAddress.equals( "2401 W Belvedere Ave, Baltimore, MD") && destinationAddress.equals("3001 S Hanover St, Baltimore, MD" )) {
            return "drivertoclient1";
        }
        else if (originAddress.equals( "5601 Loch Raven Blvd, Baltimore, MD") && destinationAddress.equals("575 E Ordnance Rd, Glen Burnie, MD" )) {
            return "drivertoclient2";
        }
         else if (originAddress.equals( "900 S Caton Ave, Baltimore, MD") && destinationAddress.equals("501 E Pratt St, Baltimore, MD" )) {
                return "drivertoclient3";
        }
        else {
            return "searchresult";
        }
////        if (originAddress == "4940 Eastern Ave, Baltimore, MD") {
////            return "drivertoclient2";
////        }


//        return "searchresult";
    }

}
