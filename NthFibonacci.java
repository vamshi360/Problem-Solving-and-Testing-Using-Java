public class NthFibonacci{
    public static void main(String[] args){
        int n=7;
        if(n == 0){
            System.out.println(0);
            return;
        }
        int a=0 , b=1;
        for(int i=2; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Nth Fibonacci number is: " +b);
    }
}