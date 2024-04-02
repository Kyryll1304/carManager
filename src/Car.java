class Car {
    private int id;
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private String registrationNumber;

    // Конструктор
    public Car(int id, String brand, String model, int year, String color, double price, String registrationNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    // Геттери
    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String toString() {
        return String.format("Car{id=%d, brand='%s', model='%s', year=%d, color='%s', price=%.2f, registrationNumber='%s'}",
                id, brand, model, year, color, price, registrationNumber);
    }
}