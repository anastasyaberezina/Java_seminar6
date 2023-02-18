package Lesson6;

import java.util.List;
import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        Laptops();
    }

    private static void Laptops() {
        class Laptop {
            double diagonal;
            String screenResolution;
            String processor;
            int memory;
            int batteryCapacity;

            public Laptop(double diagonal, String screenResolution, String processor, int memory, int batteryCapacity) {
                this.diagonal = diagonal;
                this.screenResolution = screenResolution;
                this.processor = processor;
                this.memory = memory;
                this.batteryCapacity = batteryCapacity;
            }

            public String toString() {
                return String.format("diagonal: %s, screenResolution: %s , processor: %d , memory: %s ГБ, batteryCapacity: %s МАЧ", diagonal, screenResolution, processor, memory, batteryCapacity);
            }

            Laptop Asus = new Laptop(14, "800×600", "Intel Pentium", 4, 4000);
            Laptop Samsung = new Laptop(17, "1024×768", "Intel Core", 4, 5000);
            Laptop Huawei = new Laptop(19, "1366х768", "Intel Core", 8, 6600);
            Laptop HP = new Laptop(17, "1024×768", "AMD Ryzen", 6, 4500);
            Laptop Lenovo = new Laptop(16, "1366х768", "Intel Pentium", 4, 4800);

            List<Laptop> laptopsList = List.of(Asus, Samsung, Huawei, HP, Lenovo);


            public boolean equals(Object o) {
                Laptop a = (Laptop) o;
                Scanner scan = new Scanner(System.in);
                System.out.println("По какому параметру нужно сравнить(diagonal, ...)?: " );
                String user = scan.next();
                return user == a.user;
            }
        }
    }
}

