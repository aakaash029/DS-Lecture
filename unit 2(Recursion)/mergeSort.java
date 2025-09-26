public class mergeSort {

    public static void conquire(int arr[], int mid, int si,int ei){
        int newArr[]=new int[ei-si+1];
        int idx1=si;
        int idx2=mid+1;
        int i=0;
        while (idx1<idx2 && idx2<=ei) {
            if(arr[idx1] <= arr[idx2]){
                newArr[i++]=arr[idx1++];
            }else{
                newArr[i++]=arr[idx2++];
            }
        }
        while (idx1<=mid) {
            newArr[i++]=arr[idx1++];
        }
        while (idx2<=ei) {
            newArr[i++]=arr[idx2++];
        }

        for(int x=0, j=si; x<newArr.length; x++,j++){
            arr[j]=newArr[x];
        }
    }
    public static void divide(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquire(arr, mid, si, ei);
    }
    public static void main(String[] args) {
        int arr[]={7,2,9,1,4,8,3,5,0};
        divide(arr, 0, arr.length-1);
        //print 
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
