package pattern;

import java.util.Scanner;

public class CharPattern3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int value= sc.nextInt();
        char c='A';
        int i=1;
        while(i<=value){
            int j=1;
            while(j<=i){
                System.out.print(c);
                c++;
                j++;
            }
            c=(char)('A'+i);
            i++;
            System.out.println();
        }
    }
    
}
