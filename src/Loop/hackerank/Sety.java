package Loop.hackerank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sety {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        sc.nextLine();

        Set<String> set = new HashSet<>();


        for (int i = 0; i < n; i++) {
            String se = sc.nextLine();
            set.add(se);
            System.out.println(set.size());
        }


        }
        
    }
