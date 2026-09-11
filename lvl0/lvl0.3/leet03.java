import java.util.Arrays;

public class leet03 {
    public double[] temp_change(double celcius) {
        double kelvin = celcius + 273.15;
        double fahrenhreit = celcius * 1.8 + 32;

        return new double[] { kelvin, fahrenhreit };
    }

    public static void main(String[] args) {
        leet03 leet03 = new leet03();
        double[] answer = leet03.temp_change(37);
        System.out.println(Arrays.toString(answer));
    }
}