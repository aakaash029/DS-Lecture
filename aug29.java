//inserting element at first index
public class aug29 {
    public static void main(String[] args) {
        int arr[]=new int[6];
        
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        int element=30;
        // int idx=0;
        //  System.out.println(arr.length);
         for(int i=arr.length; i>=0; i--){
            arr[arr.length-1]=arr[(arr.length)-2]; 
          

         }
         arr[0]=element;
        //  System.out.println(arr[0]);
        for(int i=0; i<arr.length; i++){
        System.out.println(arr[i]);
}
        
        
        
       


    }
}
