package Ex15;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Invoice[] inv = new Invoice[n];

        for (int i = 0; i < n; i++) {

            String num = sc.nextLine();
            String desc = sc.nextLine();
            int q = sc.nextInt();
            double p = sc.nextDouble();
            sc.nextLine();

            inv[i] = new Invoice(num, desc, q, p);
        }

        for (int i = 0; i < n; i++)
            System.out.println(inv[i].getAmount());
    }
}