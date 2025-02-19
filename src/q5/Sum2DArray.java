package q5;

import java.util.Scanner;

public class Sum2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] arr = new int[rows][cols];
        int sum = 0;

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
                sum += arr[i][j];
            }
        }

        System.out.println("Sum of all elements: " + sum);
        scanner.close();
}
}
