import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Apple", "iPhone 12", 999.99));
        phones.add(new Phone("Samsung", "Galaxy S21", 899.99));
        phones.add(new Phone("Google", "Pixel 5", 699.99));
        phones.add(new Phone("Apple", "iPhone SE", 399.99));
        phones.add(new Phone("Samsung", "Galaxy A51", 299.99));

        // Создание ArrayList моделей конкретного производителя (например, Apple)
        String manufacturer = "Apple";
        List<Phone> applePhones = phones.stream()
                .filter(phone -> phone.getManufacturer().equals(manufacturer))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Модели телефонов производителя " + manufacturer + ":");
        for (Phone phone : applePhones) {
            System.out.println(phone.getModel());
        }
        System.out.println();

        // Сортировка списка объектов класса Phone по стоимости
        List<Phone> sortedPhones = phones.stream()
                .sorted(Comparator.comparingDouble(Phone::getPrice))
                .collect(Collectors.toList());

        System.out.println("Сортированный список телефонов:");
        for (Phone phone : sortedPhones) {
            System.out.println("Модель: " + phone.getModel() + ", Стоимость: $" + phone.getPrice());
        }

    }
}