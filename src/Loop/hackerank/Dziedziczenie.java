package Loop.hackerank;

class Animal {

    void walk(){
        System.out.println("I am walking");
    }
}



class Bird extends Animal{

    void flying(){
        System.out.println("I am flying");
    }

    void sing(){
        System.out.println("I am singing");
    }

}

public class Dziedziczenie {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Bird bird = new Bird();
        bird.walk();
        bird.flying();
        bird.sing();

    }
}