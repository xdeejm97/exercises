package Loop;

public class TrojkatyZFoR {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.print("$ ");
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print("# ");
            for (int j = 4; j >= i; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 6; i > 0; i--) {
            System.out.print(" ");
            for (int j = 0; j < i; j++) {
                System.out.print("% ");
            }
            System.out.println();
        }
    }
}