package se.iths.felix.records.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.felix.records.WebShopService;

import java.util.List;

public class WebShopServiceMonitorTest {

    @Test
    @DisplayName("Test fetching a monitor less than 30 inches wide. Expected outcome Is Small boy ")
    void findFirstMonitorTitleByMinSize(){
        Monitor monitorWide = new Monitor("Wide boy", 49);
        Monitor monitorAverage = new Monitor("Average boy", 25);
        Monitor monitorSmall = new Monitor("Small boy", 15);

        List<Monitor> monitorList = List.of(monitorWide,monitorAverage,monitorSmall);

        WebShopService webShopService = new WebShopService();

        Monitor result = webShopService.findFirstMonitorTitleByMinSize(monitorList,20);

        Assertions.assertEquals(monitorSmall.title(),result.title());
    }
}
