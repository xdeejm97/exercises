package Loop;

public class ExampleQuick {

    public static void main(String[] args) {

        String abc = "aabbcccc";
        StringBuilder sb = new StringBuilder();
        char[] charArray = abc.toCharArray();

        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {

            if(i + 1 < charArray.length && charArray[i] == charArray[i+1]){
                counter++;
            }else {

                sb.append(counter).append(charArray[i]);
                counter = 1;
            }
        }
        System.out.println(sb);


    }
}
