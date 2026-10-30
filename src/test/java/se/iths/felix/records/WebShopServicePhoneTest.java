package se.iths.felix.records;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.iths.felix.records.model.Phone;

import java.util.List;

class WebShopServicePhoneTest{
@Test
@DisplayName("Test the findFirstPhoneUnderPrice method expect to get Frog phone")
void findFirstPhoneUnderPrice() {
    // Arrange
    Phone magicPhone = new Phone("Orb 120", 9999);
    Phone magePhone = new Phone("Frog Phone", 5000);
    Phone wizardPhone = new Phone("", 2000);

    List<Phone> phoneList = List.of(magicPhone,magePhone,wizardPhone);

    WebShopService webShopService = new WebShopService();

    // Act
    Phone result = webShopService.findFirstPhoneUnderPrice(phoneList,6000);

    // Assert
    Assertions.assertEquals(magePhone,result);
    }
}