package se.iths.felix.records;

import se.iths.felix.records.model.Computer;
import se.iths.felix.records.model.Monitor;
import se.iths.felix.records.model.Mouse;
import se.iths.felix.records.model.Phone;

import java.util.List;
import java.util.Optional;

public class Main {
    static void main() {
        Computer pc = new Computer("PC",10000);
        Computer computer = new Computer("Kebabputer", 15000);
        Phone magicPhone = new Phone("Orb 120", 9999);
        Phone magePhone = new Phone("Frog Phone", 5000);
        Mouse mouse = new Mouse("mouse",1450);
        Mouse mouse1 = new Mouse("mouse1",1660);
        Monitor monitorWide = new Monitor("Wide boy", 49);
        Monitor monitorNotSoWide = new Monitor("Average boy", 25);


        List<Computer> computerList = List.of(pc,computer);
        List<Phone> phoneList = List.of(magicPhone,magePhone);
        List<Mouse>mice = List.of(mouse,mouse1);
        List<Monitor> monitorList = List.of(monitorWide,monitorNotSoWide);

        WebShopService webShopService = new WebShopService();
        IO.println(webShopService.findFirstPhoneUnderPrice(phoneList, 6000));
        IO.println(webShopService.findMostExpensiveComputer(computerList));
        IO.println(webShopService.findFirstMouseByMinDpi(mice,1500));
        IO.println(webShopService.findFirstMonitorTitleByMinSize(monitorList,30));

//        Optional<Computer> mostExpensive =
//                webShopService.findMostExpensiveComputer(computerList);
//
//        if(mostExpensive.isPresent()){
//            IO.println(mostExpensive.get());
//        }



        }
    }

