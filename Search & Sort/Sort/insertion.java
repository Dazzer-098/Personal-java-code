package Sort;

public class insertion {
    public static void sort(int arr[]) {
        int n=arr.length;
        for(int i=1;i<=n-1;i++){
            int key=arr[i];
            int j=0;
            for(j=i-1;j>=0 &&key<arr[j];j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=key;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        
    }

    public static void main(String[] args) {
        int arr[]={12,11,13,5,6};
        sort(arr);
    }
    
}
