package lv.acodemy.classroom;

import static java.lang.System.out;

public class ObjectExample {
    public static void main(String[] args) {

        Cat barsik;
        barsik = new Cat("barsik");
        out.println(barsik.getAge());
        out.println(barsik);

        barsik.setAge(4);
        out.println(barsik.getAge());

        barsik.setWeight(6);
        out.println(barsik.getWeight());



        barsik.speak();
        barsik.feed();

        Cat marusya = new Cat( "Marusya", "gray", "unknow", "female", "true");
        marusya.setAge(1);
        marusya.setWeight(2.0);
        out.println(marusya);

        out.println("My cat`s name is :%. My cat is %d years old.\n", marusya.getName(), marusya.getAge());

        marusya.walk();
        out.println(marusya.getEnergy());

    }
}
