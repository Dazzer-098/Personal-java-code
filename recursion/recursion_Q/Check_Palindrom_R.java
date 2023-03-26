// we check string is palindrome of not
package recursion_Q;

public class Check_Palindrom_R {
    public static boolean palindrom(String s,int start, int end){
        if(start==end){
            if(s.charAt(start)==s.charAt(end)){
                return true;
            }
            return false;
        }
        else if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return palindrom(s, start+1, end-1);
    }
    public static boolean ispalindrom(String s){
        return palindrom(s,0,s.length()-1);
    }
    public static void main(String[] args) {
        System.out.println(ispalindrom("racetcar"));
    }
    
}
