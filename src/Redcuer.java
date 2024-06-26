public class Redcuer {
    public static void main(String[] args) {
        Redcuer reducer = new Redcuer();
        String numberToReduce = "123";
        int reducedValue = reducer.reduce(numberToReduce);
        System.out.println("Number to reduce: " + numberToReduce);
        System.out.println("After reduce: " + reducedValue);
    }

    public int reduce(String number){
        String[] dividedNumbers = number.split("");
        for (int i = 0; i < dividedNumbers.length - 1; i++) {
        }
        return 0;
    }
}
