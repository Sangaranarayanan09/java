import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextFloat();

        System.out.printf("%.6f%n", num);
        System.out.printf("%.3f%n", num);
        System.out.printf("%.2f%n", num);
        System.out.printf("%.1f%n", num);

        sc.close();
    }
}