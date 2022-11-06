import java.util.Arrays;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int k = 0; k < t; k++) {
            int n1 = input.nextInt();
            int n2 = input.nextInt();

            int t1 = Math.min(n1, n2);
            int t2 = Math.max(n1, n2);

            int[] arr1 = new int[Math.max(n1, n2) + 1];
            int[] arr2 = new int[Math.max(n1, n2) + 1];
            int[] arr3 = new int[Math.max(n1, n2) + 1];

            Arrays.fill(arr3, 30);

            if (n1 < n2) {
                for (int i = 0; i < t1; i++) {
                    arr1[t2 - t1 + i+1] = input.nextInt();
                }
                for (int i = 1; i < arr2.length; i++) {
                    arr2[i] = input.nextInt();
                }
            } else {
                for (int i = 1; i < arr2.length; i++) {
                    arr2[i] = input.nextInt();
                }
                for (int i = 0; i < t1; i++) {
                    arr1[t2 - t1 + i+1] = input.nextInt();
                }
            }

            arr3[arr3.length - 1] = arr2[arr2.length - 1] + arr1[arr1.length - 1];

            for (int i =1; i < arr2.length; i++) {
                arr3[arr3.length - i - 1] = arr2[arr2.length - i - 1] + arr1[arr1.length - i - 1]
                        + (arr3[arr3.length - i]) / 10;
            }

            int[] num = new int[t2+1];

            for (int j = 0; j < arr3.length; j++) {
                if (arr3[j] != 30) {
                    num[j] = arr3[j] % 10;
                }
            }
            boolean b = false;
            for (int i : num) {
                if(!b && i!=0){
                    System.out.print(i);
                }
                if(b){
                    System.out.print(i);
                }
                b = true;
            }
            System.out.println();
        }
    }
}

