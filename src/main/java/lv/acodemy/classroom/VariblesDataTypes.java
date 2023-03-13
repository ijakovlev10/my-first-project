package lv.acodemy.classroom;

import java.util.Arrays;

public class VariblesDataTypes {
    public static void main(String[] args) {

        byte myCurrentAge = 15;
        System.out.println(myCurrentAge);

        short salaryPerMounth = 1000;
        System.out.println(salaryPerMounth);

        char firstNameLetter = 110; //`N`
        System.out.println(firstNameLetter);

        int dateOfBirth = 200707;
        System.out.println(dateOfBirth);

        long populatiOfLatvia = 1800000;
        System.out.println(populatiOfLatvia);

        float  lapTime =32.30F;
        System.out.println(lapTime);

        double weitgh = 71.5;
        System.out.println(weitgh);

        boolean isWinter = false;
        boolean isSpiring = true;
        boolean inApples = true;
        int a = 10;
        int b = 20;
        int c = a* b;
        System.out.println(c);
        System.out.println(10 * 20);
        System.out.println(a * b);
        System.out.println("20*10");
        System.out.println(c);

        double resault = (double) a / b;
        System.out.println(resault);

        int number = 10 % 9;
        System.out.println(number);
        int[] numbers = {0, 1 ,2 ,3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numbers));

        
    }
}
