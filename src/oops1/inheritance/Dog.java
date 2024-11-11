package oops1.inheritance;

public class Dog extends Animal {
    String name;
    String color;

    void makeSound() {
        System.out.println("Woof..");
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.name = "Bob";
        d1.color = "Black";
        d1.makeSound();

        System.out.println(d1.name);
        System.out.println(d1.color);
    }
}