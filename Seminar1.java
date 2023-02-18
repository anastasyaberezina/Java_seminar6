package Lesson6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Seminar1 {
    public static void main(String[] args) {
        ex10();
        System.out.println(new Seminar1());
    }

    private static void ex10() {
        List<String> data = List.of("Яблоко", "Апельсин", "Мандарин", "Арбуз");
        System.out.println(new HashSet<>(data));
        System.out.println(new LinkedHashSet<>(data));
        System.out.println(new TreeSet<>(data));
    }

    @Override
    public String toString() {
        return "Seminar1";
    }
}

