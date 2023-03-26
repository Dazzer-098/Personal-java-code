package Sort;





public class Selection {
    public static void sort(int arr[]){
        int count=0;
        for(int i=0;i<arr.length-1;i++){
            int min=arr[i];
            int min_index=i;
            // after second for loop we get 1 minimum element. 
            for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<min){
                        min=arr[j];
                        min_index=j;
                    }
                    
                    
                }
                if(min_index!=i){
                    arr[min_index]=arr[i];
                    arr[i]=min;
                    count=count+1;
                }
                
                
        }
            
    
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.println(count);
        // return arr;
    }
    public static int second_largest(int arr[],int value){
        return arr[arr.length-value];
    }
    
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        int []arr={0,1,2,0,2,0,1};
        // int largest=2;
        sort(arr);
        // System.out.println(second_largest(arr1,largest));
    }
}
