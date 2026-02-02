public class IsPalindrome{
    public static void main(String[] args){
        int number = 1221;
        int reverse = 0;
        if(number < 0){
            System.out.println("Not a Palindrome Number");
            return;
        }
        while(number > reverse){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(number == reverse || number == reverse / 10){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
    }
}