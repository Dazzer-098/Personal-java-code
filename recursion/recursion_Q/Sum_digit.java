// return sum of digit
package recursion_Q;

public class Sum_digit {
    public int sum(int number){
        if(number==0){
            return 0;
        }
        int r=number%10;
        number=number/10;
        return r+sum(number);
    }
    public static void main(String[] args) {
        Sum_digit s=new Sum_digit();
        System.out.println(s.sum(123456)); 
    }
    
}
