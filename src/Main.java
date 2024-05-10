public class Main {

    public static void main(String[] args) {

        double[] numbers = new double[15];

        numbers[0] = Math.random() * 100;
        numbers[1] = Math.random() * 100;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = Math.random() * 200 - 100;
        }

        System.out.println("Массив чисел:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double sum = 0;
        int count = 0;
        boolean foundNegative = false;
        for (double num : numbers) {
            if (foundNegative && num > 0) {
                sum += num;
                count++;
            } else if (num < 0) {
                foundNegative = true;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("После первого отрицательного числа не было найдено положительных чисел.");
        }
    }
}
