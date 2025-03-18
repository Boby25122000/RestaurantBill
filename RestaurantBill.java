import java.util.Scanner;

class RestaurantBill {
    static String customerName;
    static int tableNumber;
    static int numberOfItems;
    static double totalCost;
    static double gstRate = 0.18;
    
    public static void main(String[] args) {
        getDetails();
        calculateBill();
        displayBill();
    }
    
    public static void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        customerName = scanner.nextLine();
        System.out.println("Enter Table Number: ");
        tableNumber = scanner.nextInt();
        System.out.println("Enter Number of Items Ordered: ");
        numberOfItems = scanner.nextInt();
    }
    
    public static void calculateBill() {
        Scanner scanner = new Scanner(System.in);
        totalCost = 0;
        for (int i = 1; i <= numberOfItems; i++) {
            System.out.println("Enter price of item " + i + ": ");
            double itemPrice = scanner.nextDouble();
            totalCost += itemPrice;
        }
    }
    
    public static void displayBill() {
        double gstAmount = totalCost * gstRate;
        double finalAmount = totalCost + gstAmount;
        
        System.out.println("\n******* RESTAURANT BILL *******");
        System.out.println("\n");
        System.out.println("Customer Name: \t" + customerName);
        System.out.println("Table Number: \t" + tableNumber);
        System.out.println("Number of Items: " + numberOfItems);
        System.out.println("Total Cost: \t" + totalCost);
        System.out.println("GST (18%): \t" + gstAmount);
        System.out.println("Final Bill: \t" + finalAmount);
        System.out.println("\n_________________________\n");
        System.out.println("******* Thank You! Visit Again! *******");
    }
}
