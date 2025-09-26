import java.util.Scanner;

public class trailing {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        if(n>=5){
            n/=5;
            count+=n;

        }
        System.out.println(count);
        s.close();
    }
}
