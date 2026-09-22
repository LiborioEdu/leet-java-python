public class leet07 {
    public int math07(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        leet07 leet07 = new leet07();
        int answer = leet07.math07(14);
        System.out.println(answer);
    }
}
