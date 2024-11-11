package oops1.inheritance;

public class Cat {
    String name;
    String color;
    void makeSound() {
        System.out.println("Meow...");
    }

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Tom";
        c1.color = "White";
        c1.makeSound();

        System.out.println(c1.name);
        System.out.println(c1.color);
    }
}
