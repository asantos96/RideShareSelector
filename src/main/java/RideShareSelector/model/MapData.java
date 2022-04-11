package RideShareSelector.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)

public class MapData {

    private DestinationAddress destination_addresses ;
    private OriginAddress origin_addresses;
    private Rows rows;



    public DestinationAddress getDestination_addresses() {
        return destination_addresses;
    }

    public void setDestination_addresses(DestinationAddress destination_addresses) {
        this.destination_addresses = destination_addresses;
    }

    public OriginAddress getOrigin_addresses() {
        return origin_addresses;
    }

    public void setOrigin_addresses(OriginAddress origin_addresses) {
        this.origin_addresses = origin_addresses;
    }

    public Rows getRows() {
        return rows;
    }

    public void setRows(Rows rows) {
        this.rows = rows;
    }

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
