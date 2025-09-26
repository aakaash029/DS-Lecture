public class towerOfHanoi {
    // public static void TOH(int n, char source, char helper, char dest){
    //     if(n==1){
    //         System.out.println("move"+source+"to"+dest);
    //         return;
    //     }
    //     // int ans=0;
    //     TOH(n-1, source, dest, helper);
    //     System.out.println("move"+source+"to"+helper);
    //     TOH(n-1, helper, source, dest);
    // }

    public static int tower(int n, char source, char helper, char dest){
        if(n==1){
            return 1;
        }
        int totalMove=0;
        totalMove+=tower(n-1, source, dest, helper);
        totalMove++;
        totalMove+=tower(n-1, helper, source, dest);
        return totalMove;
    }
    public static void main(String[] args) {
        // int n=3;
        // TOH(n, 'S', 'H', 'D');
        System.out.println(tower(3, 'S', 'H', 'D'));
    }
}
