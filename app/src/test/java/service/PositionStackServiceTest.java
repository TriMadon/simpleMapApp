package service;

import com.simple_map.app.service.PositionStackService;
import org.junit.jupiter.api.Test;

class PositionStackServiceTest {

    @Test
    void getCoordinatesByQuery() {
        PositionStackService service = new PositionStackService();
        System.out.println(service.getCoordinatesByQuery("1600 Pennsylvania Ave NW, Washington DC"));
    }


}