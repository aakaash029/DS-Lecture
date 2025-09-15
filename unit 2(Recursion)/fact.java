public class fact {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int c=n*factorial(n-1);
        return c;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
}
