


public class nestedrec{


    
    public int nestrec(int n){
        if(n>100){
            return n-10;
        }
            return nestrec(nestrec(n+11));
        
    }
    
    public static void main(String[] args) {
        nestedrec r=new nestedrec();
        System.out.println(r.nestrec(102));
        
    }
}
