public class MeanCalculation {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double mean = sum / (double) numbers.length;
        System.out.println("Mean of the numbers: " + mean);
    }
}
