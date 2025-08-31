public class swap_num {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // before swapping 
        System.out.println(a);
        System.out.println(b);
        // int temp;
        // temp=a;
        // a=b;
        // b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
        // after swapping
        System.out.println(a);
        System.out.println(b);
    }
}
