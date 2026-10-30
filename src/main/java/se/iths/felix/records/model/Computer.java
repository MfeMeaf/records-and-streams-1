package se.iths.felix.records.model;

public record Computer(String title, double price) {

    @Override
    public String toString() {
        return "Computer{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
