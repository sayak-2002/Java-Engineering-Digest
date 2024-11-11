package oops1.inheritance;

public class Dog extends Animal {
    String name;
    String color;

    void makeSound() {
        System.out.println("Barking.....");
    }
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.name = "Kaju";
        d1.color = "Black";
        d1.makeSound();

        System.out.println(d1.name);
        System.out.println(d1.color);
        System.out.println(d1.noOfLegs);
        System.out.println(d1.walk());
    }
}