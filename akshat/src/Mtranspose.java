import java.io.*;
import java.util.Scanner;

public class Mtranspose {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter rows,coloumns?");
        int r = sc.nextInt();
        int c= sc.nextInt();

        int arr[][]=new int [r][c];

        for (int i=0; i<r; i++)
            for (int j=0;j<c;j++)
                arr [i][j]= sc.nextInt();

        System.out.println("The Transpose Matrix:");

        for (int i=0;i<c;i++)
        {
            for (int j=0;j<r;j++)
            {
                System.out.println(arr[j][i]+"  ");
            }
            System.out.println("\n");
        }
    }


}
