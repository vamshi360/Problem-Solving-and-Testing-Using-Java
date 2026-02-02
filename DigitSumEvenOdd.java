public class DigitSumEvenOdd{
    public static void main(String[] args){
        int number = 34567;
        int evenSum = 0;
        int oddSum = 0;
        while(number > 0){
            int digit = number % 10;
            if(digit % 2 == 0){
                evenSum += digit;
            }
            else{
                oddSum += digit;
            }
            number = number / 10;
        }
        System.out.println("Sum of Even Digits: "+evenSum);
        System.out.println("Sum od Odd Digits: "+oddSum);
    }
}