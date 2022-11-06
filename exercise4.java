import java.util.Objects;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] poker = new String[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                poker[i][j] = input.next();
                }
            switch (poker[i][1]){
                    case "A":
                        poker[i][1] = "1";
                        break;
                    case "J":
                        poker[i][1] = "11";
                        break;
                    case "Q":
                        poker[i][1] = "12";
                        break;
                    case "K":
                        poker[i][1] = "13";
                        break;
                    default:
                        break;
            }
        }
        String best = "High Card";
        boolean b = Objects.equals(poker[0][0], poker[1][0]) &&
                Objects.equals(poker[1][0], poker[2][0]) &&
                Objects.equals(poker[2][0], poker[3][0]) &&
                Objects.equals(poker[3][0], poker[4][0]);
        boolean k = true;
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(poker[i][1]) != Integer.parseInt(poker[i + 1][1]) - 1) {
                k = false;
                break;
            }
        }
        if (countEquals(poker) == 2) {
            best = "Pair";
        }
        if (countEquals(poker) == 3||countEquals(poker) == 4) {
            best = "Three of a Kind";
        }
        if (k) {
            best = "Straight";
        }
        if (b) {
            best = "Flush";
            if (k) {
                best = "Straight Flush";
            }
        }
        System.out.println(best);
    }

    public static int countEquals(String[][] poker) {
        int[] count = new int[poker.length];
        for (int i = 0; i < poker.length; i++) {
            int m = Integer.parseInt(poker[i][1]);
            for (String[] strings : poker) {
                if (m == Integer.parseInt(strings[1])) {
                    count[i]++;
                }
            }
        }
        return getMax(count);
    }

    public static int getMax(int[] count) {
        int max = count[0];
        for (int i : count) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
