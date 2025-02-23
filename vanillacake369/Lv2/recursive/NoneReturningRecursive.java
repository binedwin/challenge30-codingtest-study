import java.util.Scanner;

public class NoneReturningRecursive {

    /**
     * 의사코드
     * 1. n만큼 star 출력
     * 2. 스택에 printStar(n-1) 호출
     * 2-1. 만약 1까지 다달았다면 재귀호출 스택 pop하여 caller로 돌아감
     * 3. 재귀호출 스택에서 돌아온 뒤 다시 n만큼 star 출력
     */

    public static void main(String[] args) {
        /* 입력 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        /* 연산 및 출력 */
        printStar(n);

        scanner.close();
    }

    private static void printStar(int n) {
        // 1. n만큼 star 출력
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i != n - 1)
                System.out.print(" ");
        }

        System.out.println("");

        // 2. 스택에 printStar(n-1) 호출
        // 2-1. 만약 1까지 다달았다면 재귀호출 스택 pop하여 caller로 돌아감
        if (n == 1) {
            System.out.println("*");
            return;
        } else {
            printStar(n - 1);
        }

        // 3. 재귀호출 스택에서 돌아온 뒤 다시 n만큼 star 출력
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i != n - 1)
                System.out.print(" ");
        }

        System.out.println("");
    }
}
