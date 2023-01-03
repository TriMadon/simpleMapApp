package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coordinates {
    @JsonProperty("lat")
    private Double latitude;

    @JsonProperty("lon")
    private Double longitude;

    @Override
    public String toString() {
        return "Coordinates{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
