package se.iths.felix.records.model;

import org.junit.jupiter.api.Test;
import se.iths.felix.records.WebShopService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebShopServiceWebcamTest {
    @Test
    void testFindFirstWebcamTitleByMinPix(){
        Webcam webcam1 = new Webcam("Webcam",10);
        Webcam webcam2 = new Webcam("Webcam2",7);
        Webcam webcam3 = new Webcam("Webcam3",14);

        List<Webcam> webcamList = List.of(webcam1,webcam2,webcam3);

        WebShopService service = new WebShopService();

        String result =service.findFirstWebcamTitleByMinResolution(webcamList,9);

        assertEquals("Webcam",result);
    }
}
