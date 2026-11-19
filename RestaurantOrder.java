
    
import java.util.Scanner;
public class RestaurantOrder {

    public static void main(String[] args) {
        
    

        // Create Scanner object
        Scanner input = new Scanner(System.in);


       
       final  double DRINK_PRICE = 15.50;
       final  double STUDENT_DISCOUNT = 0.10;
       final  double SENIOR_DISCOUNT = 0.05;
       final  double TIP_RATE = 0.10;

        
        System.out.print("Enter customer name: ");
        String name = input.nextLine();

        System.out.print("Enter customer age: ");
        int age = input.nextInt();

        System.out.print("Enter meal price: $");
        double mealPrice = input.nextDouble();

        System.out.print("Enter number of drinks: ");
        int drinks = input.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        System.out.print("Enter service rating (1-5): ");
        int rating = input.nextInt();

      
        if (rating < 1 || rating > 5) {

            System.out.println("Error: Rating must be between 1 and 5.");

            System.out.println("Error: Rating must be between 1 and 5.");
        } else {

        
            double drinksCost = drinks * DRINK_PRICE;

            double subtotal = mealPrice + drinksCost;

        
            double discountRate;

            if (isStudent && age >= 60) {

                discountRate = STUDENT_DISCOUNT;

            } else if (isStudent) {

                discountRate = STUDENT_DISCOUNT;

            } else if (age >= 60) {

                discountRate = SENIOR_DISCOUNT;

            } else {

                discountRate = 0.0;

            }

            double discountAmount = subtotal * discountRate;

            double afterDiscount = subtotal - discountAmount;

            
            double tipAmount;

            if (rating == 4 || rating == 5) {

                tipAmount = afterDiscount * TIP_RATE;

            } else {

                tipAmount = 0.0;

            }

      
            double finalBill = afterDiscount + tipAmount;

            
            int wholeAmount = (int) finalBill;

            
            
// Print receipt

System.out.println("\n======== RESTAURANT Recipt ============");

System.out.println("Customer: " + name);

System.out.println("Meal: $ " +  mealPrice);

System.out.println("Drinks: $" +  drinksCost);

System.out.println("Discount: $" + discountAmount);

System.out.println("Tip: $" +  tipAmount);

System.out.println("Final bill: $" + finalBill);

System.out.println("Whole amount: $" + wholeAmount);


System.out.println("=======================================");

        }

        input.close();

    }
}