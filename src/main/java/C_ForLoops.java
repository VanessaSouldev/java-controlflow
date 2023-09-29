public class C_ForLoops {

    public static void main(String[] args) {

        //
        // ForLoops 1
        //

        // Gebruik een for-loop om een count-down te maken. 3...2...1
        for (int i = 3; i > 0; i--)
            System.out.println(i);

        System.out.println("Lift off!");


        //
        // ForLoops 2
        //

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
        for (char b = 'A'; b <= 'Z'; b++) {
            System.out.println(b);
        }

        //
        // ForLoops 3
        //
        int[] numbers = {4, 3, 6, 8, 2, 3, 2, 2, 0, 9};
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);

        }

    }
}
