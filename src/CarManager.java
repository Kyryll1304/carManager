public class CarManager {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(1, "Toyota", "Corolla", 2015, "Black", 15000, "AA1234BB"),
                new Car(2, "Ford", "Focus", 2012, "White", 12000, "AA5678CC"),

        };

        printCarsByBrand(cars, "Toyota");
        printCarsByModelAndAge(cars, "Focus", 5);
        printCarsByYearAndPrice(cars, 2015, 14000);
    }

    public static void printCarsByBrand(Car[] cars, String brand) {
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                System.out.println(car);
            }
        }
    }

    public static void printCarsByModelAndAge(Car[] cars, String model, int age) {
        int currentYear = java.time.Year.now().getValue();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYear()) > age) {
                System.out.println(car);
            }
        }
    }

    public static void printCarsByYearAndPrice(Car[] cars, int year, double price) {
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                System.out.println(car);
            }
        }
    }
}