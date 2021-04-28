package model;

public class Car {
    private String model;
    private int yearOfManufacture;
    private int price;

    public Car(String model, int yearOfManufacture, int price) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", price=" + price +
                '}';
    }
}
