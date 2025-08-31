import java.util.Random;

public class Determinent {
    public static double[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) {
            System.out.println("Matrix is null.");
            return;
        }
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposedMatrix = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
    public static double determinant2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    public static double determinant3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }
        double det = matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                   - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                   + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
        return det;
    }
    public static double[][] inverse2x2(double[][] matrix) {
        if (matrix.length != 2 || matrix[0].length != 2) {
            throw new IllegalArgumentException("Matrix must be 2x2.");
        }
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Determinant is zero. Inverse does not exist.");
            return null;
        }
        double[][] adjugate = {
            {matrix[1][1], -matrix[0][1]},
            {-matrix[1][0], matrix[0][0]}
        };
        double[][] inverse = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inverse[i][j] = adjugate[i][j] / det;
            }
        }
        return inverse;
    }
    public static double[][] inverse3x3(double[][] matrix) {
        if (matrix.length != 3 || matrix[0].length != 3) {
            throw new IllegalArgumentException("Matrix must be 3x3.");
        }

        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Determinant is zero. Inverse does not exist.");
            return null;
        }

        double[][] adjugate = new double[3][3];
        adjugate[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adjugate[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adjugate[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];

        adjugate[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adjugate[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adjugate[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);

        adjugate[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adjugate[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adjugate[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[j][i] / det;
            }
        }
        return inverse;
    }

    public static void main(String[] args) {
        System.out.println("3x3 Matrix Operations:");
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("Original 3x3 Matrix:");
        displayMatrix(matrix3x3);

        double det3x3 = determinant3x3(matrix3x3);
        System.out.println("Determinant: " + det3x3);

        double[][] transposed3x3 = transpose(matrix3x3);
        System.out.println("Transposed 3x3 Matrix:");
        displayMatrix(transposed3x3);

        if (det3x3 != 0) {
            double[][] inverse3x3 = inverse3x3(matrix3x3);
            System.out.println("Inverse 3x3 Matrix:");
            displayMatrix(inverse3x3);
        }
        System.out.println("\n---------------------------------");
        System.out.println("2x2 Matrix Operations:");
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("Original 2x2 Matrix:");
        displayMatrix(matrix2x2);

        double det2x2 = determinant2x2(matrix2x2);
        System.out.println("Determinant: " + det2x2);

        double[][] transposed2x2 = transpose(matrix2x2);
        System.out.println("Transposed 2x2 Matrix:");
        displayMatrix(transposed2x2);

        if (det2x2 != 0) {
            double[][] inverse2x2 = inverse2x2(matrix2x2);
            System.out.println("Inverse 2x2 Matrix:");
            displayMatrix(inverse2x2);
        }
    }
}