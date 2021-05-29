

public class Manager {
	private Menu theMenu;
	public Manager(Menu m)
	{
		theMenu = m;
	}
	// COMPLETE
	/**
	 *
	 * View the order of a customer
	 * 
	 * @param o		The order number of a specific customer
	 */
	public String viewOrder(int o)
	{
		int orderNumber = o;
		
		Order searchedOrder = Billing.findOrder(o);
		return searchedOrder.displayOrder();
		
	}
	//COMPLETE
	/**
	 * 	
	 * Add an item to the menu, but also check for duplicates
	 *
	 * @param aFood			The item that the manager wishes to add to the menu.
	 */
	public void addMenuItem(Food aFood)
	{
		
		
		if(theMenu.findItem(aFood.getName())==null)
		{
			theMenu.addItem(aFood);
		}
		else
			System.out.println("This item already exists in the menu.");
			
	}
	//COMPLETE
	/**
	 * 		
	 * Remove an item from the menu, but first checks that the item exists
	 * 
	 * @param aFood			The item the manager wishes to remove from the menu
	 */
	public void removeMenuItem(Food aFood)
	{
		Menu testMenu = new Menu();
		
		if(testMenu.findItem(aFood.getName())!=null)
		{
			testMenu.removeItem(aFood.getName());
			System.out.println(aFood.getName()+ " was removed\n");
		}
		else
			System.out.println("This item does not exist on the menu.");
		
	}
	//COMPLETE
	/**
	 * 			
	 * 		Adjusts the price of a food
	 * @param aFood		The food that the manager wishes to adjust
	 * @param p			The price that the manager wishes the food to be
	 */
	public void changePrice(Food aFood, double p)
	{
		Food adjustedFood = aFood;
		
		adjustedFood.setPrice(p);
	}
	//COMPLETE
	/**
	 * 
	 * 			Adjusts the specials on the menu
	 * @param a		the food to adjust
	 * @param s		the state of that food as a special
	 */
	public void adjustSpecial(Food a, boolean s)
	{
		Food aFood = a;
		boolean isSpecial = s;
		aFood.setSpecial(s);
		
	}
	
}
