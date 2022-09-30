import java.util.Scanner;

public class PineTree {
    public static void main(String[] args) {

        int rows;
        do {
            Scanner row = new Scanner(System.in);
            System.out.println("\nCombien de lignes (de 8 a 35)?\n");
            rows = row.nextInt();
        } while (rows < 8 || rows > 35);

        Scanner symbol = new Scanner(System.in);
        System.out.println("\nQuel symbole voulez-vous pour le triangle ?\n");
        String sym = symbol.next();

        forLoop(rows, sym);
    }

    public static void forLoop(int rows, String sym) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(sym + " ");
            }
            System.out.println("");
        }
    }
}