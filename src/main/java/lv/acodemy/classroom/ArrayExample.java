package lv.acodemy.classroom;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(numbers[4]);
        int apples = numbers[6];
        System.out.println("i have " + apples + "apples");
        System.out.println("Number array contains of: " + numbers.length + " numbers");

        numbers[0] = 90;
        numbers[9] = 50;
        System.out.println(Arrays.toString(numbers));

        int[] eurbior = new int[10];
        eurbior[0];
        eurbior[1] = 5;
        System.out.println(Arrays.toString(eurbior));

        String[] names = {"John". "Andrew", "Mike", "Anna", "Marija"};
        System.out.println(names.length);
        System.out.println("My name is" + names[2]);

        names[3] = "Mark";
        System.out.println(Arrays.toString(names));
    }
}
