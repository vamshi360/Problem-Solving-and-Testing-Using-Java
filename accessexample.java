import java.util.Scanner;
public class accessexample
{
    public static void main(String[] args)
     {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index (0 to " + (numbers.length - 1) + "): ");
        int index = sc.nextInt(); 

        if (index >= 0 && index < numbers.length) {
            System.out.println("Element at index " + index + " = " + numbers[index]);
        } else {
            System.out.println("Invalid index!");
        }
    sc.close();
    }
}
