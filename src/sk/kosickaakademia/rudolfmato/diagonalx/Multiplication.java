package sk.kosickaakademia.rudolfmato.diagonalx;

public class Multiplication {
    static int productDiagonal(int arr[][], int n)
    {

        int product = 1;

        for (int i = 0; i < n; i++)
        {

            product = product * arr[i][i];

        }

        if (n % 2 == 1)
        {
            product = product / arr[n / 2][n / 2];
        }

        return product;
    }
    static int productantiDiagonal(int arr[][], int n)
    {

        int product = 1;

        for (int i = 0; i < n; i++)
        {

            product = product * arr[i][n - i - 1];
        }

        if (n % 2 == 1)
        {
            product = product / arr[n / 2][n / 2];
        }

        return product;
    }
}
