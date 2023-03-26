package Sort;

public class mergeSortedArray {

    public static void merge(int a1[],int a2[] ){
        int size= a1.length+a2.length;
        int m1[]=new int[size];
        int i=0;
        int j=0;
        int k=0;
        while(k<size){
            if(i<a1.length && j<a2.length){
                if(a1[i]<=a2[j]){
                    m1[k]=a1[i];
                    i++;
                }else if(a2[j]<=a1[i]){
                    m1[k]=a2[j];
                    j++;
                }
            }else if(j>a2.length-1){
                m1[k]=a1[i];
                i++;
            }else if(i>a1.length-1) {
                m1[k]=a2[j];
                j++;
            }
            k++;
        }
        for(k=0;k<size;k++){
            System.out.print(m1[k]+" ");
        } 
    }
    public static void main(String[] args) {
        int arr1[]={2,3,11,12};
        int arr2[]={2,3,4,5};
        merge(arr1, arr2);
        
    }
    
}
