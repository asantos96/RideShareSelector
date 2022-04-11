package RideShareSelector.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Elements {
    private List<Distance> distance; //List<Distance> distance
    private List<Duration> duration; //List<Duration> duration

    public List<Distance> getDistance() {
        return distance;
    }

    public void setDistance(List<Distance> distance) {
        this.distance = distance;
    }

    public List<Duration> getDuration() {
        return duration;
    }

    public void setDuration(List<Duration> duration) {
        this.duration = duration;
    }
}
