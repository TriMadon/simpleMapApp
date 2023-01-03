package service;

import model.Coordinates;

public interface CoordinateService {
    Coordinates getCoordinatesByQuery(String query);
}
