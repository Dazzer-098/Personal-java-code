import java.util.Scanner;

public class CharacterCase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.next();
        char c= s.charAt(0);
        if('a'<=c&&c<='z'){
            System.out.println("0");

        }else if('A'<=c&&c<='Z'){
            System.out.println("1");
        }else{
            System.out.println("-1");
        }

    }
    
}
