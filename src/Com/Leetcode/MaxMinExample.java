public class MaxMinExample {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 78, 34, 56, 89, 10};

        // Initialize max and min with the first element of the array
        int max = numbers[0];
        int min = numbers[0];

        // Loop through the array
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max
            }
            if (numbers[i] < min) {
                min = numbers[i]; // Update min
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}