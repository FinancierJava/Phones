
public class Phone implements Comparable<Phone> {
    private String manufacturer;
    private String model;
    private double price;
    public Phone(String manufacturer, String model, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Phone other) {
        return Double.compare(this.price, other.price);
    }
}
