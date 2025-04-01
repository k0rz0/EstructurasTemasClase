package Temas.Colection;

import java.util.ArrayList;
import java.util.List;

public class Pruebas {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        for (String fruit : fruits) {
            if (fruit.equals("Banana")) {
                fruits.remove("Apple");
            }
        }
        System.out.println(fruits.size());

    }

}
