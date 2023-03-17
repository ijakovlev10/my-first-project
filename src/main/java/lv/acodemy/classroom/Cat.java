package lv.acodemy.classroom;

public class Cat
    {
    private String name;
    private String color;
    private int age;
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;

    private final int MAX_ENERGY = 5;

    private  int energy = 5;


        public Cat(String name, String color, String breed, String gender, boolean hasFur) {
            this.name = name;
            this.color = color;
            this.breed = breed;
            this.gender = gender;
            this.hasFur = hasFur;
        }

        public Cat(String barsik) {
        }


        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public String getBreed() {
            return breed;
        }

        public String getGender() {
            return gender;
        }

        public boolean isHasFur() {
            return hasFur;
        }

        public void setWeight(double weight) {
            this.weight = weight;


        }

        public int getEnerg() {
            return energy;
        }


        public void speak() {
        System.out.println("Meow!");
    }

    public void feed() {
        System.out.println("Om-nom-nom!");
    }

    public void walk() {
        System.out.println("walkie-walkie");
        energy--;
    }


    @Override
    public String  toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", hasFur=" + hasFur +
                '}';

    }

        public boolean setAge() {
            return false;
        }

        public boolean setWeight() {
            return false;
        }

        public boolean getEnergy() {
            return false;
        }
    }

