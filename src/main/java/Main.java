import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        StringBuilder myBuilder = new StringBuilder();

        System.out.println("Please provide the following information:");

        //Name
        String fullName = readInput(myScanner, "Full name: ");
        myBuilder.append(fullName).append("\n" + "\n");

        //Billing Address
        myBuilder.append("Billing Address:\n");
        address(myScanner, myBuilder, "Billing");

        //Shipping Address
        myBuilder.append("\nShipping Address:\n");
        address(myScanner, myBuilder, "Shipping");

        System.out.println("\nCustomer Information:");
        System.out.println(myBuilder.toString());

    }

    public static String readInput(Scanner myScanner, String prompt) {
        System.out.println(prompt);
        return myScanner.nextLine();
    }

    public static void address (Scanner myScanner, StringBuilder myBuilder, String addressType) {
        String street = readInput(myScanner, addressType + " Street: ");
        myBuilder.append(street).append("\n");
        String city = readInput(myScanner, addressType + " City: ");
        String state = readInput(myScanner, addressType + " State: ");
        String zip = readInput(myScanner, addressType + " Zip: ");
        myBuilder.append(city).append(", ")
                .append(state).append(" ")
                .append(zip).append("\n");

    }
}
