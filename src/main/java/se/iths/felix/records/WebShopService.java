package se.iths.felix.records;

import se.iths.felix.records.model.Computer;

import java.util.List;
import java.util.Optional;

public class WebShopService {


    public Computer findMostExpensiveComputer(List<Computer> computerList){
        Computer computer = computerList.stream()
                .sorted( (a, b) -> Double.compare(b.price(),a.price()))
                .findFirst()
                .orElseThrow();
        return computer;
    }

}
