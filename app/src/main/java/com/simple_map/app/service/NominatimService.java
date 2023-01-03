package com.simple_map.app.service;

import com.simple_map.app.model.Coordinates;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;
import java.util.Optional;

@Service
@Primary
public class NominatimService implements CoordinateService{

    private static final String API_REQUEST = "https://nominatim.openstreetmap.org/search/";

    private static final String JSON_FORMAT = "?format=json";
    private static final String LIMIT_RESULTS = "&limit=1";
    @Override
    public Optional<Coordinates> getCoordinatesByQuery(String query) {
        RestTemplate restTemplate = new RestTemplate();
        Coordinates[] coordinateArray = restTemplate.getForObject(getUrlForQuery(query), Coordinates[].class);
        if (coordinateArray.length == 0)
            return Optional.empty();
        else
            return Optional.ofNullable(coordinateArray[0]);
    }

    private String getUrlForQuery(String query){
        return API_REQUEST + query + JSON_FORMAT + LIMIT_RESULTS;
    }
}
