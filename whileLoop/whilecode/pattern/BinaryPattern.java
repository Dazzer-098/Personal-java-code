package pattern;

import java.util.Scanner;

public class BinaryPattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int value= sc.nextInt();
        int i=1;
        int j;
        while(i<=value){
            j=1;
            while(j<=value){
                if(i%2!=0){
                    if(j%2!=0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }else{
                    if(j%2==0){
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
    
}
