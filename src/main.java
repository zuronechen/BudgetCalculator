import java.util.Scanner;

/**
 * Created by zurone on 6/25/17.
 */
public class main {
    public static void main (String[] arg) {

        double monthlyIncome, rentCost, internetCost, extraDataUsed, phoneCost, groceriesBudget, gasCost, miscellaneousBudget;

        rentCost = 650;
        internetCost = 44.95;


        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your income this month:");
        monthlyIncome = userInput.nextDouble();


        System.out.println("Enter additional GBs of data used:");
        extraDataUsed = userInput.nextDouble();

        phoneCost = 43.60 + (extraDataUsed * 10);

        System.out.println("Phone bill amount: " + phoneCost);
        System.out.println();

        System.out.println("Enter amount spent on gas:");
        gasCost = userInput.nextDouble();

        System.out.println("Amount remaining after paying rent, internet, and phone: " + (monthlyIncome - (rentCost + internetCost + phoneCost + gasCost)));

        groceriesBudget = 0.10 * monthlyIncome;
        miscellaneousBudget = monthlyIncome - (rentCost + internetCost + phoneCost + groceriesBudget + gasCost);

        System.out.println("Groceries allowance: " + groceriesBudget);
        System.out.println("Miscellaneous allowance: " + miscellaneousBudget);
    }
}
