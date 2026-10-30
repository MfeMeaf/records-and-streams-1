package se.iths.felix.records.model;

import org.junit.jupiter.api.Test;
import se.iths.felix.records.WebShopService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WebshopServiceHeadsetTest {
    @Test
    void testFindHeadsetUnderPrice() {

        Headset headset = new Headset("Headset", 500);
        Headset headset1 = new Headset("Headset1", 5000);
        Headset headset2 = new Headset("Headset2", 300);

        List<Headset> headsetList = List.of(headset,headset1,headset2);

        WebShopService service= new WebShopService();
        String result = service.findFirstHeadsetTitleUnderPrice(headsetList,1000);
        assertEquals("Headset",result);

    }
}