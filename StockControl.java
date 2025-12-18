import java.util.Scanner;

public class StockControl{

    public static void main(String[] args){

        int userChoice = 0;

        showWelcomeMessage();
        Scanner scanner = new Scanner(System.in);

        while (userChoice != 6 && userChoice != 2) {
            showMenu(scanner);
            userChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (userChoice == 2) {
                option2(scanner);
            } else if (userChoice != 6) {
                System.out.println("Option not available");
            }
            }

            System.out.println("Exiting program...");
            scanner.close();
    }

    //Welcome message method
    public static void showWelcomeMessage(){
        System.out.println("Welcome to stock control");
    }

    //Method for menu
    public static void showMenu(Scanner scanner){
        

        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Payroll");
        System.out.println("2. Goods In");
        System.out.println("3. Goods Out");
        System.out.println("4. Stock Control");
        System.out.println("5. Reports");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

     //method for option 2
        public static void option2(Scanner scanner){

            
            System.out.println("Enter Product Code: ");
            String productCode = scanner.nextLine();

            System.out.println("Enter Product Name: ");
            String productName = scanner.nextLine();

            System.out.println("Enter Product Quantity: ");
            String productQUantity = scanner.nextLine();

            System.out.println("Enter Price per unit: ");
            String pricePerUnit = scanner.nextLine();

        }
}