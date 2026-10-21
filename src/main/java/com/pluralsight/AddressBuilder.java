package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {

         Scanner scnr = new Scanner(System.in);

         //title
        System.out.println("""
                *** Address Builder ***
                
                --- Please provide the following information:""");

        // get inputs
        System.out.print("Full name: ");
        String fullName = scnr.nextLine().trim();

        // billing address
        System.out.print("\nBilling street");
        String billingStreet = scnr.nextLine().trim();

        System.out.print("Billing City: ");
        String billingCity = scnr.nextLine().trim();

        System.out.print("Billing State: ");
        String billingState = scnr.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scnr.nextLine();

        // shipping information

        System.out.print("\nShipping Street: ");
        String shippingStreet = scnr.nextLine().trim();

        System.out.print("Shipping City: ");
        String shippingCity = scnr.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scnr.nextLine().trim();

        System.out.print("Shipping Zip: ");
        String shippingZip = scnr.nextLine().trim();

        //create a string builder

        StringBuilder address = new StringBuilder();

        // add name to final address
        address.append(fullName).append("\n");

        //add billing address
        address.append("Billing Address:\n");
        address.append(billingStreet).append("\n");
        address.append(billingCity).append(", ");
        address.append(billingState).append(" ");
        address.append(billingZip).append("\n\n");

        // Add shipping address
        address.append("Shipping Address:\n");
        address.append(shippingStreet).append("\n");
        address.append(shippingCity).append(", ");
        address.append(shippingState).append(" ");
        address.append(shippingZip);

        // convert StringBuilder into a string
        String finalAddress = address.toString();

        //display

        System.out.println("\n--- Customer Information:\n");
                System.out.println(finalAddress);

        scnr.close();


    }
}
