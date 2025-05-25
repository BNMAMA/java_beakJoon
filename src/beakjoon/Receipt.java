package beakjoon;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {

         // 총 금액 X
         //물건의 종류의 수 N
         //물건의 가격 a
         //물건의 개수 b
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
       int X = scanner.nextInt();
       int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
          int a = scanner.nextInt();
          int b = scanner.nextInt();
            sum += (a * b);

        }
        if (X == sum) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
