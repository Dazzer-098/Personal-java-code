package recursion_Q;

public class Quick_sort {
    public static void Quicksort(int arr[],int start,int end) {
        if(start>=end){
            return;
        }
        int pivot_position=partion(arr, start, end);
        Quicksort(arr, start, pivot_position-1);
        Quicksort(arr, pivot_position+1, end);
    }
    public static int partion(int arr[],int start,int end) {
        int pivot=arr[end];
        
        System.out.println();
        int pivot_position;
        int j=start;
        int temp;
        for(int i=start;i<=end;i++){
            if(arr[i]>=pivot){
                temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
            
            // System.out.println();
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();

        pivot_position=j-1;
        return pivot_position;
    }
    public static void main(String[] args) {
        int arr[]={10,18,19,9,2,6,11};
        Quicksort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        // System.out.println(value);
        
    }
}
