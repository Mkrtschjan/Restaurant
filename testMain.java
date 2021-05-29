

public class testMain 
{
	public static void main(String args[])
	{
		Menu myMenu = new Menu();
		
		Entree aEntree = new Entree("Lobster", 60);
		Drink aDrink = new Drink("Coke", 5);
		Appetizer aAppetizer = new Appetizer("Fries", 9);
		Dessert aDessert = new Dessert("Chocolate",12);
		
		myMenu.addItem(aDessert);
		myMenu.addItem(aDrink);
		myMenu.addItem(aEntree);
		myMenu.addItem(aAppetizer);
		
		
		String theMenu = myMenu.getMenu();
		System.out.println(theMenu);
		
		System.out.println("**********************************************");
		//Tests manager abilities
		
		Manager aManager = new Manager(myMenu);
		
		Entree bEntree = new Entree("Crab",30);
		
		System.out.println("Removing Coke...");
		aManager.removeMenuItem(aDrink);
		
		theMenu = myMenu.getMenu();
		System.out.println(theMenu);
		
		System.out.println("Removing Crab...");
		aManager.removeMenuItem(bEntree);
		
		//testing the adding features of manager
		System.out.println("\nAdding Crab...");
		aManager.addMenuItem(bEntree);
		
		theMenu = myMenu.getMenu();
		System.out.println(theMenu);
		
		
		System.out.println("\nAdding Crab...");
		aManager.addMenuItem(bEntree);
		
		theMenu = myMenu.getMenu();
		System.out.println(theMenu);
		
		//TESTING CUSTOMER/ORDER
		System.out.println("CUSTOMER CLASS WORKING MECHANICS");
		Customer aCustomer = new Customer("Bill");
		System.out.println("Ordering Water....");
		aCustomer.placeOrder("Water", 2);
		
		System.out.println("\nOrdering 3 Crabs....");
		aCustomer.placeOrder("Crab", 3);
		System.out.println("Ordering 5 Lobsters....");
		aCustomer.placeOrder("Lobster", 5);
		System.out.println("Ordering 2 Crabs....");
		aCustomer.placeOrder("Crab", 2);
		aCustomer.submitFullOrder();
		
		
		
		System.out.println(aManager.viewOrder(1));
		
		//testing changing prices
		Food changedFood;
		changedFood = myMenu.findItem("Crab");
		aManager.changePrice(changedFood, 40);
		System.out.println("\nADJUSTING THE PRICE OF CRAB TO 40 DOLLARS");
		System.out.println("\nNEW ORDER PRICE");
		System.out.println(aManager.viewOrder(1));
		System.out.println("\nADJUSTING CRAB TO A SPECIAL");
		changedFood.setSpecial(true);
		System.out.println(aManager.viewOrder(1));
		System.out.println("Is Crab a special? Answer: "+changedFood.isSpecial()+"\n\n");
		
		System.out.println(aCustomer.getName() + ", we are now processing your order!\nYour Order:");
		System.out.println(aCustomer.seeOrder());
		
		
		System.out.println("\nORDER COMPLETE");
		System.out.println("PRINTING YOUR BILL WITH 20% TIP\n");
		aCustomer.checkout(20);
		

	}

}
