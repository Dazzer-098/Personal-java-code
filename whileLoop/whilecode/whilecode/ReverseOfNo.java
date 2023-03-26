package whilecode;

import java.util.Scanner;

public class ReverseOfNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        String rev="";
        int Rv=0;//reverse value
        while(input1>0){
            Rv=input1%10;
            rev=rev+String.valueOf(Rv);
            input1=input1/10;
        }
        System.out.println(Integer.parseInt(rev));
    }
    
}