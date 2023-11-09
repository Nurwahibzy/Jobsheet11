package Jobsheet11;

import java.util.Scanner;

public class NestedLoop_2341720154 {
    public static void main(String[] args) {

        double temps[][] = new double[5][7];
        Scanner scanner = new Scanner(System.in);
        double totalSuhu = 0;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                totalSuhu += temps[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double total = 0;

          
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                total += temp;
            }
            // output rata-rata
            double rata2 = total / temps[i].length;
            System.out.println("\nRata-rata: " + rata2);
        }
    }
}
