package recursion_Q;

public class MergeSort {
    public static void Sort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int mid=(start+end)/2;
        Sort(arr, start, mid);
        Sort(arr,mid+1, end);
        merge(arr, start, end);

    }
    private static void merge(int arr[],int start, int end){
        
        int mid=(start+end)/2; 
        int count=(end+1)-(start+1);
        int o[]=new int[count+1];
        int i=start; 
        int j=mid+1; 
        for(int k=0;k<o.length ;k++){
            if(i<=mid && j<=end){
                if(arr[i]<arr[j]){
                    o[k]=arr[i];
                    i++;
                }else{
                    o[k]=arr[j];
                    j++;
                }
            }
            else if(j>end){
                o[k]=arr[i];
                i++;
            }else{
                o[k]=arr[j];
                j++;
            }
        }
        
        int k=0;
        for(i=0;i<o.length;i++){
            arr[start+i]=o[i];
        }
        

       
    }
    
    public static void main(String[] args) {
        int arr[]={2,3,5,1,0,10};
        Sort(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
