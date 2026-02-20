import java.util.Scanner;

public class Ex2 {

    public static int low(int[] num) {
        int x = num[0];
        for (int i = 1; i < num.length; i++)
            if (num[i] < x)
                x = num[i];
        return x;
    }

    public static int high(int[] num) {
        int x = num[0];
        for (int i = 1; i < num.length; i++)
            if (num[i] > x)
                x = num[i];
        return x;
    }

    public static int[] both(int[] num) {
        return new int[]{low(num), high(num)};
    }

    public static void main(String[] args) {

        if (args.length > 0) {
            int[] num = new int[args.length];
            for (int i = 0; i < args.length; i++)
                num[i] = Integer.parseInt(args[i]);

            System.out.println(low(num));
            System.out.println(high(num));
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();

        int[] r = both(num);
        System.out.println(r[0]);
        System.out.println(r[1]);
    }
}