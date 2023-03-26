package array2;

public class sumOfTwoNumber {

    public static void main(String[] args) {
        int arr1[]={6,2,4};
        int arr2[]={7,5,6};
        
        int i=0, j=0,k=0, carry=0, sum=0,rem=0, size=0; 
        
        if(arr1.length>=arr2.length){
            i=arr1.length-1;
            j=arr2.length-1;
            size=arr1.length+1;
        }else{
            i=arr2.length-1;
            j=arr1.length-1;
            size=arr2.length+1;
        }
        k=size-1;
        int arr3[]= new int[size];
        while(i>=0){
            if(j>=0){
                sum=arr1[i]+arr2[j];
                rem=sum%10;
                arr3[k]=rem+carry;
                carry=sum/10;
                i--;
                j--;
                k--;
            }
            else{
                sum=arr1[i];
                rem=sum%10;
                arr3[k]=rem+carry;
                carry=sum/10;
                k--;
                i--;
            }
        }
        arr3[k]=carry;
        for(k=0;k<size;k++){
            System.out.print(arr3[k]+" ");
        }
    }
    
    
}
