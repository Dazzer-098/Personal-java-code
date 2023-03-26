package Arraycode;

import java.util.Scanner;

public class unique {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int number[]= new int[size];
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        for(int j=0;j<size;j++){
            int count=0;
            for(int k=j+1;k<size;k++){
                if(number[j]==number[k]){
                    count=count+1;
                    
                }
            }
            if(count>0){
                System.out.println(number[j]);
                
            }
        }
    }
    
}
