package array2;

public class Push0toEnd {

    public static void main(String[] args) {
        int arr[]={2,0,2,2,2};
        int k=0;
        
        for(int i=0;i<arr.length;i++){
            int count;
            if(arr[i]!=0){
                count=arr[k];
                arr[k]=arr[i];
                arr[i]=count;
                k++;
                
            }    
        }

        for(k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
    
}
