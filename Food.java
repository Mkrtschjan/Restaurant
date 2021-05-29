/**
 *  This program is designed to hold a database of food items
 *  
 *  @authors Abhishek Bhuvanendran, Michael Doherty,Victoria Maia, Taline Mkrtschjan,
 *  Victor Valenzuela
 *  
 *  Due April 25, 2021
 *
 */
public class Food implements Comparable<Food>
{
	
private String name = " ";
private String type = " ";
private double price = 0;
private boolean special = false;

	public Food(String n, String t, double p) 
	{
		name = n;
		type = t;
		price = p;
	
	}
	//COMPLETE
	/**
	 *  returns the type of food
	 * @return the item's food type
	 */
	public String getType()
	{
		return type;
	}
	//COMPLETE
	/**
	 * returns the price of the Food
	 * @return the price of the Food
	 */
	public double getPrice()
	{
		if(isSpecial())
		{
			return price * .5;
		}
		return price;
	}
	//COMPLETE
	/**
	 * Gets the name of the Food
	 * @return the Food's name
	 */
	public String getName()
	{
		return name;
	}
	//COMPLETE
	/**
	 * Sets the price of the food
	 * 
	 * @param p the new price for the Food
	 */
	public void setPrice(double p)
	{
		price = p;
	}
	//COMPLETE
	/**
	 * changes the state of the Food as a special
	 * @param s the boolean for changing the state as a Food (true = special, false = not special)
	 */
	public void setSpecial(boolean s)
	{
		special = s;
	}
	//COMPLETE
	/**
	 * Checks if the the food is a special or not
	 * @return a boolean indicating the state of the food as a special
	 */
	public boolean isSpecial()
	{
		
		return special;
	}
	//COMPLETE
	/**
	 * The Food class's compareTo method
	 * First compares the Food objects by Food Type, then by their name
	 * @param a the Food object to compare with
	 */
	public int compareTo(Food a)
	{
		int returnValue = 0;
		Food comparedFood =a;

		
		if(this.getType().compareToIgnoreCase(comparedFood.getType())>0)
		{
			returnValue = 1;
		}
		else if(this.getType().compareToIgnoreCase(comparedFood.getType())<0)
		{
			returnValue = -1;
		}
			
		if(this.getType().compareToIgnoreCase(comparedFood.getType())==0)
		{
			if(this.getName().compareToIgnoreCase(comparedFood.getName())>0)
			{
				returnValue = 1;
			}
			else if(this.getName().compareToIgnoreCase(comparedFood.getName())<0)
			{
				returnValue = -1;
			}
			else if(this.getName().compareToIgnoreCase(comparedFood.getName())==0)
			{
				if (this.getPrice() == comparedFood.getPrice()) {
					returnValue = 0;
				}
				else if (this.getPrice() < comparedFood.getPrice()) {
					returnValue = -1;
				}
				else if (this.getPrice() > comparedFood.getPrice()){
					returnValue = 1;
				}
			}
			
		}
		return returnValue;
	}
	/**
	 * Creates a string representation of the object
	 */
	public String toString()
	{
		String output = " ";
		String specialModifier = "  ";
		if(this.isSpecial())
		{
			specialModifier = " *";
		}
			
		output = String.format("%-9s%-5s%-19s%s%.2f",getType(), specialModifier, this.getName(),"$ ", this.getPrice());
		//code to be done here
		
		
		return output;
	}

}
