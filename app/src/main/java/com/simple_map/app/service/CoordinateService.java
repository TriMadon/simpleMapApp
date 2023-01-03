package com.simple_map.app.service;

import com.simple_map.app.model.Coordinates;

import java.util.Optional;

public interface CoordinateService {
    Optional<Coordinates> getCoordinatesByQuery(String query);
}
