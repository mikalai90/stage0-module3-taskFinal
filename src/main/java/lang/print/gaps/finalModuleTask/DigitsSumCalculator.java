package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a, b, c, d;
        d = number % 10;
        c = (number / 10) % 10;
        b = (number / 100) % 10;
        a = (number / 1000) % 10;
        System.out.println(a + b + c + d);

    }
}
