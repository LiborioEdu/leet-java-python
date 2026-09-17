public class leet06 {
    public int math06(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m != 0) {
                num1 = num1 + i;
            } else {
                num2 = num2 + i;
            }
        }
        return num1 - num2;
    }

    public static void main(String[] args) {
        leet06 leet06 = new leet06();
        int answer = leet06.math06(5, 6);
        System.out.println(answer);
    }
}
