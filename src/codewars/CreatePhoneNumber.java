package codewars;

public class CreatePhoneNumber {

    public static void main(String[] args) {
        CreatePhoneNumber.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}); // => returns "(123) 456-7890"
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!


        if(numbers.length != 10){
            return "Wrong";
        }else {
            return "("+ numbers[0] + numbers[1] + numbers[2]  + ") "
                    + numbers[3] + numbers[4] + numbers[5]
                    + "-" + numbers[6] + numbers[7] + numbers[8] + numbers[9];
        }

    }

}
