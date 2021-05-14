package sk.kosickaakademia.rudolfmato.diagonal;

public class Main {


        public static void main(String[] args) {
            int[][] matrix = new int[][]{ {2,5,9,8,1}, {  8,9,-5,2,7},{1,8,7,9,2},{-2,4,0,7,2} };
            new Main().printDiagonals(matrix);
        }

        public void printDiagonals(int[][] matrix) {
            StringBuilder mainDiagonal = new StringBuilder();
            StringBuilder antiDiagonal = new StringBuilder();
            System.out.println();

            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i].length != matrix.length) {

                }

                mainDiagonal.append(matrix[i][i]);

                mainDiagonal.append(' ');

                

                antiDiagonal.append(matrix[i][matrix.length - i ]);
                antiDiagonal.append(' ');
            }


            System.out.println("Main Diagonal: " + mainDiagonal);
            System.out.println("Anti Diagonal: " + antiDiagonal);

        }
    }

