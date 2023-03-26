package recursion_Q;

import java.util.Arrays;

public class practice {
    // public static boolean unique(int arr[]) {
    //     int count=0;
    //     Arrays.sort(arr);
        
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]!=arr[i+1]){
    //             count++;
    //         }
    //     }
    //     int arr1[]=new int[count+1];
    //     int value=0;
    //     count=0;
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i]==arr[i+1]){
    //             count++;
    //         }else{
    //             arr1[value]=count+1;
    //             value++;
    //             count=0;
    //         }
    //     }
    //     arr1[value]=count+1;
    //     for(int i=0;i<arr1.length;i++){
    //         System.out.print(arr1[i]+" ");
    //     }
        
        
    //     for(int i=0;i<arr1.length-1;i++){
    //         for(int j=i+1;j<arr1.length;j++){
    //             if(arr1[j]==arr1[i]){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
        

        
    // }
    public static String duplicate( String s, int k) {
        char arr[]=s.toCharArray();
        String value="";
        int count;
        // Arrays.sort(arr);
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        for(int i=0;i<arr.length;i++){
            count=0;
            int j;
            for(j=0;j<arr.length;j++){
                
                if(arr[i]==arr[j]){
                    count++;
                
                }
            }
            int r=count%k;
            if(count==k){
                continue;
            }
            else if(count<k){
                for(int x=0;x<count;x++){
                    value=value+String.valueOf(arr[i]);
                }
                // value=value+String.valueOf(arr[i]);
                
            }
            else{
                for(int x=0;x<=r;x++){
                    value=value+String.valueOf(arr[i]);
                }
            }
            
        }
        return value;


        
    }

    public static void main(String[] args) {
        String s="deeedbbcccbdaa";
        // System.out.println(unique(arr));
        System.out.println(duplicate(s,3));
        
        // System.out.println(ans);
    }   
}
