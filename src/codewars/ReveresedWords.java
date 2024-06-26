package codewars;

public class ReveresedWords {
    public static void main(String[] args) {

        String s = "Hey fellow warriors";


        String[] array = s.split(" ");

        StringBuilder concated = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            if(array[i].length() > 4){
                concated.append(new StringBuilder(array[i]).reverse());
                concated.append(" ");
            }else {
                concated.append(array[i]);
                concated.append(" ");
            }



        }
        System.out.println(concated.substring(0, concated.length() -1));



    }
}
