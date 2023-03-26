package array2;

public class rotateArray {

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int d=2;
        
        for(int i=0;i<d;i++){
            int temp=0;
            temp=arr[temp];
            
            int j=0;
            for(j=0;j<arr.length-1;j++){
                
                arr[j]=arr[j+1];
            }
            arr[j]=temp;
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    
}
