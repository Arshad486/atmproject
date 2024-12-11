package atm;

import java.util.Scanner;

public class ATM {

	private static double balance = 5000.00;  // Initial balance
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		    int choice;
		    while(true) {
		    	
	System.out.println("\n===== ATM Menu=====");
	
	    System.out.println("1.check Balance");
	    System.out.println("2.Deposit Money");
	    System.out.println("3.Withdraw Money");
	    System.out.println("4.Exit");
	    
	    System.out.println("Choose an option: ");
	    
	       choice = sc.nextInt();
	       
	       switch (choice) {
	    	   
	    	   case 1:
	    		   
	    		   checkBalance();
	    		   
	    	   case 2:
	    		   
	    		   depositMoney(sc);
	    		   break;
	    		   
	    	   case 3:
	    		   
	    		   withdrawMoney(sc);
	    		   break;
	    		   
	    	   case 4:
	    		   
	    		   System.out.println("Thank you for using the ATM!");
	    		   
	    		     sc.close();
	    		     System.exit(0);
	    		     default:
	    		    	 
	    		    	 System.out.println("Invalid choice. please choose a valid option.");
	    		    	 
	    		    	 
	     }
	  }
   }
	
 

        // Method to check balance

      public static void  checkBalance() {
    	  
    	  System.out.printf("Current Balance: $%.2f\n", balance);
      }
      
      // Method to deposit money
      
      public static void depositMoney(Scanner sc) {
    	  
    	  System.out.print("Enter the amount to deposit: ");
    	  
    	   double amount = sc.nextDouble();
    	   
    	   if(amount>0) {
    		   
    		   balance += amount;
    		   
    		   System.out.printf("Sucessfully deposited $%.2f. Current Balance: $%.2f\n", amount, balance);
    		   
    	   } else {
    		   
    		   System.out.println("Invalid amount.please enter a positive number.");
    		   
    	   }
      }
      
      // Method to Withdraw money 
      
      public static void withdrawMoney(Scanner sc) {
    	  
    	  System.out.print("Enter the amount to withdraw: ");
    	  
    	  double amount = sc.nextDouble();
    	  
    	  if (amount > 0 && amount <= balance) {
    		  
    		  balance -= amount;
    		  
    	   System.out.printf("Sucessfully withdrew $%.2f. Current Balance: $%.2f\n", amount, balance);
    	   
    	  }else if(amount > balance) {
    		  
    		  System.out.println("Insufficient balance.");
    		  
    	  }else {
    		  
    		  System.out.println("Invalid amount.please enter a positive number.");
    		  
    	  }
    	  
    	}
      
      }
    
         
