import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdditionOfMatrix obj = new AdditionOfMatrix();
        int[][] mat1 = new int[2][2];
        int[][] mat2 = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element of matrix 1 : ");
                mat1[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Enter element of matrix 2 : ");
                mat2[i][j] = sc.nextInt();
            }
        }

        obj.addMat(mat1,mat2);
        sc.close();
    }
}

class AdditionOfMatrix {
    void addMat(int[][] mat1,int[][]mat2){
        int[][] addedMatrix = new int[2][2];

        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                addedMatrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        printMatrix(addedMatrix);
    }

    void printMatrix(int[][] mat){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("Element "+mat[i][j]);
            }
        }
    }    
}