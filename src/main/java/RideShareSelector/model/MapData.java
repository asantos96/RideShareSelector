package RideShareSelector.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)

public class MapData {
    private String destination_addresses;
    private String origins_addresses;
    private List<Rows> rows;

    public String getDestination_addresses() {
        return destination_addresses;
    }

    public void setDestination_addresses(String destination_addresses) {
        this.destination_addresses = destination_addresses;
    }

    public String getOrigins_addresses() {
        return origins_addresses;
    }

    public void setOrigins_addresses(String origins_addresses) {
        this.origins_addresses = origins_addresses;
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(List<Rows> rows) {
        this.rows = rows;
    }
}
