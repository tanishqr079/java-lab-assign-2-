class Main {
    public static void main(String args[]) {
        UserInput in = new UserInput();
        ArrayFunctions functions = new ArrayFunctions();

        int[] userArray = in.arrayInput();

        functions.oddEven(userArray);

        // Call the function to find minimum difference
        int minDiff = functions.findMinDifference(userArray);
        System.out.println("Minimum difference between consecutive numbers: " + minDiff);
    }
}

