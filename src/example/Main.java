package example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("volvo");
        Car car2 = new Car("volvo");

        System.out.println(car == car2);

    }
}
