package RideShareSelector.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Elements {
    private ElementData distance; //List<Distance> distance
    private ElementData duration; //List<Duration> duration

    public ElementData getDistance() {
        return distance;
    }

    public void setDistance(ElementData distance) {
        this.distance = distance;
    }

    public ElementData getDuration() {
        return duration;
    }

    public void setDuration(ElementData duration) {
        this.duration = duration;
    }
}
