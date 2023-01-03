package service;

import model.Coordinates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NominatimServiceTest {

    @Test
    void getCoordinatesByQuery() {
        NominatimService service = new NominatimService();
        Coordinates coordinates = service.getCoordinatesByQuery("1600 Pennsylvania Ave NW, Washington DC");
        assertEquals(38.897699700000004, coordinates.getLatitude());
    }
}