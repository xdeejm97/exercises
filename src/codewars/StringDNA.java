package codewars;

public class StringDNA {
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
    public static String makeComplement(String dna) {
        //Your code
        StringBuilder res= new StringBuilder();
        String[] array = dna.split("");

        for (String a : array){
            if(a.equals("A")){
                res.append("T");
            }else if(a.equals("T")){
                res.append("A");
            }else if(a.equals("C")){
                res.append("G");
            }else {
                res.append("C");
            }

        }
        return res.toString();
    }

}
