package codewars;

public class Maskify {


    public static void main(String[] args) {
        System.out.println(maskify("2131"));


    }
    public static String maskify(String str){

        String cip = "";

        if(str.length() <= 4){
            System.out.println(str);
        }else {

            for (int i = 0; i < str.length() - 4; i++) {
                cip += "#";
            }
            String substarcted = str.substring(str.length()-4);
            cip = cip + substarcted;
        }
        return cip;


    }

}
