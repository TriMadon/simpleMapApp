package service;

import model.Coordinates;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Service
public class NominatimService implements CoordinateService{

    private static final String API_REQUEST = "https://nominatim.openstreetmap.org/search/";

    private static final String JSON_FORMAT = "?format=json";
    private static final String LIMIT_RESULTS = "&limit=1";
    @Override
    public Coordinates getCoordinatesByQuery(String query) {
        RestTemplate restTemplate = new RestTemplate();
        return Objects.requireNonNull(restTemplate.getForObject(getUrlForQuery(query), Coordinates[].class))[0];
    }

    private String getUrlForQuery(String query){
        return API_REQUEST + query + JSON_FORMAT + LIMIT_RESULTS;
    }
}
