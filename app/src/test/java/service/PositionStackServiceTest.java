package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionStackServiceTest {

    @Test
    void getCoordinatesByQuery() {
        PositionStackService service = new PositionStackService();
        System.out.println(service.getCoordinatesByQuery("1600 Pennsylvania Ave NW, Washington DC"));
    }


}