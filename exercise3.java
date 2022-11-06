import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int[][] arr = new int[4][2];
        int[] day = new int[t];

        for (int h = 0; h < t; h++) {

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[j][i] = input.nextInt();
                }
            }

            arr = order(arr);

            int sum = arr[0][0] + arr[1][0] + arr[2][0] + arr[3][0];

            day[h] = 0;
            while (sum < 100) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 30 - arr[i][0]; j++) {
                        if (sum == 100) {
                            break;
                        }
                        sum++;
                        day[h] += arr[i][1];
                    }
                }
            }
        }
        for (int h = 0; h < t; h++) {
            System.out.println(day[h]);
        }
    }

    public static int[][] order(int[][] arr) {
        while (true) {
            for (int i = 0; i < 3; i++) {
                if (arr[i][1] > arr[i + 1][1]) {
                    int[] m;
                    m = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = m;
                }
            }
            boolean g = true;
            for (int i = 0; i < 3; i++) {
                if (arr[i][1] > arr[i + 1][1]) {
                    g = false;
                    break;
                }
            }
            if (g) {
                break;
            }
        }
        return arr;
    }
}
