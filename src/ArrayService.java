public class ArrayService {
    public int[] getEvenNumbers(int[] numbers) {
        int length = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                length++;
            }
        }

        int[] tmp = new int[length];
        int copyToIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                tmp[copyToIndex] = numbers[i];
                copyToIndex++;
            }
        }
        numbers = tmp;
        return numbers;
    }
}

