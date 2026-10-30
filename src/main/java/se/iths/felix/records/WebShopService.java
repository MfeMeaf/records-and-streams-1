package se.iths.felix.records;

import se.iths.felix.records.model.Computer;
import se.iths.felix.records.model.Headset;
import se.iths.felix.records.model.Mouse;
import se.iths.felix.records.model.Phone;

import java.util.List;
import java.util.Optional;

public class WebShopService {


    public Computer findMostExpensiveComputer(List<Computer> computerList) {
        Computer computer = computerList.stream()
                .sorted((a, b) -> Double.compare(b.price(), a.price()))
                .findFirst()
                .orElseThrow();
        return computer;
    }

    public Phone findFirstPhoneUnderPrice(List<Phone> phones, double maxPrice) {
        Phone phone = phones.stream()
                .filter(a -> a.price() < maxPrice)
                .findFirst()
                .orElseThrow();
        return phone;
    }


    public Mouse findFirstMouseByMinDpi(List<Mouse> mice, int minDpi) {
        return mice.stream()
                .filter(mouse -> mouse.dpi() >= minDpi)
                .findFirst()
                .orElseThrow();

    }
    public String findFirstHeadsetTitleUnderPrice(List<Headset> headsets, double maxPrice){
return headsets.stream()
        .filter(headset -> headset.price() < maxPrice)
        .map(headset -> headset.title())
        .findFirst()
        .orElseThrow();
    }
}

