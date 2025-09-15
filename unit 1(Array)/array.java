import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total elements of array:");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter"+" "+size+" "+"elements");
        for(int i=0; i<size; i++){
            arr[i]=s.nextInt();
        }
        int max=arr[0];
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
        s.close();
    }
}
