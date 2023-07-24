package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a, b, c;
        c = number % 10;
        b = (number / 10) % 10;
        a = (number / 100) % 10;
        System.out.println(c + "" + b + "" + a);
    }
}
