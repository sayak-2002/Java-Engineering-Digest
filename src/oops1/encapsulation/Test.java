package oops1.encapsulation;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car("Hundai", "i20 xls", "red", 18, 120);

        System.out.println(car1.getColor());
        System.out.println(car1.getBrandName());

        car1.brake(20);
        System.out.println(car1.getSpeed());
    }
}
