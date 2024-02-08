public class CalcService {

    public String findMax(int a, int b) {
        String response;
        if (a > b) {
            response = "a > b";
        } else if (a == b) {
            response = "a = b";
        } else {
            response = "a < b";
        }
        return response;
    }

    int sum;
    int difference;
    int product;
    int quotient;

    public int addition(int a, int b) {
        sum = a + b;
        return sum;
    }

    public int subtraction(int a, int b) {
        difference = a - b;
        return difference;
    }

    public int multiplication(int a, int b) {
        product = a * b;
        return product;
    }

    public int division(int a, int b) {
        quotient = a / b;
        return quotient;
    }
}
