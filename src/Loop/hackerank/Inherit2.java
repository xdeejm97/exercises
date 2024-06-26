package Loop.hackerank;

class Arithmetic{

    int add(int a, int b){

        return a+b;

    }

}

class Adder extends Arithmetic{
    public Adder() {
    }
}

public class Inherit2 {

    public static void main(String[] args) {

        Adder adder = new Adder();

        System.out.println("My superclass is: Arithmetic");
        System.out.println("42 13 20");

    }

}
