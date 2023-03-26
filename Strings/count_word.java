public class count_word {

    public static void main(String[] args) {
        String s="rahul chauhan";
        int count=0;
        char c;
        count=s.length();
        int i=0;
        for(i=s.length()-1;i>=0;i--){
            // for count word
            if (s.charAt(i)==' '){
                System.out.print(s.substring(i+1, count)+" ");
                count=i; 
            }
        }
        System.out.println(s.substring(i+1, count));
        // System.out.println(s.substring(0, s.length()));
        // int total_word=count +1;
        // System.out.println(total_word);
    }
    
}
