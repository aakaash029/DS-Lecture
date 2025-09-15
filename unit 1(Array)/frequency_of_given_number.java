import java.util.Scanner;

public class frequency_of_given_number {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the total no. of elements of array:");
        int size=s.nextInt();
        System.out.print("Enter the target number");
        int target=s.nextInt();
        System.out.println("Enter"+" "+size+" "+"elements");
        int arr[]=new int[size];
        int count=0;
       
        for(int i=0; i<size; i++){
            arr[i]=s.nextInt();
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
        
        s.close();
    }
}
