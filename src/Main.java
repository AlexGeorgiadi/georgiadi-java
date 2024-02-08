import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача №1.
        CalcService service1 = new CalcService();
        int a = 9;
        int b = 3;
        String myMax = service1.findMax(a, b);
        System.out.println("a = " + a + ", b = " + b);
        System.out.println(myMax);
        System.out.println(a + " + " + b + " = " + service1.addition(a, b));
        System.out.println(a + " - " + b + " = " + service1.subtraction(a, b));
        System.out.println(a + " * " + b + " = " + service1.multiplication(a, b));
        System.out.println(a + " / " + b + " = " + service1.division(a, b));
        System.out.println();

        // Задача №2.
        CompareStringsService service2 = new CompareStringsService();
        String line1 = "Примите меня на стажировку";
        String line2 = "Примите меня на стажировку";
        String line3 = "Спасибо";
        System.out.println(line1 + " - " + line2);
        System.out.println(service2.compare(line1, line2));

        System.out.println();
        System.out.println(line1 + " - " + line3);
        System.out.println(service2.compare(line1, line3));

        // Задача №3.
        System.out.println();
        ArrayService service3 = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(service3.getEvenNumbers(arr)));
    }
}