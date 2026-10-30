package se.iths.felix.records.model;

public record Keyboard(String title, boolean wireless) {
    @Override
    public String toString() {
        return "Keyboard{" +
                "title='" + title + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
