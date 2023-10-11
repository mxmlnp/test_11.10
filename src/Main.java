import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int i, j;
        i = scan.nextInt();
        j = scan.nextInt();
        int[][] a = new int[i][j];
        for (int I = 0; I < i; I++) {
                for (int J = 0; J < j; J++) {
                    a[I][J] = I*J;
                }

        }
        for (int I = 0; I < i; I++) {
            for (int J = 0; J < j; J++) {
                if (a[I][J] < 10) {
                    System.out.print(" " + a[I][J] + " ");
                } else {
                    System.out.print(a[I][J] + " ");
                }
            }
            System.out.println();
            System.out.print(" ");
            System.out.print(" ");
        }
    }
}
