
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int noOfTerms = 10;
        int num = 1;
        sumOfNumbers(noOfTerms, num, 0);

    }

    static void sumOfNumbers(int terms, int num, int sum) {
        if (num == terms) {
            sum = sum + num;
            System.out.println(sum);
            return;
        }
        sum = sum + num;
        sumOfNumbers(terms, num + 1, sum);
    }
}
