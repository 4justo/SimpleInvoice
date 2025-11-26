import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double discount = 0.006368;

        //Billing and the shipping address
        String house, street, address, contact, email_address;
        System.out.print("Enter the place of item  delivery: ");
        house = input.nextLine();
        System.out.print("Enter the street of item delivery: ");
        street = input.nextLine();
        System.out.print("Enter the address of item delivery: ");
        address = input.nextLine();
        System.out.print("Enter the area code the place of the delivery: ");
        String area_code = input.nextLine();
        System.out.print("Enter the contact of the place of delivery: ");
        contact = input.nextLine();
        System.out.print("Enter the email address of the place of delivery: ");
        email_address = input.nextLine();

        // Product1
        System.out.print("First item product code: ");
        int p1code = input.nextInt();
        input.nextLine();
        System.out.print("First item Product Name: ");
        String p1Name = input.nextLine();
        System.out.print("First item HSN code: ");
        String p1Hsn = input.nextLine();
        System.out.print("First item Quantity (integer): ");
        int p1Qty = input.nextInt();
        input.nextLine();
        System.out.print("First item Units (e.g. nos): ");
        String p1Units = input.nextLine();
        System.out.print("First item Rate: ");
        float p1Rate = input.nextFloat();
        System.out.print("First item Tax% : ");
        float p1Tax = input.nextFloat();
        System.out.print("First item product price:");
        float p1Amount = input.nextFloat();
        input.nextLine();

        // Product 2
        System.out.print("Second item product code: ");
        int p2code = input.nextInt();
        input.nextLine();
        System.out.print("Second item Product Name: ");
        String p2Name = input.nextLine();
        System.out.print("Second item HSN code: ");
        String p2Hsn = input.nextLine();
        System.out.print("Second item Quantity (integer): ");
        int p2Qty = input.nextInt();
        input.nextLine();
        System.out.print("Second item Units (e.g. nos, kg): ");
        String p2Units = input.nextLine();
        System.out.print("Second item Rate (per unit, decimal): ");
        float p2Rate = input.nextFloat();
        System.out.print("Second item Tax% : ");
        float p2Tax = input.nextFloat();
        System.out.print("Second item price: ");
        float p2Amount = input.nextFloat();
        input.nextLine();

        // Product 3
        System.out.print("Third item product code: ");
        int p3code = input.nextInt();
        input.nextLine();
        System.out.print("Third item Product Name: ");
        String p3Name = input.nextLine();
        System.out.print("Third HSN code: ");
        String p3Hsn = input.nextLine();
        System.out.print("Third item Quantity (integer): ");
        int p3Qty = input.nextInt();
        input.nextLine();
        System.out.print("Third item Units: ");
        String p3Units = input.nextLine();
        System.out.print("Third Rate (per unit, decimal): ");
        float p3Rate = input.nextFloat();
        System.out.print("Third item Tax%: ");
        float p3Tax = input.nextFloat();
        System.out.print("Third item price:");
        float p3Amount = input.nextFloat();
        input.nextLine();

        // Product 4
        System.out.print("Fourth item product code: ");
        int p4code = input.nextInt();
        input.nextLine();
        System.out.print("Fourth item Product Name: ");
        String p4Name = input.nextLine();
        System.out.print("Fourth item HSN code: ");
        String p4Hsn = input.nextLine();
        System.out.print("Fourth item Quantity (integer): ");
        int p4Qty = input.nextInt();
        input.nextLine();
        System.out.print("Fourth item  Units: ");
        String p4Units = input.nextLine();
        System.out.print("Fourth item Rate (per unit, decimal): ");
        float p4Rate = input.nextFloat();
        System.out.print("Fourth item Tax%: ");
        float p4Tax = input.nextFloat();
        System.out.print("Fourth item price:");
        float p4Amount = input.nextFloat();
        input.nextLine();

        // Product 5
        System.out.print("Fifth item product code: ");
        int p5code = input.nextInt();
        input.nextLine();
        System.out.print("Fifth item Product Name: ");
        String p5Name = input.nextLine();
        System.out.print("Fifth item HSN code: ");
        String p5Hsn =input.nextLine();
        System.out.print("Fifth item Quantity (integer): ");
        int p5Qty = input.nextInt();
        input.nextLine();
        System.out.print("Fifth item Units: ");
        String p5Units = input.nextLine();
        System.out.print("Fifth item Rate (per unit, decimal): ");
        float p5Rate = input.nextFloat();
        System.out.print("Fifth Tax%: ");
        float p5Tax = input.nextFloat();
        System.out.print("Fifth item price: ");
        float p5Amount = input.nextFloat();
        input.nextLine();

        // Product 6
        System.out.print("Sixth item product code: ");
        int p6code = input.nextInt();
        input.nextLine();
        System.out.print("Sixth item Product Name: ");
        String p6Name = input.nextLine();
        System.out.print("Sixth item HSN code: ");
        String p6Hsn = input.nextLine();
        System.out.print("Sixth item Quantity (integer): ");
        int p6Qty = input.nextInt();
        input.nextLine();
        System.out.print("Sixth item Units: ");
        String p6Units = input.nextLine();
        System.out.print("Sixth Rate (per unit, decimal): ");
        float p6Rate = input.nextFloat();
        System.out.print("Sixth Tax%: ");
        float p6Tax = input.nextFloat();
        System.out.print("Sixth item price:");
        float p6Amount = input.nextFloat();
        input.nextLine();

        // Product 7
        System.out.print("Seventh item product code: ");
        int p7code = input.nextInt();
        input.nextLine();
        System.out.print("Seventh item Product Name: ");
        String p7Name = input.nextLine();
        System.out.print("Seventh item HSN code: ");
        String p7Hsn = input.nextLine();
        System.out.print("Seventh item Quantity (integer): ");
        int p7Qty = input.nextInt();
        input.nextLine();
        System.out.print("Seventh item Units: ");
        String p7Units = input.nextLine();
        System.out.print("Seventh item Rate (per unit, decimal): ");
        float p7Rate = input.nextFloat();
        System.out.print("Seventh Tax%: ");
        float p7Tax = input.nextFloat();
        System.out.print("Seventh item price:");
        float p7Amount = input.nextFloat();
        input.nextLine();

        //Calculations
        float total = p1Amount + p2Amount + p3Amount + p4Amount + p5Amount + p6Amount + p7Amount;
        float discountamount = (float) (discount * total);
        float grandtotal = total - discountamount;

        // Grind to display the sales invoice
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        // Bill To / Ship To Header
        System.out.printf("%-70s%s%n", "\t Bill To:", "Ship To:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("\t %-65s\t\t\t\t %s%n", house, house);
        System.out.printf("\t %-65s\t\t\t\t %s%n", address, address);
        System.out.printf("\t %-65s\t\t\t\t %s%n", area_code, area_code);
        System.out.printf("\t %-65s\t\t\t\t %s%n", contact, contact);
        System.out.printf("\t %-65s\t\t\t\t %s%n", email_address, email_address);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t Payment Date: 7 days from the date of delivery\t\t\t\t\t Payment Terms: 100% against invoice");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("S.No \t | Product code \t\t | Product Name \t\t\t | HSN Code \t\t\t | Quantity \t | Units \t | Rate \t | Tax \t | Amount|");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("1.  \t\t| "+ p1code+ "\t\t\t\t\t\t | " + p1Name + "\t\t\t\t\t\t\t\t\t| " + p1Hsn + "\t\t\t\t\t\t| " + p1Qty + "\t| " + p1Units + "\t| " + p1Rate + "\t" +
                "\t| " + p1Tax + "\t| "+ p1Amount );
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("2.  \t\t| "+ p2code+ "\t\t| " + p2Name + "\t\t\t| " + p2Hsn + "\t\t\t| " + p2Qty + "\t| " + p2Units + "\t| " + p2Rate + "\t" +
                "\t| " + p2Tax + "\t| "+ p2Amount );
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("3.  \t\t| "+ p3code+ "\t\t| " + p3Name + "\t\t\t| " + p3Hsn + "\t\t\t| " + p3Qty + "\t| " + p3Units + "\t| " + p3Rate + "\t" +
                "\t| " + p3Tax + "\t| "+ p3Amount );
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("4.  \t\t| "+ p4code+ "\t\t| " + p4Name + "\t\t\t| " + p4Hsn + "\t\t\t| " + p4Qty + "\t| " + p4Units + "\t| " + p4Rate + "\t" +
                "\t| " + p4Tax + "\t| "+ p4Amount );
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        // FIXED row (you had everything wrong here)
        System.out.println("5. \t\t| "+ p5code+ "\t\t| " + p5Name + "\t\t\t| " + p5Hsn + "\t\t\t| " + p5Qty + "\t| " + p5Units + "\t| " + p5Rate + "\t" +
                "\t| " + p5Tax + "\t| "+ p5Amount );
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        System.out.println("6.  \t\t| "+ p6code+ "\t\t| " + p6Name + "\t\t\t| " + p6Hsn + "\t\t\t| " + p6Qty + "\t| " + p6Units + "\t| " + p6Rate + "\t" +
                "\t| " + p6Tax + "\t| "+ p6Amount );

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("7.  \t\t| "+ p7code+ "\t\t| " + p7Name + "\t\t\t| " + p7Hsn + "\t\t\t| " + p7Qty + "\t| " + p7Units + "\t| " + p7Rate + "\t" +
                "\t| " + p7Tax + "\t| "+ p7Amount );
        System.out.println("............................................................................................................................");
        System.out.println("\t\t\t\t\t\t\t\t\tTotal:\t | " + total);
        System.out.println("\t\t\t\t\t\t\t\t\t----------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tDiscounts: \t| " + discountamount);
        System.out.println("\t\t\t\t\t\t\t\t\t----------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t rand Total:\t| "+ grandtotal);
        System.out.println("\t\t\t\t\t\t\t\t\t----------------------------");

    }
}
