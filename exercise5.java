import java.util.Scanner;

public class exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        String[] str = new String[t];
        for(int i = 0;i<t;i++){
            str[i] = input.next();
        }
        for(int i = 0;i<t;i++){
            char[] ss = str[i].toCharArray();
            System.out.print(ss[6]);
            System.out.print(ss[7]);
            System.out.print(ss[4]);
            System.out.print(ss[5]);
            System.out.print(ss[2]);
            System.out.print(ss[3]);
            System.out.print(ss[0]);
            System.out.print(ss[1]);
            if(i!=t-1){
                System.out.print(" ");
            }
        }
    }
}
