package se.iths.felix.records.model;

public record Webcam(String titel, int megapixels) {
    @Override
    public String toString() {
        return "Webcam{" +
                "titel='" + titel + '\'' +
                ", megapixels=" + megapixels +
                '}';
    }
}
