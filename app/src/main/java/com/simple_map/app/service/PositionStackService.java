package com.simple_map.app.service;

import com.simple_map.app.model.Coordinates;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


@Service
public class PositionStackService implements CoordinateService{

    private static final String API_FORWARD_REQUEST = "http://api.positionstack.com/v1/forward?access_key=";
    private static final String ACCESS_KEY = "80d814327e27f8f1cd654bc67e46804a";
    private static final String PRE_QUERY = "&query=";
    private static final String GET_LAT_AND_LONG_ONLY = "&fields=results.latitude,results.longitude";
    private static final String LIMIT_RESULTS = "&limit=1";


    @Override
    public Optional<Coordinates> getCoordinatesByQuery(String query) {
        //To be implemented
        return Optional.empty();
    }

    private String getUrlForQuery(String query){
        return API_FORWARD_REQUEST + ACCESS_KEY + PRE_QUERY + query + GET_LAT_AND_LONG_ONLY + LIMIT_RESULTS;
    }
}
