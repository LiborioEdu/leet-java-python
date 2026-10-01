public class leet08 {
    public boolean palindrome(int num) {
        if (num < 0) {
            return false;
        }
        int original = num;
        int invertido = 0;

        while (num > 0) {
            int digito = num % 10;
            invertido = (invertido * 10) + digito;
            num = num / 10;
        }
        return original == invertido;
    }

    public static void main(String[] args) {
        leet08 leet08 = new leet08();

        boolean solution = leet08.palindrome(121);
        System.out.println(solution);
    }
}