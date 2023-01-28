import java.util.InputMismatchException;
import java.util.Scanner;

public class stackQueue {

    private static int[] stack = new int[5];
    private static int counters = 0;

    private static boolean stackStorage() {
        if (counters < stack.length) {
            return true;
        } else {
            return false;
        }
    }

    private static void createStack() {
        int loopX = 0;
        int alpha = 0;
        while (loopX == 0) {
            System.out.print("Masukkan Data (angka): ");
            Scanner alphaX = new Scanner(System.in);
            try {
                alpha = alphaX.nextInt();
                loopX = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan harus berupa Angka!");
                loopX = 0;
            }
        }
        stack[counters] = alpha;
        counters++;
    }

    private static void displayDataStack() {
        System.out.print("Data dalam Stack: ");
        for (int i = 0; i < counters; i++) {
            System.out.print(" [" + i + " => " + stack[i] + "]");
        }
        System.out.println("");
    }

    private static void cleanStack() {
        counters = 0;
    }

    private static void quitApp() {
        String quitss = "y";
        System.out.print("Keluar dari Program? (Y/T): ");
        quitss = new Scanner(System.in).nextLine();
        if (quitss.equalsIgnoreCase("y")) {
            System.exit(0);
        } else {
            menuProgram();
        }
    }

    private static void menuChooser(int choosenMenu) {
        switch (choosenMenu) {
            case 1:
                boolean check = stackStorage();
                if (check) {
                    createStack();
                } else {
                    System.out.println("Stack Penuh!, kosongkan data terlebih dahulu!");
                }
                break;
            case 2:
                displayDataStack();
                break;
            case 3:
                cleanStack();
                break;
            case 4:
                quitApp();
                break;
        }
        menuProgram();
    }

    private static void menuProgram() {
        int loopX = 0;
        int choosenMenu = 0;
        while (loopX == 0) {
            System.out.println("\nContoh Program Stack dengan Java");
            System.out.println("Menu: ");
            System.out.println("1. Tambah Stack");
            System.out.println("2. Tampilkan data dalam Stack");
            System.out.println("3. Bersihkan Stack");
            System.out.println("4. Keluar dari Program");
            System.out.print("Pilihan Menu (1 - 4) >>> ");
            Scanner menuOption = new Scanner(System.in);
            try {
                choosenMenu = menuOption.nextInt();
                loopX = 1;
            } catch (InputMismatchException e) {
                System.out.println("Masukan harus Angka!");
            }
        }
        System.out.println("");
        menuChooser(choosenMenu);
    }

    public static void main(String[] args) {
        menuProgram();
    }
}


