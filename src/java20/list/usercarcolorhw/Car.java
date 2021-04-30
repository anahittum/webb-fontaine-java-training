package java20.list.usercarcolorhw;

public class Car {
    private final String VIN;
    private String color;

    public String getVIN() {
        return VIN;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String VIN, String color) {
        this.VIN = VIN;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN='" + VIN + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
