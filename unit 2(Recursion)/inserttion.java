public class inserttion {
    public static void main(String[] args) {
        int arr[]={9,3,7,1,6,4,0};
        for(int i=1; i<arr.length; i++){
            int curr=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>curr) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        for(int i:arr){
            System.out.print(i);
            
        }
        System.out.println();
        
    }
}
