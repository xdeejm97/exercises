package example;

public record Car(String name) {
    public Car{
        System.out.println("Brum brum!");
    }
}
