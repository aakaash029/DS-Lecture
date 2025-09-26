// import java.util.Scanner;

public class reverse {
    public void rev(int[] arr,int start,int end){
       if(start>=end){
        return;
       }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
        rev(arr, start+1, end-1);
        

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverse r=new reverse();
        r.rev(arr, 0, arr.length-1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
