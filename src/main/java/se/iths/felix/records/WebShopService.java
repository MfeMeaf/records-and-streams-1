package se.iths.felix.records;

import se.iths.felix.records.model.Computer;

import java.util.List;
import java.util.Optional;

public class WebShopService {


    public Optional<Computer> findMostExpensiveComputer(List<Computer> computerList){
        Optional<Computer> computer = computerList.stream()
                .sorted( (a, b) -> Double.compare(b.price(),a.price()))
                .findFirst();
        return computer;
    }

}
