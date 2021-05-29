/**
 *  This program is designed to create restaurant orders
 *  
 *  @author Abhishek Bhuvanendran, Michael Doherty,Victoria Maia, Taline Mkrtschjan,
 *  Victor Valenzuela
 *  
 *  Due April 25, 2021
 *
 */
import java.util.ArrayList;

public class Order 
{
	//will hold a list of all current orders
	
	Menu theMenu = new Menu();
	//stores order number
	private int orderNumber = 0;
	//will store the order
	ArrayList<Food> foodOrder = new ArrayList<Food>();
	//COMPLETE
	public Order(int o)
	{
		orderNumber = o;
	}
	//COMPLETE
	/**
	 * Adds an item to the order
	 * @param a the food to add to the order
	 */
	public void addItem(Food a)
	{
		Food aFood = a;
		foodOrder.add(aFood);
	}
	//COMPLETE
	/**
	 * removes an item from the order
	 * @param n the name of the item to remove from the order
	 */
	public void removeItem(String n)
	{
		String name = n;
		int index = 0;
		
		index = findIndex(name);
		
		if(index == -1)
		{
			System.out.println("That does not exist in your order.");
			return;
		}			
		
		foodOrder.remove(index);		
	
	}
	//COMPLETE
	/**
	 * searches the order for an item, and returns -1 if the item is missing from the order
	 * @param n the name of the food that you wish to find in the order
	 * @return the index of the food you wish to find in the order.
	 */
	private int findIndex(String n)
	{
		String name = n;
		int index = 0;
		
		for(int x = 0; x<foodOrder.size();x++)
		{
			if(foodOrder.get(x).getName().equalsIgnoreCase(name))
			{
				return x;
			}
		}
		//if the item name is found in the array
		//then index = location of the name
		//else
		//index = -1;
		return -1;
	}
	//COMPLETE
	/**
	 *  returns the order number.
	 * @return the number of the order
	 */
	public int getOrderNumber()
	{
		return orderNumber;
	}
	//COMPLETE
	/**
	 * creates a string representation of the order
	 * @return a string representation of the order
	 */
	public String displayOrder()
	{
		Food aFood;
		String theOrder = "";
		boolean unique = true;
		int quantity = 1;
		theOrder = "Order Number: "+ getOrderNumber()+"\n";
		for(int x=0; x<foodOrder.size();x++)
		{
			unique = true;
			for(int y = x+1; y<foodOrder.size(); y++) 
			{
				aFood = foodOrder.get(x);
				if(aFood.compareTo(foodOrder.get(y))==0)
					quantity++;
			}
			if(x>0)
				for(int z =0; z<x;z++)
				{
					if(foodOrder.get(z).compareTo(foodOrder.get(x))==0)
						unique = false;
				}
			if(unique)
			theOrder+= quantity + "x " + foodOrder.get(x)+ "\n";
			quantity = 1;
			
		}
		
		return theOrder;
	}
	//COMPLETE
	/**
	 * returns 
	 * @return the array list representation of the order
	 */
	public ArrayList<Food> getOrder()
	{
		return foodOrder;
	}

	//I'm not sure that calculating change is worth the effort for this
	//project, so I left that method off, but if you're passionate about
	//implementing it, you're more than welcome to.

}
