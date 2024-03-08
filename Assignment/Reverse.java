import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ans = "";
        String s = input.nextLine();
        for(int i = s.length() - 1 ;i >= 0; i --){
            ans += s.charAt(i);
        }
        System.out.println(ans);
        
    }
    
}
