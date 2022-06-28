package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] matrizN = new int[3][3];
        int[][] matrizM = new int[3][3];

        for(int i =0; i<matrizN.length; i++){
            for(int j=0; j<matrizN.length; j++ ){
                System.out.println("informe um elemento N: ");
                matrizN[i][j] = sc.nextInt();
            }
        }

        System.out.println("---MATRIZ N---");
        System.out.println();

        for (int[] valor:matrizN) {
            System.out.println(Arrays.toString(valor));

        }

       for(int i =0; i<matrizM.length; i++){
            for(int j=0; j<matrizM.length; j++ ){
                System.out.println("informe um elemento M: ");
                matrizN[i][j] = sc.nextInt();
            }
        }

        System.out.println("---MATRIZ M---");
        System.out.println();

        for (int[] valor:matrizM) {
            System.out.println(Arrays.toString(valor));
        }

    }
}
