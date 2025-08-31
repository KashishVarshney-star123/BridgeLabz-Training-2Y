import java.util.Random;
import java.util.Scanner;

public class Matrix {
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(10); 
            }
        }
        return matrix;
    }
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        if (rows != matrixB.length || cols != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for addition.");
            return null;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }
    public static int[][] subtractMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        if (rows != matrixB.length || cols != matrixB[0].length) {
            System.out.println("Matrices must have the same dimensions for subtraction.");
            return null;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return result;
    }
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        if (colsA != rowsB) {
            System.out.println("Number of columns of the first matrix must equal the number of rows of the second matrix for multiplication.");
            return null;
        }

        int[][] result = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    public static void displayMatrix(int[][] matrix) {
        if (matrix == null) {
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowsA = 2;
        int colsA = 3;
        int rowsB = 3;
        int colsB = 2;
        int rowsC = 2;
        int colsC = 3;
        int[][] matrixA = createRandomMatrix(rowsA, colsA);
        int[][] matrixB = createRandomMatrix(rowsB, colsB);
        int[][] matrixC = createRandomMatrix(rowsC, colsC);

        System.out.println("Matrix A:");
        displayMatrix(matrixA);
        System.out.println("\nMatrix B:");
        displayMatrix(matrixB);
        System.out.println("\nMatrix C:");
        displayMatrix(matrixC);

        System.out.println("\n-----------------");
        System.out.println("Matrix Addition: A + C");
        int[][] sum = addMatrices(matrixA, matrixC);
        displayMatrix(sum);

        System.out.println("\n-----------------");
        System.out.println("Matrix Subtraction: C - A");
        int[][] difference = subtractMatrices(matrixC, matrixA);
        displayMatrix(difference);

        System.out.println("\n-----------------");
        System.out.println("Matrix Multiplication: A * B");
        int[][] product = multiplyMatrices(matrixA, matrixB);
        displayMatrix(product);

        scanner.close();
    }
}