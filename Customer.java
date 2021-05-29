public class Customer 
{
	Order customerOrder;
	Menu theMenu = new Menu();
	public int orderNumber;
	private String name = "";
	public Customer(String n)
	{
		name = n;
		orderNumber = Billing.createOrderNumber();	
		customerOrder = new Order(orderNumber);
	}
	//COMPLETE
	/**
	 * selects items from the menu and places them into the order
	 * @param n the name of the menu item
	 * @param q the quantity of the desired item
	 */
	public void placeOrder(String n, int q)
	{
		String foodName = n;
		int quantity = q;
		
		Food aFood = theMenu.findItem(foodName);
		
		if(aFood == null)
		{
			System.out.println("This item does not exist on the menu.");
		}
		else
		{
			for(int x = 0; x<quantity; x++)
			customerOrder.addItem(aFood);
		}
		
		
	}
	//COMPLETE
	/**
	 * returns the customer's name
	 * 
	 * @return the customer's name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * removes an item from the user's order
	 * 
	 * @param n the name of the food that should be removed from the order
	 */
	public void reduceOrder(String n)
	{
		String removedFood = n;
		customerOrder.removeItem(removedFood);
	}
	//COMPLETE
	/**
	 * 
	 * puts the customer's order into the list of finalized orders
	 * 
	 */
	public void submitFullOrder()
	{
		Billing myBill = new Billing();
		myBill.addOrder(customerOrder);
	}
	/**
	 * prints the bill for the user
	 * @param tip the tip percentage to use (in integer form)
	 */
	public void checkout(double tip)
	{
		Billing myBill = new Billing();
		System.out.println("Your Order: ");
		myBill.displayBill(customerOrder,tip);
		
	}
	//COMPLETE
	/**
	 * allows the customer to see their order
	 * @return a string representation of the order
	 */
	public String seeOrder()
	{
		return customerOrder.displayOrder();
	}
	
}
