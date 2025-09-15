

import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {


        //inserting element at first position


//         Scanner s=new Scanner(System .in);
//         System.out.println("Enter size of array:");

//         // Declare array size
//         int size=s.nextInt();



//         System.out.println("Enter"+" "+size+" "+"numbers");


//         //Declare array
//         int arr[]=new int[size];
//         for(int i=0; i<size; i++){
//             arr[i]=s.nextInt();
//         }
//         s.close();

//     //    int []arr={1,2,3,4,5};
//         int element=30;
//         int pos=1;
//         // int idx=0;
//         //   System.out.println(arr.length);
//          for(int i=arr.length-1; i>(pos-1); i--){
//             arr[i]=arr[i-1]; 
          

//          }
//          arr[pos-1]=element;
//         //  System.out.println(arr[0]);
//         for(int i=0; i<arr.length; i++){
//         System.out.println(arr[i]);
// }
        
        
        
       




//inserting element at last position

// Scanner s=new Scanner(System.in);
// System.out.print("Enter size of array:");
// int size=s.nextInt();
// System.out.println("Enter"+" "+size+" "+"numbers:");
// int []arr=new int[size];
// for(int i=0; i<size; i++){
//     arr[i]=s.nextInt();
// }

// int pos=size-1;
// int element=30;
// arr[pos]=element;
// for(int i=0; i<size; i++){
//     System.out.println(arr[i]);
// }
// s.close();




// inserting number at given position
int pos=3;
int element=20;
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of array:");
int size=s.nextInt();
System.out.println("Enter"+" "+size+" "+"elements");
int[] arr=new int[size];
for(int i=0; i<size; i++){
    arr[i]=s.nextInt();
}
for(int i=arr.length-1; i>(pos-1); i--){
    arr[i]=arr[i-1];
}
arr[pos-1]=element;
for(int i=0; i<size; i++){
    System.out.println(arr[i]);
}
s.close();
    }
}
