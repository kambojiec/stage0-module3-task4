package school.mjc.stage0.module3.task4;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 2, b = 4;
        double c = (9 * Math.pow(a, 2) - 5 * b + a - 7)*((a + b - 4 * a * b) / 2);
        System.out.println(c);
    }
}
