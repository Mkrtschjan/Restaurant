import java.util.ArrayList;

public class Billing {
	//the array that stores every submitted order
	static ArrayList<Order> orderList = new ArrayList<Order>();
	//COMPLETE
	/**
	 * Adds the order to the library of submitted orders
	 * @param a the order to store
	 */
	public void addOrder (Order a)
	{
		orderList.add(a);
	}
	//COMPLETE
	/**
	 * creates the order number for each new order
	 * @return a unique order number
	 */
	public static int createOrderNumber()
	{
		int orderNumber = 0;
		orderNumber = orderList.size()+1;
		return orderNumber;
	}
	//COMPLETE
	/**
	 * returns a the index of a specific order from the list of orders
	 * @param o the order number of the order to find
	 * @return the index of the order associated with the number or -1 if it does not exist
	 */
	private static int getOrder(int o)
	{
		int orderNumber = o;
		for(int x = 0; x< orderList.size(); x++)
		{
			if(orderNumber == orderList.get(x).getOrderNumber())
			{
				return x;
			}
			
		}
		return -1;	
	}
	//COMPLETE
	/**
	 * finds a specific order in the list of orders
	 * @param o the order number
	 * @return the order associate with the number, or null if there is no associated order
	 */
	public static Order findOrder(int o)
	{
		int orderLocation = getOrder(o);
		
		if(orderLocation>=0)
		{
			return orderList.get(orderLocation);
		}
		return null;	
		
	}
	//COMPLETE
	/**
	 * Computes the total value of the order before tip and tax
	 * @param a the order to compute the value of
	 * @return the total value of the order
	 */
	public double totalOrder(Order a)
	{
		Order aOrder = a;
		double totalCost = 0;
		//grabs the list of food items associated with the order
		ArrayList<Food> userOrder = aOrder.getOrder();
		
		//goes through each food in the order and adds the price to total cost
		for(int x = 0; x< userOrder.size();x++)
		{
			totalCost += userOrder.get(x).getPrice();
		}
		
		return totalCost;
	}
	//COMPLETE
	/**
	 * calculates the tip of the meal
	 * 
	 * @param p the tip percentage as an integer
	 * @param u the order to apply the tip percentage to
	 * @return the calculated tip
	 */
	public double calculateTip(double p, Order u)
	{
		double percent = p;
		Order userOrder = u;
		
		double tip = 0;
		tip = totalOrder(userOrder)*(percent/100);
				
		return tip;
	}
	//COMPLETE
	/**
	 * Outputs a console representation of the bill
	 * @param u the user's order
	 * @param t the tip percentage for the meal
	 */
	public void displayBill(Order u,double t)
	{
		Order userOrder = u;
		double subtotal = totalOrder(userOrder);
		double tip = calculateTip(t,userOrder);
		System.out.println(userOrder.displayOrder());
		System.out.println("Subtotal: "+subtotal);
		System.out.println("TIP: " + tip);
		double tax = subtotal*.07;
		System.out.println("TAX: "+String.format("%.2f", tax));
		System.out.println("Total Cost: "+String.format("%.2f", subtotal+tip+tax));
	
	}
	
	
}
