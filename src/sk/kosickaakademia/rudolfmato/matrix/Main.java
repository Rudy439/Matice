package sk.kosickaakademia.rudolfmato.matrix;

public class Main {
    public static void main(String[] args) {
    int[][] amatrix = new int[][]{
            {3,7,5},{2,4,9}
    };
    int[][] bmatrix = new int[][]{
            {7,2,9},{1,8,5},{0,2,4}

                };
    int r1 = 2, c1 = 3;
    int r2 = 3, c2 = 3;

    int[][] product = multiplyMatrices(amatrix, bmatrix, r1, c1, c2);


    displayProduct(product);
}

    public static int[][] multiplyMatrices(int[][] amatrix, int[][] bmatrix, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += amatrix[i][k] * bmatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void displayProduct(int[][] product) {
        System.out.println("Product of two matrixes is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}

