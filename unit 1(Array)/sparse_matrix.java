import java.util.Scanner;

public class sparse_matrix {
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter rows:");
      int rows=s.nextInt();
      System.out.print("Enter col:");
      int col=s.nextInt();
      int sparse_matrix[][]=new int[rows][col];
      int z=0;
      int nz=0;
      for(int i=0; i<rows; i++){
        for(int j=0; j<col; j++){
            System.out.println("Enter matrix:");
            sparse_matrix[i][j]=s.nextInt();
            if(sparse_matrix[i][j]==0){
                z++;
            }else{
                nz++;
            }

        }
      }
      if(nz>z){
        System.out.println("It is not a sparse matrix.");
      }else{
        
      }
      s.close(); 
    }
}
