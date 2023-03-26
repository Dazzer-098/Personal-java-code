package Arraycode;

import java.util.Scanner;

public class sort_0_1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int[size];
        for(int l=0;l<size;l++){
            arr[l]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int j=0;j<size;j++){
            System.out.print(arr[j]);
        }

        
    }
    
}
