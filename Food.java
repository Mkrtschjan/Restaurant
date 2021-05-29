
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
		if(this.getType().compareTo(comparedFood.getType())>0)
		{
			returnValue = 1;
		}
		else if(this.getType().compareTo(comparedFood.getType())<0)
		{
			returnValue = -1;
		}
			
		if(this.getType().compareTo(comparedFood.getType())==0)
		{
			if(this.getName().compareTo(comparedFood.getName())>0)
			{
				returnValue = 1;
			}
			else if(this.getName().compareTo(comparedFood.getName())<0)
			{
				returnValue = -1;
			}
			else if(this.getName().compareTo(comparedFood.getName())==0)
			{
				returnValue = 0;
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
			
		output = this.getType() + specialModifier + this.getName() + " " + this.getPrice();
		//code to be done here
		
		
		return output;
	}
	
	
	
	
	

}
