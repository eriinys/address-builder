import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        StringBuilder myBuilder = new StringBuilder();

        System.out.println("Please provide the following information:");

        //Name
        String fullName = readInput(myScanner, "Full name: ");
        myBuilder.append(fullName).append("\n\n");

        //Billing Address
        myBuilder.append("Billing Address:\n");
        String billing = address(myScanner, "Billing");
        myBuilder.append(billing).append("\n");

        boolean same = askIfSame(myScanner, "Is the Shipping Address same as the Billing Address? Yes/No: ");

        //Shipping Address
        myBuilder.append("Shipping Address:\n");
        if (same) {
            myBuilder.append(billing).append("\n");
        } else {
            String shipping = address(myScanner, "Shipping");
            myBuilder.append(shipping).append("\n");
        }

        System.out.println("\nCustomer Information:");
        System.out.println(myBuilder);

    }

    public static String readInput(Scanner myScanner, String prompt) {
        System.out.println(prompt);
        return myScanner.nextLine();
    }

    public static String address (Scanner myScanner, String addressType) {
        String street = readInput(myScanner, addressType + " Street: ");
        String city = readInput(myScanner, addressType + " City: ");
        String state = readInput(myScanner, addressType + " State: ");
        String zip = readInput(myScanner, addressType + " Zip: ");

        StringBuilder sb = new StringBuilder();
        sb.append(street).append("\n")
                .append(city).append(", ").append(state).append(" ").append(zip).append("\n");
        return sb.toString();
    }

    public static boolean askIfSame(Scanner myScanner, String prompt) {
        while(true) {
            String answer = readInput(myScanner, prompt);
            if (answer.equalsIgnoreCase("yes")) return true;
            if (answer.equalsIgnoreCase("no")) return  false;
            System.out.println("Please enter yes or no.");


        }
    }
}
