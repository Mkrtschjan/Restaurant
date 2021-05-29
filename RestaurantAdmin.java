
import javax.swing.*;
import java.awt.*;

public class RestaurantAdmin extends JFrame 
{
	JPanel customerPanel = new JPanel(new GridBagLayout());
	JPanel managerPanel = new JPanel();
	
	
	JFrame customerFrame = new JFrame();
	JFrame managerFrame = new JFrame();
	
	JTabbedPane tabbedPanel = new JTabbedPane();
	
	public RestaurantAdmin()
	{
	

		
		tabbedPanel.add("Customer",customerPanel);
		tabbedPanel.add("Manager",managerPanel);
		
		add(tabbedPanel);
		

		
	}
	
	public static void main(String args[])
	{
		RestaurantAdmin ra = new RestaurantAdmin();
		ra.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ra.setSize(600,800);
		ra.setVisible(true);
		
	}
}
