package se.iths.felix.records.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.iths.felix.records.WebShopService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WebShopServiceMouseTest {
    @Test
    void testFindFirstMouseByMinDpi() {
        WebShopService service = new WebShopService();
        Mouse mouse1 = new Mouse("Logitech", 800);
        Mouse mouse2 = new Mouse("Razer", 3200);
        Mouse mouse3 = new Mouse("SteelSeries", 1600);

        List<Mouse> mice = List.of(mouse1, mouse2, mouse3);
        Mouse result = service.findFirstMouseByMinDpi(mice, 1500);

        assertEquals(mouse2, result);
    }

}