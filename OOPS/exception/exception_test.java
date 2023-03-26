package exception;

public class exception_test {
    public static void main(String[] args) {
        try {
            
            int i=50/0;
        } catch (Exception e) {
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }

        System.out.println("rahul");
    }
    
}
