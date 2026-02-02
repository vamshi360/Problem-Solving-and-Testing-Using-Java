public class Main {
    public static void main(String[] args) {
        int a = 123;
        int b = 789;

        int lastDigitA = a % 10;
        int lastDigitB = b % 10;

        int sum = lastDigitA + lastDigitB;

        System.out.println(sum);
    }
}
