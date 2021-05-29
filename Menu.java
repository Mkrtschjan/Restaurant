
import java.util.ArrayList;




public class Menu 
{
	//this will store the list of food items on the menu.
	static ArrayList<Food> foodItems = new ArrayList<Food>();
	
	public Menu()
	{
		
	}
	//COMPLETE
	/**
	 * This method will add a food item to the menu
	 *  @param n the name of the item to add
	 */
	public void addItem(Food aFood)
	{
		
	foodItems.add(aFood);
	if(foodItems.size()>1)
	sort();
	}
	//COMPLETE
	/**
	 * removes an item from the menu
	 * @param n the name of the item to remove
	 */
	public void removeItem(String n)
	{
		String name = n;
		int index = 0;
		
		index = findIndex(name);
		
		if(index == -1)
			return;
		
		foodItems.remove(index);
		
	
	}
	//COMPLETE
	/**
	 * 
	 * @param n the name of the food to find in the menu
	 * @return the Food item on the menu, or null if there is no matching Food
	 */
	public Food findItem(String n)
	{
		String name = n;
		int index = 0;
		Food aFood;
		
		index = findIndex(name);
		
		if(index ==-1)
		{
			//ideally I'd want for this output to show up in the RestaurantAdmin class after validating the return
			//value, but we can worry about this later.
			return null;
		}
		
		aFood = foodItems.get(index);
		
		return aFood;
	}
	//COMPLETE
	/**
	 * searches the menu for the index of the Food
	 * @param n the name of the Food to search for
	 * @return the index of the food if found, and -1 if it is not found
	 */
	private int findIndex(String n)
	{
		String name = n;
		int index = 0;
		
		for(int x = 0; x<foodItems.size();x++)
		{
			if(foodItems.get(x).getName().equals(name))
			{
				return x;
			}
		}
		//if the item name is found in the index
		//then index = location of the name
		//else
		//index = -1;
		return -1;
	}
	//COMPLETE
	/**
	 * Sorts the Menu in a lexiconical form by Food type, and then by the name of the Food
	 */
	public void sort()
	{
		Food minFood;
		int minIndex =0;
		for(int x = 0; x+1<foodItems.size(); x++)
		{
			minFood = foodItems.get(x);
			minIndex = x;
			for(int y = x+1; y<foodItems.size();y++)
			{
				if(foodItems.get(x).compareTo(foodItems.get(y))>0)
				{
					minIndex = y;
				}
				Food tempFood = foodItems.get(minIndex);
				foodItems.set(minIndex,foodItems.get(x));
				foodItems.set(x,tempFood);
				
			}
			
		}
	
	}
	//COMPLETE
	/**
	 * returns the menu in a string form
	 * @return the menu in string form
	 */
	public static String getMenu()
	{
		
		String currentMenu = " ";
		if(foodItems.size() == 0)
		{
			return "This menu is empty";
		}
		for(int x=0; x<foodItems.size();x++)
		{
			
			currentMenu+=foodItems.get(x).toString()+"\n";
		}
		
		return currentMenu;
		
	}
	
}
