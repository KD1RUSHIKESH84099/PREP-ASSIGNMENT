import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        for(int i = 1; i <= n; i ++ ){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

        }
    }
}
