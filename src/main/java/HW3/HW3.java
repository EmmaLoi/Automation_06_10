package HW3;

public class HW3 {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int[20];
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = i + 1;
        }

        System.out.println(sumOfArrayValues(new int[]{0, -5, 10, 45, 5}));
        System.out.println(sumOfArrayValues(arrayOfNumbers));

        printPositiveEvenNumbers(new int[]{1, 0, -10, 240, 2, 100, 7});
        printPositiveEvenNumbers(arrayOfNumbers);
    }

    private static int sumOfArrayValues(int[] arrayName) {
        int sum = 0;
        for (int n : arrayName) {
            if (n > 5 && n < 45) {
                sum += n;
            }
        }
        return sum;
    }

    private static void printPositiveEvenNumbers(int[] arrayName) {
        for (int n : arrayName) {
            if (n % 2 == 0 && n > 0) {
                System.out.print(n + ";");
            }
        }
        System.out.println();
    }
}