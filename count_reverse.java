import java.util.Scanner;

public class count_reverse {
     public static void main(String[] args) {
    //     //  int a=3567;
         Scanner s=new Scanner(System.in);
         System.out.println("Enter number:");
         int a=s.nextInt();



         

    //     int count=0;          //counting the digit
    //     while(a>0){
    //         a=a/10;
    //         count++;

    //     }
    //      s.close();
    //     System.out.println(count);






    int rev=0;               //reverse the digit
    while(a>0){
        int rem=a%10;
         rev=rem+(rev*10);
         a=a/10;
    }
    s.close();
    System.out.println(rev);
     }
}
