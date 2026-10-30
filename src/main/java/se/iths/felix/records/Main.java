package se.iths.felix.records;

import se.iths.felix.records.model.Computer;

import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {
        Computer pc = new Computer("PC",10000);
        Computer computer = new Computer("Kebabputer", 15000);

        List<Computer> computerList = List.of(pc,computer);

        WebShopService webShopService = new WebShopService();
        Optional<Computer> mostExpensive =
                webShopService.findMostExpensiveComputer(computerList);

        if(mostExpensive.isPresent()){
            IO.println(mostExpensive.get());
        }
    }
}
