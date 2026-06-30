public class FindMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        int max = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }

        System.out.println();
        System.out.println("The largest number is " + max + ", and it's at index " + maxIndex + ".");

        input.close();
    }
}
