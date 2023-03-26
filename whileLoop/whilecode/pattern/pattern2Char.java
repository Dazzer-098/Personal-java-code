package pattern;

import java.util.Scanner;

public class pattern2Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1=sc.nextInt();
        int i=1;
        while(i<=v1){
            char ch='A';
            int j=1;
            while(j<=v1){
                System.out.print(ch);
                ch= (char)(ch+1);
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
