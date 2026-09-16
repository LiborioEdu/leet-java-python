public class leet05 {
    public int quest05(int n) {
        if (n % 2 == 0 && n % n == 0) {
            return n;
        } else {
            return (n * 2);
        }
    }

    public static void main(String[] args) {
        leet05 leet05 = new leet05();
        int answer = leet05.quest05(6);
        System.out.println(answer);
    }
}
