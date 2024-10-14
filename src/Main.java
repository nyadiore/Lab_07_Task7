public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { // Outer loop for the number of lines

            for (int j = 0; j < 5; j++) { // Inner loop for the number of stars in each line

                System.out.print("* "); // Print star followed by a space

            }

            System.out.println(); // Move to the next line after each row

        }

    }

}