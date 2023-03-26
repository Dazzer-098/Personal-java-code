// Returning single value by adding element of array

package recursion_Q;

public class sum_R {
    private static int  sum(int arr[],int index) {
        if(index==arr.length-1){
            return arr[index];
        }
        return arr[index]+ sum(arr,index+1);
    }
    public static int sum(int arr[]){
        return sum(arr, 0);
    }
    public static void main(String[] args) {
        int arr[]={3,5,6,7};
        System.out.println(sum(arr));
        
    }
}
