import java.util.Scanner;

class Matrix {
    private int rows;
    private int cols;
    private int[][] data;


    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }


    public void input(Scanner sc, String matrixName) {
        System.out.println("\nEnter elements of " + matrixName + ":");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                data[i][j] = sc.nextInt();
            }
        }
    }


    public void display(String matrixName) {
        System.out.println("\n" + matrixName + ":");
        for (int[] row : data) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }


    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            System.out.println("Matrix dimensions do not match. Cannot perform addition.");
            return null;
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }
}

public class Day14_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        Matrix matrix1 = new Matrix(rows, cols);
        Matrix matrix2 = new Matrix(rows, cols);

        matrix1.input(sc, "Matrix 1");
        matrix2.input(sc, "Matrix 2");

        matrix1.display("Matrix 1");
        matrix2.display("Matrix 2");

        Matrix result = matrix1.add(matrix2);
        if (result != null) {
            result.display("Resultant Matrix after Addition");
        }

        sc.close();
    }
}
