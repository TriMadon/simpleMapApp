package service;

import com.simple_map.app.model.Coordinates;
import com.simple_map.app.service.NominatimService;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NominatimServiceTest {

    @Test
    void getCoordinatesByQuery() {
        NominatimService service = new NominatimService();
        Optional<Coordinates> coordinates = service.getCoordinatesByQuery("1600 Pennsylvania Ave NW, Washington DC");
        assertEquals(38.897699700000004, coordinates.get().getLatitude());
    }
}