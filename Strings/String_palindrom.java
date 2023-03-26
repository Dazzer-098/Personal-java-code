public class String_palindrom {

    public static void main(String[] args) {
        String s= "abcbd";
        String s1="";
        char c;
        for(int i=s.length()-1;i>=0;i--){
            c=s.charAt(i);
            s1=s1+String.valueOf(c);
        }
        if(s.equals(s1)){
            System.out.println(s+" is palindrom");
        }else{
            System.out.println(s+" is not palindrom");
        }
    }
    
}
