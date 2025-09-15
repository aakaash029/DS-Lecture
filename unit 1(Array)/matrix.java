import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the total no. of elements in rows:");
        int rows=s.nextInt();
        System.out.print("Enter the total no. of elements in columns:");
        int col=s.nextInt();
        int matrix[][]=new int[rows][col];
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                 matrix[i][j]=s.nextInt();
            }
        }
        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]);
                sum=sum+matrix[i][j];
            }
            System.out.println();
        }
        System.out.println(sum);
        s.close();
    }
}
