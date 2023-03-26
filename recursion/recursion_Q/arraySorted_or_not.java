package recursion_Q;

public class arraySorted_or_not {

    public static boolean sorted(int arr[],int a_length) {
        if(a_length==1){
            return true;
        }
        else{
            boolean sorted_a=sorted(arr,a_length-1);
            if(!sorted_a){
                return false;
            }
            else if(arr[a_length-1]<arr[a_length-2]){
                return false;
            }
            else{
                return true;
            }
        }
    }
    public static int[] sortedA(int arr[],int a_length) {
        if(a_length==1){
            return arr;
        }
        for (int i = 0; i < a_length-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            
        }
        return sortedA(arr, a_length-1);

        
    }
    public static int[] sorted_selection(int arr[],int a_length) {
        if(a_length==1){
            return arr;
        }
        int max=arr[a_length-1];
        int max_index=a_length-1;
        for (int i = a_length-2; i >=0; i--) {
            if(arr[i]>max){
                max=arr[i];
                max_index=i;
            }
            
            
        }
        if(max!=arr[a_length-1]){
            int temp=arr[a_length-1];
            arr[a_length-1]=max;
            arr[max_index]=temp;
        }
        return sorted_selection(arr, a_length-1);
        
    }

    public static void main(String[] args) {
        int arr[]={9,0,1,3,4};
        arr=sorted_selection(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    
}
