/**
 *  This program is designed to display interact with a customer or a manager at
 *  the command line
 *  
 *  @author Abhishek Bhuvanendran, Michael Doherty,Victoria Maia, Taline Mkrtschjan,
 *  Victor Valenzuela
 *  
 *  Due April 25, 2021
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain 
{
	
	public static void main(String args[])
	{
		
		Menu currentMenu = new Menu();
		
		Food food0, food1, food2, food3, food4, food5, food6, food7, food8, 
		 food9, food10, food11, food12;
		food1 = new Appetizer("Fries", 9.00);
		food2 = new Appetizer("Greek Salad",10.0);
		food3 = new Appetizer("Calamari", 12.0);
		food4 = new Entree("Lobster dinner", 60.0);
		food5 = new Entree("Crab dinner", 30.0);
		food6 = new Entree("Chicken Marsala", 25.0);
		food7 = new Dessert("Ice Cream Sunday", 12.0);
		food8 = new Dessert("Chocolate cake", 12.00);
		food9 = new Dessert("Apple pie", 8.0);
		food10 = new Drink("Coke", 5.0);
		food11 = new Drink("Water", 2.0);
		food12 = new Drink("Coffee", 3.0);
		
		currentMenu.addItem(food1);
		currentMenu.addItem(food2);
		currentMenu.addItem(food3);
		currentMenu.addItem(food4);
		currentMenu.addItem(food5);
		currentMenu.addItem(food6);
		currentMenu.addItem(food7);
		currentMenu.addItem(food8);
		currentMenu.addItem(food9);
		currentMenu.addItem(food10);
		currentMenu.addItem(food11);
		currentMenu.addItem(food12);
		
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Welcome to the Restaurant!");
		
		String userType ="";
		do
		{
			System.out.println("If you are a manager, please type \"M\", if you are a customer, please type \"C\", and if you wish to leave, please type \"L\".");

			userType = inputScan.nextLine().toUpperCase();
			if(userType.equals("M"))
					{
				manageRestaurant();
					}
			else if(userType.equals("C"))
			{
				visitRestaurant();
			}
			else if(userType.equals("L"))
			{
				System.out.println("We hope you have a nice day!");
				break;
			}
			else
			{
				System.out.println("I'm sorry, but I didn't understand that, could you try again?\n");
			}
		}while(!(userType.equals("L")));
		
	}
	
	 static void manageRestaurant()
	{
		 Scanner inputScan = new Scanner(System.in);
		 int choice = 0;
	
	do
	{
		choice = 0;
		System.out.println("\nManager, what would you like to do?(Enter the corresponding digit)");
		System.out.println("1. View the menu\n2. Remove a dish from the menu\n3. Add a dish to the menu\n4. Adjust the price of a dish\n5. Make a dish a special for the day\n6. View the amount of orders placed today\n7. Leave this menu");
		try
		{
			choice = inputScan.nextInt();
			
		}
		catch(InputMismatchException e)
		{
			//System.out.println("Please choose a valid option\n");
			inputScan.next();
		}
		if(!((choice<=7)&&(choice>=1)))
		{
			System.out.println("Please choose a valid option\n");
		}
		else if(choice == 1)
		{
			System.out.println();
			printMenu();
		}
		else if(choice ==2)
		{
			removeFromMenu();
		}
		else if(choice ==3)
		{
			addToMenu();
		}
		else if(choice ==4)
		{
			adjustPricing();
		}
		else if(choice ==5)
		{
			adjustSpecial();
		}
		else if(choice==6)
		{
			viewOrders();
		}
	
		
		
		
	}while(!(choice==7));
	
	return;
	
	}
	 
	 static void printMenu()
		{
			Menu theMenu = new Menu();
			System.out.println("The Menu:");
			System.out.println("*****************************************");
			System.out.println(theMenu.getMenu());
			System.out.println("*****************************************");
			
		}
	 static void removeFromMenu()
	 {
		 Scanner inputScan = new Scanner(System.in);
		 String yes_no="";
		 Menu theMenu = new Menu();
		 
		 do
		 {
			 System.out.println("\nWhich food would you like to remove from the Menu?");
			 String removedFood = inputScan.nextLine();
			 Food deletedFood = theMenu.findItem(removedFood);
			 theMenu.removeItem(removedFood);
			 if(deletedFood ==null)
			 {
				 System.out.println("That item does not exist on the Menu\n");
			 }
			 else
			 {
				 System.out.println("Your dish has been removed from the menu");
			 }
			 
			 do
			 {
				 System.out.println("\nWould you like to continue removing from the menu?(Y/N)");
				 yes_no = inputScan.nextLine();
				 yes_no = yes_no.toUpperCase();
			 }while(!(yes_no.equals("N")||(yes_no.equals("Y"))));
		 }while(!(yes_no.equals("N")));
		 
	 }
	 
	 static void addToMenu()
	 {
		 Scanner inputScan = new Scanner(System.in);
		 Scanner numberScan = new Scanner(System.in);
		 String yes_no="";
		 Menu theMenu = new Menu();
		 Manager theManager = new Manager();
		 
		 do
		 {
			 System.out.println("\nWhich food would you like to add to the Menu?");
			 String addedFood = inputScan.nextLine();
			 Food createdFood = theMenu.findItem(addedFood);
			 if(createdFood !=null)
			 {
				 System.out.println("That item already exists on the Menu");
			 }
			 else
			 {
				 double price = -1;
				 
				 do 
				 {
					 price = -1;
					 
						try
						{
							 System.out.println("\nHow much will this item cost?");
							 price = numberScan.nextDouble();
							
						}
						catch(InputMismatchException e)
						{
					
							numberScan.next();
						}
					
					 if(price<0)
					 {
						 System.out.println("\nPlease input a valid price");
					 }
				 }while(price<=0);
				 String foodType = "";
				 do
				 {
					 System.out.println("\nWhat type of food is it? (Appetizer, Drink, Dessert, or Entree)");
					 foodType = inputScan.nextLine();
					 foodType = foodType.toUpperCase();
					 if(!(foodType.equals("APPETIZER")||foodType.equals("DRINK")||foodType.equals("DESSERT")||foodType.equals("ENTREE")))
					 {
						 System.out.println("Please input a valid food type\n");
					 }
					 
					 
				 }while(!(foodType.equals("APPETIZER")||foodType.equals("DRINK")||foodType.equals("DESSERT")||foodType.equals("ENTREE")));
				 
				Food newFood = null;
				 if(foodType.equals("APPETIZER"))
				 {
					 newFood = new Appetizer(addedFood,price);
				 }
				 else if(foodType.equals("DRINK"))
				 {
					 newFood = new Drink(addedFood,price);
				 }
				 else if(foodType.equals("DESSERT"))
				 {
					 newFood = new Dessert(addedFood,price);
				 }
				 else if(foodType.equals("ENTREE"))
				 {
					 newFood = new Entree(addedFood,price);
				 }
				 
				 theMenu.addItem(newFood);
				 
				 System.out.println("\nYour dish has been added to the menu");
				 
			 }
			
			 
			
			 do
			 {
				 System.out.println("\nWould you like to continue adding to the menu?(Y/N)");
				 yes_no = inputScan.nextLine();
				 yes_no = yes_no.toUpperCase();
			 }while(!(yes_no.equals("N")||(yes_no.equals("Y"))));
			
			 
		 }while(!(yes_no.equalsIgnoreCase("N")));
		 
	 }
	 
	 static void adjustPricing()
	 {
		 
		 Scanner inputScan = new Scanner(System.in);
		 Scanner numberScan = new Scanner(System.in);
		 String yes_no="";
		 Menu theMenu = new Menu();
		 Manager theManager = new Manager();
		 String foodName ="";
		 do
		 {
			 System.out.println("\nWhich food would you like to adjust the price of?");
			 foodName = inputScan.nextLine();
			 
			 Food adjustedFood = theMenu.findItem(foodName);
			 if(adjustedFood ==null)
			 {
				 System.out.println("That item does not exist on the menu");
			 }
			 else
			 {
				 double price = -1;
				 
				 do 
				 {
					 price = -1;
					 
					 
						try
						{
							 System.out.println("\nWhat is the new price?");
							 price = numberScan.nextDouble();
							
						}
						catch(InputMismatchException e)
						{
					
							numberScan.next();
						}
					
					 if(price<0)
					 {
						 System.out.println("\nPlease input a valid price");
					 }
				 }while(price<=0);
				 theManager.changePrice(adjustedFood, price);
			 }
			 do
			 {
				 System.out.println("\nWould you like to continue adjusting prices?(Y/N)");
				 yes_no = inputScan.nextLine();
				 yes_no = yes_no.toUpperCase();
			 }while(!(yes_no.equals("N")||(yes_no.equals("Y"))));
			 
			 
		 }while(!(yes_no.equalsIgnoreCase("N")));
		 
		 
	 }
	 static void adjustSpecial()
 {
		 
		 Scanner inputScan = new Scanner(System.in);
		 String yes_no="";
		 Menu theMenu = new Menu();
		 Manager theManager = new Manager();
		 String foodName ="";
		 do
		 {
			 System.out.println("\nWhich food would you like to adjust as a special?");
			 foodName = inputScan.nextLine();
			 
			 Food specialFood = theMenu.findItem(foodName);
			 if(specialFood ==null)
			 {
				 System.out.println("That item does not exist on the menu");
			 }
			 else
			 {
				 if(!(specialFood.isSpecial()))
				 {
					 theManager.adjustSpecial(specialFood, true);
					 System.out.println("The menu item is now a special");
				 }
				 else
				 {
					 theManager.adjustSpecial(specialFood, false);
					 System.out.println("The menu item is no longer a special"); 
				 }
				 
	
			 }
			 do
			 {
				 System.out.println("\nWould you like to continue adjusting prices?(Y/N)");
				 yes_no = inputScan.nextLine();
				 yes_no = yes_no.toUpperCase();
			 }while(!(yes_no.equals("N")||(yes_no.equals("Y"))));
			 
			 
		 }while(!(yes_no.equalsIgnoreCase("N")));
		  
	 }
	 static void viewOrders()
	 {
		 if(Billing.orderList.size()==1)
		 {
			 System.out.println("\nThere is " +Billing.orderList.size()+ " order currently placed today" );
			 
		 }
		 else
			 System.out.println("\nThere are " +Billing.orderList.size()+ " orders currently placed today" );
		 
		 

		 
	 }
	 
	 static void visitRestaurant()
	 {
		 boolean submitted = false;
		 Scanner inputScan = new Scanner(System.in);
		 String yes_no="";
		 Menu theMenu = new Menu();
		 int choice = 0;
		 System.out.println("Hello Customer, what is your name?");
		 String name = inputScan.nextLine();
		 Customer theCustomer = new Customer(name);
		 do
			{
			 choice = 0;
		 System.out.println("\n"+ name+ ", what would you like to do?(Enter the corresponding digit)");
			System.out.println("1. View the menu\n2. Add an item to your order\n3. Remove an item from your order\n4. View your order\n5. Place your order\n6. Pay your bill\n7. Leave this menu");
			try
			{
				choice = inputScan.nextInt();
				
			}
			catch(InputMismatchException e)
			{
				//System.out.println("Please choose a valid option\n");
				inputScan.next();
			}
			if(!((choice<=7)&&(choice>=1)))
			{
				System.out.println("Please choose a valid option from the menu\n");
				printMenu();
			}
			if(submitted&& (choice ==1||choice ==2||choice ==3||choice ==5))
			{
				System.out.println("We are currently working on your finalized order");
				
			}
				else if(choice == 1)
				{	System.out.println();
					printMenu();
				}
				else if(choice ==2)
				{
					addToOrder(theCustomer);
				}
				else if(choice ==3)
				{
					removeFromOrder(theCustomer);
				}
				else if(choice ==4)
				{
					viewOrder(theCustomer);
				}
				else if(choice ==5)
				{
					submitOrder(theCustomer);
					submitted = true;
				}
				else if(choice==6)
				{
					payBill(theCustomer);
				}
				
			}while(choice!=7);
		 
		 
	 }
	 static void addToOrder(Customer theCustomer)
	 {
		 Scanner inputScan = new Scanner(System.in);
		 Scanner numberScan = new Scanner(System.in);
	
		
		 
		String yes_no = "";
		String orderedFood = "";
		do
		{
			int quantity = -1;
		 System.out.println("\nWhat would you like to add to your order?");
		 orderedFood = inputScan.nextLine();
		
		 
		 do
		 {
			 try
				{
				 System.out.println("How many would you like?");
					quantity = numberScan.nextInt();
					
				}
				catch(InputMismatchException e)
				{
					//System.out.println("Please choose a valid option\n");
					numberScan.next();
					
				}
		 }while(quantity==-1);
		 theCustomer.placeOrder(orderedFood,quantity);
		 do
		 {
			 System.out.println("\nWould you like to continue adding food?(Y/N)");
			 yes_no = inputScan.nextLine();
			 yes_no = yes_no.toUpperCase();
		 }while(!(yes_no.equals("N")||(yes_no.equals("Y"))));
		 
		
		}while(!(yes_no.equalsIgnoreCase("N")));
	 }
	 static void removeFromOrder(Customer theCustomer)
	 {
		 String yes_no ="";
		 String removedFood ="";
		 Scanner inputScan = new Scanner(System.in);
	
			do
			{
			 System.out.println("\nWhat would you like to remove from your order? Note that you may only remove one item at a time");
			 removedFood = inputScan.nextLine();
			 theCustomer.reduceOrder(removedFood);
			 
		
			 do
			 {
				 System.out.println("\nWould you like to continue removing food from your order?(Y/N)");
				 yes_no = inputScan.nextLine();
				 yes_no = yes_no.toUpperCase();
			 }while(!(yes_no.equals("N")||(yes_no.equals("Y"))));
			 
			
			}while(!(yes_no.equalsIgnoreCase("N")));
	 }
	 static void viewOrder(Customer theCustomer)
	 {
		 System.out.println(theCustomer.seeOrder());
		
	 }
	 static void submitOrder(Customer theCustomer)
	 {
		 System.out.println("\nYour order: ");
		viewOrder(theCustomer);
		 theCustomer.submitFullOrder();
	 }
	 static void payBill(Customer theCustomer)
	 {
		 double tip = -1;
		 Scanner numberScan = new Scanner(System.in);
		 do
		 {
			 tip = -1;
			 System.out.println("\nHere is your final order:");
			 viewOrder(theCustomer);
			 
			 do
			 {
				System.out.println("How much would you like to tip your server? (The tip will be input as a whole number ex: 20% tip will be input as 20 into the system)");	 
				
				 try
					{
					 tip = numberScan.nextDouble();
						
					}
					catch(InputMismatchException e)
					{
				
					}
				 if(tip<0)
				 {
					 System.out.println("Please input a valid tip value");
				 }
			 }while(tip<0);
			 
			 System.out.println(theCustomer.checkout(tip));
		 }while(tip<0);
	 }

}
