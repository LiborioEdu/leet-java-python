import java.util.Arrays;

public class leet09 {
    public int[] runningSum(int[] nums) {
        int[] answer = new int[nums.length];

        answer[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            answer[i] = nums[i] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        leet09 solution = new leet09();

        int[] entrada = { 1, 2, 3, 4 };
        int[] resultado = solution.runningSum(entrada);

        System.out.println(Arrays.toString(resultado));
    }
}
