package sk.kosickaakademia.rudolfmato.diagonalx;

import static sk.kosickaakademia.rudolfmato.diagonalx.Multiplication.productDiagonal;
import static sk.kosickaakademia.rudolfmato.diagonalx.Multiplication.productantiDiagonal;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{2, 5, 9, 8, 1}, {8, 9, -5, 2, 7}, {1, 8, 7, 9, 2}, {-2, 4, 0, 7, 2}};



        System.out.print(productDiagonal(matrix, 4));






    }
}
