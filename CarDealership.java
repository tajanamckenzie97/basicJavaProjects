import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Tajana's car dealership!");
        System.out.println(" . Select option 'a' to buy a car");
        System.out.println(" . Select option 'b' to sell a car");
        String option1 = scan.nextLine();

        switch(option1){
            case "a": 
            System.out.println("You chose option: " + option1); 
            System.out.println("What is your budget?");
            int budget = scan.nextInt();
            if (budget >= 100000) {
                System.out.println("Amazing! An Audi A3 would be perfect for your budget!");

                scan.nextLine();
                System.out.println("Do you have insurance? Please respond with 'yes' or 'no'");
                String insurance = scan.nextLine();
                System.out.println("\nDo you have a license? Please respond with 'yes' or 'no'");
                String license = scan.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scan.nextInt();
                if (insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                    System.out.println("\nSold! Was lovely doing business with you! Thank you.");
                } else {
                    System.out.println("\nWe're sorry, unfortunately you are not eligible for a dealership with us. ");
                }
            } else {
                System.out.println("\nUnfortunately we do not offer cars that fit this budget, good luck with your car search!");
            }
            break;

            case "b": 
            System.out.println("\nYou chose option: " + option1);
            System.out.println("\nWhat is your current car valued at?");
            int carValue = scan.nextInt();
            System.out.println("\nWhat is your selling price?");
            int sellingPrice = scan.nextInt();

            if (carValue > sellingPrice && sellingPrice < 30000) {
                System.out.println("\nWe will buy your car! Thank you for selling with us!");
            } else {
                System.out.println("\nSorry, we're not interested!");
            }
            break;


            default: System.out.println("\nInvalid option.");

            scan.close();
        }


    }
    
}
