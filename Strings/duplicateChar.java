public class duplicateChar {
    public static String uniqueString(String s1) {
        String s=String.valueOf(s1.charAt(0));
        for(int i=0;i<s1.length()-1;i++){
            if(s1.charAt(i)!=s1.charAt(i+1)){
                for(int j=0;j<s.length();j++){
                    if(s.contains(String.valueOf(s1.charAt(i+1)))==false){
                        s=s+String.valueOf(s1.charAt(i+1));
                    }
    
                }
            }
        }
        return s;
        
    }
    
    public static void main(String[] args) {
        String s1="geeks for geeks";
        // duplicateChar d= new duplicateChar();
        System.out.println(duplicateChar.uniqueString(s1));

        
        
    }
    
}
