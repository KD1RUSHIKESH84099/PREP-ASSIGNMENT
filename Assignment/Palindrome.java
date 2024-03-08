import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int p = 0, q = s.length() - 1;
        while(p <= q){
            if(s.charAt(p) != s.charAt(q)) {
            System.out.println("Given String Is Not Palindrome");
            return;
            }
            p ++;
            q --;
        }
        System.out.println("Given String Is Palindrome");

        
    }
    
}
