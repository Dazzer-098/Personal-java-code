package Arraycode;

import java.util.Scanner;

public class Array_intersection {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size1=sc.nextInt();
        int input1[]=new int[size1];

        for(int i=0;i<size1;i++){
            input1[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int input2[]=new int[size2];

        for(int i=0;i<size2;i++){
            input2[i]=sc.nextInt();
        }
        
        
        for(int j=0;j<size1;j++){
            int count=0;
            for(int k=0;k<size2;k++){
                if(input1[j]==input2[k]){
                    count=count+1;
                    input2[k]=0;
                    break;
                }
            }
            
            if(count>0){
                
                System.out.println(input1[j]);
            }
        }
        
    }
    
}
