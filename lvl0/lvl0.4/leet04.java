public class leet04 {
    public int mathChallenge(int num, int t) {
        int total = num + (2 * t);
        return total;
    }

    public static void main(String[] args) {
        leet04 leet04 = new leet04();
        int answer = leet04.mathChallenge(4, 1);
        System.out.println(answer);
    }
}
