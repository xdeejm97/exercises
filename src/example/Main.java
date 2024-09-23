package example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("volvo");
        Car car2 = new Car("volvo");
        long a = 5;
        long a1 = 15;
        byte b = (byte) ((byte) a/a1);

        System.out.println(car == car2);
        int v = 1/3;
        System.out.println("2+2 = " +2+2);
        System.out.println(v);
        double p = 1.3d;
        System.out.println(p);
        float m = 1/3;

    }
}
