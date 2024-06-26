import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
       // String number = "123456";
       // int parsedNumber = Integer.parseInt(number);
       // int counting = 1;
       //
       // while (parsedNumber > 0) {
       //     int[] newNumber = new int[]{parsedNumber % 10};
       //     parsedNumber = parsedNumber / 10;
//
       //     for (int i = 0; i < newNumber.length; i++) {
       //         counting *= newNumber[i];
       //     }
       // }
       // System.out.println(counting);
       // int secCount = counting;
//
//        int[] array = new int[]{1, 2, 3, 4, 5};
//        int ints = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            ints  += array[i];
//        }
//        System.out.println(ints);
//        System.out.println("//////////");
//
//        String strOfInts = "";
//        for (int i = 0; i < array.length; i++) {
//            strOfInts += array[i];
//        }
//        System.out.println(strOfInts);
//        System.out.println("//////////");
//
//        String[] arrayString = new String[]{"a", "b", "c", "d", "e", "f"};
//        String str = "";
//
//        for (int i = 0; i < array.length; i++) {
//            str  += arrayString[i];
//        }
//        System.out.println(str.toUpperCase());




                Scanner sc = new Scanner(System.in);
                int t=sc.nextInt();

                for(int i=0;i<t;i++)
                {

                    try
                    {
                        long x=sc.nextLong();
                        System.out.println(x+" can be fitted in:");
                        if(x>=-128 && x<=127)System.out.println("* byte");
                            //Complete the code
                        else if(x>=-32768 && x<=32767)System.out.println("* short\n" + "* int\n" + "* long");
                        else if(x>=-2147483648 && x<=2147483647)System.out.println("* int\n" + "* long");

                        else if(x>=-9223372036854775808L && x<=9223372036854775807L)System.out.println("* long");

                    }
                    catch(Exception e)
                    {
                        System.out.println(sc.next()+" can't be fitted anywhere.");
                    }

                }
            }
        }
