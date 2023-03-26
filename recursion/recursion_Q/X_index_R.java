package recursion_Q;

import java.util.Scanner;

public class X_index_R {
    private static int[] indexes(int arr[],int output[],int count,int index,int value){
        if(index==arr.length-1){
            if(arr[index]==value){
                output[count]=index;
            }
            return output;
        }
        if(arr[index]==value){
            output[count]=index;
            count++;
        }

        return indexes(arr, output, count,index+1,value);
    }
    public static void indexes(int arr[],int value) {
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==value){
                count++;
            }
        }
        if(count>1){
            int output[]=new int[count];
            output=indexes(arr, output,0,0,value);
//********************** print all index of value ***************/  
            // for(int i=0;i<output.length;i++){
            //     System.out.print(output[i]+" ");
            // }

//***************************for specific index ************/ 
            System.out.println(output[0]);
        }
        else{
            System.out.println(value+" is not present in array");
        }

    }

    public static void main(String[] args) {
        
        // int arr[]={2,3,6,9,8,6,6};
        // indexes(arr, 6);
        String s= "abxcxd"+'c';
        System.out.println(s.substring(7));
    }
    
}
