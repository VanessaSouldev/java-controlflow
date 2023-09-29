public class E_Combining_Bonus {

    public static void main(String[] args) {


        int[] numbers = {7, 4, 1, 67, 2, 4, 6, 2, 345, 5, 52, 1, 2415, 7, 5, 178, 14, 4};

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {

                System.out.println(numbers[i]);

            }
        }
        int index = 0;
        int accumulator = 0;

        while (index > numbers.length && accumulator <= 400) {
            accumulator += numbers[index];
            index++;
        }
        System.out.println(accumulator);
    }
}
