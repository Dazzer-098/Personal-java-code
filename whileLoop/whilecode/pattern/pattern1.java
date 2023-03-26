package pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int NR= sc.nextInt();
        int i=1;
        while(i<NR){
            int j= 0;
            int v=NR;
            while(j<NR){
                System.out.print(v);
                v=v-1;
                j++;
            }
            System.out.println();
            i++;
        }
    }
    
}
