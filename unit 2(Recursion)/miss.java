public class miss {
    // public int missing(){
    //     int arr[]={1,2,3,5};
    //     for(int i=0; i<arr.length-1; i++){
    //         int n=arr[i+1]-arr[i];
    //         if (n!=1) {
    //             return i+2;
    //         }
    //     }
    //     return 0;
    // }



    public int sumOfN(int n){
        if(n==0){
            return 0;
        }
        int sum=0;
        sum=n+sumOfN(n-1);
        
        return sum;
    }
    public int array(){
        int arr[]={1,2,3,5};
        int sum2=0;
        for(int i=0; i<arr.length; i++){
            sum2=sum2+arr[i];
        }
        return sum2;
    }
    public static void main(String[] args) {
        // int arr[]={1,2,3,5};
        // for(int i=0; i<arr.length-1; i++){
        //     int n=arr[i+1]-arr[i];
        //     if(n!=1){
        //         System.out.println(i+2);
        //     }
        // }
    //     miss m=new miss();
    //    System.out.println(m.missing());

    miss m=new miss();
    // System.out.println(m.sumOfN(5));
    System.out.println(m.sumOfN(5)-m.array());

    }
}
