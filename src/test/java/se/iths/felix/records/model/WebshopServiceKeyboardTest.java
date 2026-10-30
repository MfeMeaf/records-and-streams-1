package se.iths.felix.records.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.felix.records.WebShopService;

import java.util.List;

public class WebshopServiceKeyboardTest {
    @Test
    @DisplayName("Test fetching first wireless keyboard. Expected outcome is Wireless Keyboard")
    void findFirstKeyboardByWireless(){
        Keyboard notWirelessKeyboard = new Keyboard("This is not a wireless keyboard", false);
        Keyboard wirelessKeyboard = new Keyboard("wireless keyboard", true);

        List<Keyboard> keyboardList = List.of(notWirelessKeyboard,wirelessKeyboard);

        WebShopService webShopService = new WebShopService();

        Keyboard result = webShopService.findFirstKeyboardByWireless(keyboardList,true);

        Assertions.assertEquals(wirelessKeyboard,result);
    }
}
