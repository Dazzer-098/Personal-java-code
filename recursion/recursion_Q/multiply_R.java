package recursion_Q;

public class multiply_R {
    public static int multiple(int value, int count) {
        if(count==0){
            return 0;
        }
        return value+ multiple(value,count-1);
    }    
    public static void main(String[] args) {
        System.out.println(multiple(5, 3));
    }
}
