public class PairSumBruteForce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int size = input.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.print("What target sum are you looking for? ");
        int target = input.nextInt();

        boolean found = false;

        outerLoop:
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println();
                    System.out.println("Found a pair! numbers[" + i + "] + numbers[" + j + "] = " 
                        + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break outerLoop;
                }
            }
        }

        if (!found) {
            System.out.println("Couldn't find any pair that adds up to " + target + ".");
        }

        input.close();
    }
}
