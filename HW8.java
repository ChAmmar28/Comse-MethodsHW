import java.util.Scanner;

public class HW8 {
    public static String calculateGrade(int score) {
        if (score < 0 || score > 100) {
            return "wrong score";
        }
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void printPyro(int high) {
        for (int i = 0; i <= high; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void printPyro2(int high) {
        for (int i = high; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void printPyro3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }
    }

    static void printPyro4(int n) {
        for (int i = n; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println("");
        }
    }

    static void printMyPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        System.err.println(calculateGrade(Integer.parseInt(scanner.nextLine())));

        printPyro(5);
        printPyro2(5);
        printPyro3(5);
        printPyro4(5);
        printMyPattern(5);
    }

}
