import java.util.Scanner;

public class ModifiedOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

        for (int i = 0; i < a; i++) {
            int num = 2 * i + 1;
            if (i < a - 1)
                System.out.print(num + ", ");
            else
                System.out.print(num);
        }
    }
}
