package se.iths.felix.records.model;

public record Mouse(String title, int dpi) {
    @Override
    public String toString() {
        return "Mouse{" +
                "title='" + title + '\'' +
                ", dpi=" + dpi +
                '}';
    }
}
