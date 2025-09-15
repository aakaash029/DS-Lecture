import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        //Checking palindrome number

        // Scanner s=new Scanner(System.in);
        // System.out.print("Enter number:");
        // int n=s.nextInt();
        // int n=122;
        // int rev=0;
        // while(n>0){
        //     int r=n%10;
        //     rev=r+(rev*10);
        //     n=n/10;
        // }
        // n=122;
        // if(n==rev){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("not palindromr");
        // }
        // s.close();


        // Checking palindrome string

        Scanner s=new Scanner(System.in);
        System.out.print("Enter String:");
        String str=s.nextLine();
        String rev="";
        for(int i=str.length(); i>0; i--){
            rev=rev+str.charAt(i-1);
        }
        // System.out.println(rev);
        if(str.equals(rev)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        s.close();
    }
}
