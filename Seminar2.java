package Lesson6;

import java.util.List;
import java.util.ArrayList;

public class Seminar2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", "Мэйнкун", 5, 7.2);
        Cat cat2 = new Cat("Мартин", "Дворняга", 3, 4.8);

/*//        cat1.weight = -1;
        cat1.setWeight(7.2);
        cat1.age = 5;
        cat1.breed = "Мэйнкун";
        cat1.name = "Васька";*/

//        System.out.println(cat1.getWeight());

        List<Cat> cats = List.of(cat1, cat2);

        for (Cat cat : cats) {
            cat.getSound();
        }

    }
}
