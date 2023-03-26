package recursion_Q;

public class ReplaceX_R {

    public static String removeX(char arr[],int index,char value){
        if(index==arr.length){
            String s="";
            
            return s;
        }
        String s="";
        if(arr[index]!=value){
            s= s+arr[index];
            
        }
        return removeX(arr,index+1,value)+s;
    }
    public static void main(String[] args) {
        String str= "abxcxdx";
        char c[]=str.toCharArray();
        
        System.out.println(removeX(c, 0, 'x'));
    }
    
}
