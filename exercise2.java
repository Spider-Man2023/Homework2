import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            boolean judge = true;
            for (int k : arr) {
                if (k == i) {
                    judge = false;
                    break;
                }
            }
            if (judge) {
                time[i - 1]++;
            }
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (flag) {
                System.out.print(" ");
            }
            if (time[i] != 0) {
                flag = true;
                System.out.print(i + 1);
            }
        }
        if (!flag) {
            System.out.print("NULL");
        }
    }
}
