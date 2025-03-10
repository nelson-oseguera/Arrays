package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a series of integers
        System.out.println("Enter a series of integers (one per line, and press ENTER with no integer to stop):");
        int[] randomNums = new int[100]; // Initialize an array (So the user can enter as many as they would like)
        int count = 0; // Count of elements entered

        // Scan integers until an empty line is entered
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break; // Break the loop if an empty line is entered
            }

            int num = Integer.parseInt(input);
            randomNums[count] = num; // Store the entered numbers in the array
            count++;
        }

        // Prompt the user to enter the integer to count its occurrences
        System.out.print("Enter an integer to count its occurrences: ");
        int targetNum = scanner.nextInt();

        // Count the occurrences of the selected integer
        int occurrences = 0;
        for (int i = 0; i < count; i++) {
            if (randomNums[i] == targetNum) {
                occurrences++;
            }
        }

        // Calculate the size of the new array (twice the number of elements)(new array called doubleNums)
        int newSize = count * 2;
        int[] doubleNums = new int[newSize];

        // Assign values from the original array to the new array
        for (int i = 0; i < count; i++) {
            doubleNums[i] = randomNums[i];
            
        }
        // Display occurrences of targeted integer
        System.out.println("Occurrences of " + targetNum + ": " + occurrences);

        // Display the new array
        System.out.println("New array with twice the number of elements:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(doubleNums[i] + " ");
        }
    }
}
