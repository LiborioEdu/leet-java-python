public class leet02 {
    public int sum(int num1, int num2) {
        if ((num1 >= -100 && num1 <= 100) && (num2 >= -100 && num2 <= 100)) {
            int total = num1 + num2;
            return total;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        leet02 leet02 = new leet02();
        int resultado = leet02.sum(5, 7);
        System.out.println(resultado);
    }
}