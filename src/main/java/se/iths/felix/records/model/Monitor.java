package se.iths.felix.records.model;

public record Monitor(String title, int inches) {
    @Override
    public String toString() {
        return "Monitor{" +
                "title='" + title + '\'' +
                ", inches=" + inches +
                '}';
    }
}
