package se.iths.felix.records;

import se.iths.felix.records.model.*;

import java.util.List;
import java.util.NoSuchElementException;
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
                .orElseThrow(NoSuchElementException::new);
        return phone;
    }

    public Monitor findFirstMonitorTitleByMinSize(List<Monitor> monitors, int minInches){
        Monitor monitor = monitors.stream()
                .filter(a -> a.inches() < minInches)
                .findFirst()
                .orElseThrow(NoSuchElementException::new);
        return monitor;
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
    public String findFirstWebcamTitleByMinResolution(
            List<Webcam> webcamList, int minMegapixels){
        return webcamList.stream()
                .filter(webcam -> webcam.megapixels() >= minMegapixels)
                .map(webcam -> webcam.titel())
                .findFirst()
                .orElseThrow();

    }

}

