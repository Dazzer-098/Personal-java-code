package Arraycode;

import java.util.Scanner;

public class pair_sum {
     public static int  pair(int Arr[] , int x) {
        int count=0;
        for(int i=0;i<Arr.length;i++){
            for(int j=i+1;j<Arr.length;j++){
                for(int k=j+1;k<Arr.length;k++){
                    if(Arr[i]+Arr[j]+Arr[k]==x){
                        count=count+1;
                    }
                }
                
            }
        }
        return count;
        
     }  
     
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        
        int input[]= new int[size];
        for(int i=0;i<size;i++){
            input[i]=sc.nextInt();
        } 
        int X=sc.nextInt();
        System.out.println(pair(input, X));

     }
}
