import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.ComponentOrientation;
import javax.swing.JTextArea;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

/**
 *  This program is designed to display a restaurant GUI to be used by a customer
 *  or a manager
 *  
 *  @author Abhishek Bhuvanendran, Michael Doherty,Victoria Maia, Taline Mkrtschjan,
 *  Victor Valenzuela
 *  
 *  Due April 25, 2021
 *
 */

@SuppressWarnings("serial")
public class RestaurantGUI extends JFrame {

	private JPanel contentPane;
	private JPanel customerTab;
	private JPanel menuPanelManager;
	private JPanel menuPanelCustomer;

	private JTabbedPane tabbedPane;
	
	private JTextField customerName;
	private JTextField currentDate;
	private JTextField menuItem1;
	private JTextField menuItem2;
	private JTextField menuItem3;
	private JTextField menuItem4;
	private JTextField menuItem5;
	private JTextField menuItem6;
	private JTextField menuItem7;
	private JTextField menuItem8;
	private JTextField menuItem9;
	private JTextField menuItem10;
	private JTextField menuItem11;
	private JTextField menuItem12;

	private JTextField item1Type;
	private JTextField item2Type;
	private JTextField item3Type;
	private JTextField item4Type;
	private JTextField item5Type;
	private JTextField item6Type;
	private JTextField item7Type;
	private JTextField item8Type;
	private JTextField item9Type;
	private JTextField item10Type;
	private JTextField item11Type;	
	private JTextField item12Type;
	
	private JTextField item1Price;	
	private JTextField item2Price;
	private JTextField item3Price;
	private JTextField item4Price;
	private JTextField item5Price;
	private JTextField item6Price;
	private JTextField item7Price;
	private JTextField item8Price;
	private JTextField item9Price;
	private JTextField item10Price;
	private JTextField item11Price;
	private JTextField item12Price;

	private JTextField item1Qty;
	private JTextField item2Qty;
	private JTextField item3Qty;
	private JTextField item4Qty;
	private JTextField item5Qty;
	private JTextField item6Qty;
	private JTextField item7Qty;
	private JTextField item8Qty;
	private JTextField item9Qty;
	private JTextField item10Qty;
	private JTextField item11Qty;
	private JTextField item12Qty;
	
	private JLabel lblMenuCustomer;
	private JLabel lblInvoice;	
	private JLabel lblDate;
	private JLabel lblSubtotal;
	private JLabel lblTax;	
	private JLabel lblTip;
	private JLabel lblTotal;
	private JLabel lblCustomerName;	
	private JLabel lblMenuItems;	
	private JLabel lblType;	
	private JLabel lblPrice;	
	private JLabel lblQuantity;
	private JLabel lblAddRemove;
	private JLabel lblCurrentMenu;
	private JLabel lblUpdatedMenu;
	private JLabel lblMenuItemsManager;
	private JLabel lblTypeManager;
	private JLabel lblCurrentPrice;
	private JLabel lblAddRemoveManager;
	
	private JTextField menuItem1Manager;
	private JTextField menuItem2Manager;
	private JTextField menuItem3Manager;
	private JTextField menuItem4Manager;
	private JTextField menuItem5Manager;
	private JTextField menuItem6Manager;
	private JTextField menuItem7Manager;
	private JTextField menuItem8Manager;
	private JTextField menuItem9Manager;
	private JTextField menuItem10Manager;
	private JTextField menuItem11Manager;
	private JTextField menuItem12Manager;
	
	private JTextField item1TypeManager;
	private JTextField item2TypeManager;
	private JTextField item3TypeManager;
	private JTextField item4TypeManager;
	private JTextField item5TypeManager;
	private JTextField item6TypeManager;
	private JTextField item7TypeManager;
	private JTextField item8TypeManager;
	private JTextField item9TypeManager;
	private JTextField item10TypeManager;
	private JTextField item11TypeManager;
	private JTextField item12TypeManager;
	
	private JTextField item1CurrentPrice;
	private JTextField item2CurrentPrice;
	private JTextField item3CurrentPrice;
	private JTextField item4CurrentPrice;
	private JTextField item5CurrentPrice;	
	private JTextField item6CurrentPrice;	
	private JTextField item7CurrentPrice;	
	private JTextField item8CurrentPrice;	
	private JTextField item9CurrentPrice;	
	private JTextField item10CurrentPrice;	
	private JTextField item11CurrentPrice;
	private JTextField item12CurrentPrice;
	
	private JTextField item1NewPrice;
	private JTextField item2NewPrice;
	private JTextField item3NewPrice;
	private JTextField item4NewPrice;
	private JTextField item5NewPrice;
	private JTextField item6NewPrice;
	private JTextField item7NewPrice;
	private JTextField item8NewPrice;
	private JTextField item9NewPrice;
	private JTextField item10NewPrice;
	private JTextField item11NewPrice;
	private JTextField item12NewPrice;
	
	private JButton item1Add;
	private JButton item2Add;
	private JButton item3Add;
	private JButton item4Add;
	private JButton item5Add;
	private JButton item6Add;
	private JButton item7Add;
	private JButton item8Add;
	private JButton item9Add;
	private JButton item10Add;
	private JButton item11Add;
	private JButton item12Add;
	
	private JButton item1Remove;
	private JButton item2Remove;
	private JButton item3Remove;
	private JButton item4Remove;
	private JButton item5Remove;
	private JButton item6Remove;
	private JButton item7Remove;
	private JButton item8Remove;
	private JButton item9Remove;
	private JButton item10Remove;
	private JButton item11Remove;
	private JButton item12Remove;
	
	private JButton btnPay;
	
	private JButton item1Update;
	private JButton item2Update;
	private JButton item3Update;
	private JButton item4Update;
	private JButton item5Update;
	private JButton item6Update;
	private JButton item7Update;
	private JButton item8Update;
	private JButton item9Update;
	private JButton item10Update;
	private JButton item11Update;
	private JButton item12Update;
	
	private JButton item1AddManager;
	private JButton item2AddManager;
	private JButton item3AddManager;
	private JButton item4AddManager;
	private JButton item5AddManager;
	private JButton item6AddManager;
	private JButton item7AddManager;
	private JButton item8AddManager;
	private JButton item9AddManager;
	private JButton item10AddManager;
	private JButton item11AddManager;
	private JButton item12AddManager;	
	
	private JButton item1RemoveManager;
	private JButton item3RemoveManager;
	private JButton item2RemoveManager;
	private JButton item4RemoveManager;
	private JButton item5RemoveManager;
	private JButton item6RemoveManager;
	private JButton item7RemoveManager;
	private JButton item8RemoveManager;
	private JButton item9RemoveManager;
	private JButton item10RemoveManager;
	private JButton item11RemoveManager;
	private JButton item12RemoveManager;
	
	private JLabel lblNewPrice;
	private JLabel lblUpdate;
	private JLabel lblPriceManager;
	
	private JSeparator separatorMenu;
	private JSeparator separatorPrice;
	private JSeparator separatorMenuBill;
	private JSeparator separatorMenuCustomer;	
	private JScrollPane scrollPane;
	
	private JTextArea textAreaBill;
	private JTextArea textAreaManager;
	
	private JTextField textTax;
	private JTextField textTip;
	private JTextField textTotal;
	private JTextField textSubtotal;
	private JTextField textPayMessage;
	
	private JButton btnTip0;
	private JButton btnTip15;
	private JButton btnTip18;
	private JButton btnTip20;
	
	private static double totalBill = 0;
	private static double taxBill = 0;
	private static double tip = 0;
	private static double subtotal = 0;
	
	private int count1 = 0;        			//keeps track of item1 orders
	private double subtotal1Track = 0;		//keeps track of item1 subtotal
	private double tax1Track = 0;			//keeps track of item1 tax
	
	private int count2 = 0;
	private double subtotal2Track = 0;
	private double tax2Track = 0;
	
	private int count3 = 0;
	private double subtotal3Track = 0;
	private double tax3Track = 0;
	
	private int count4 = 0;
	private double subtotal4Track = 0;
	private double tax4Track = 0;
	
	private int count5 = 0;
	private double subtotal5Track = 0;
	private double tax5Track = 0;
	
	private int count6 = 0;
	private double subtotal6Track = 0;
	private double tax6Track = 0;
	
	private int count7 = 0;
	private double subtotal7Track = 0;
	private double tax7Track = 0;
	
	private int count8 = 0;
	private double subtotal8Track = 0;
	private double tax8Track = 0;
	
	private int count9 = 0;
	private double subtotal9Track = 0;
	private double tax9Track = 0;
	
	private int count10 = 0;
	private double subtotal10Track = 0;
	private double tax10Track = 0;
	
	private int count11 = 0;
	private double subtotal11Track = 0;
	private double tax11Track = 0;
	
	private int count12 = 0;
	private double subtotal12Track = 0;
	private double tax12Track = 0;
	

	private Food food0, food1, food2, food3, food4, food5, food6, food7, food8, 
	 			 food9, food10, food11, food12;
	
	private double itemPrice1, itemPrice2, itemPrice3, itemPrice4, itemPrice5, 
				   itemPrice6, itemPrice7, itemPrice8, itemPrice9, itemPrice10,
				   itemPrice11, itemPrice12;
	
	private Customer newCustomer;

	private final int DELAY = 100;
	private final static String newLine = "\n";
	
	private Menu currentMenu = new Menu();
	
	private Manager thisManager = new Manager();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RestaurantGUI frame = new RestaurantGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RestaurantGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1275, 690);
		contentPane = new JPanel();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.DEFAULT_SIZE, 1259, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(tabbedPane, GroupLayout.PREFERRED_SIZE, 675, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(7, Short.MAX_VALUE))
		);
		
		customerTab = new JPanel();
		customerTab.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tabbedPane.addTab("Customer", null, customerTab, null);
		tabbedPane.setForegroundAt(0, new Color(128, 0, 0));
		tabbedPane.setBackgroundAt(0, new Color(165, 42, 42));
		tabbedPane.setEnabledAt(0, true);
		
		lblCustomerName = new JLabel("Customer Name");
		lblCustomerName.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		customerName = new JTextField();
		customerName.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		customerName.setColumns(10);
		
		newCustomer = new Customer(customerName.getText());
		
		lblMenuCustomer = new JLabel("Menu");
		lblMenuCustomer.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		menuPanelCustomer = new JPanel();
		menuPanelCustomer.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);		
		
		separatorMenuBill = new JSeparator();
		separatorMenuBill.setOrientation(SwingConstants.VERTICAL);
		
		JPanel panel = new JPanel();
		panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		GroupLayout gl_customerTab = new GroupLayout(customerTab);
		gl_customerTab.setHorizontalGroup(
			gl_customerTab.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_customerTab.createSequentialGroup()
					.addGroup(gl_customerTab.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_customerTab.createSequentialGroup()
							.addGap(23)
							.addGroup(gl_customerTab.createParallelGroup(Alignment.LEADING)
								.addComponent(lblMenuCustomer)
								.addGroup(gl_customerTab.createSequentialGroup()
									.addComponent(lblCustomerName, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
									.addGap(54)
									.addComponent(customerName, 219, 219, 219))))
						.addGroup(gl_customerTab.createSequentialGroup()
							.addGap(14)
							.addComponent(menuPanelCustomer, GroupLayout.PREFERRED_SIZE, 611, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addComponent(separatorMenuBill, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(21))
		);
		gl_customerTab.setVerticalGroup(
			gl_customerTab.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_customerTab.createSequentialGroup()
					.addGroup(gl_customerTab.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_customerTab.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_customerTab.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCustomerName)
								.addComponent(customerName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblMenuCustomer)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(menuPanelCustomer, GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE))
						.addGroup(gl_customerTab.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_customerTab.createParallelGroup(Alignment.LEADING)
								.addComponent(separatorMenuBill, GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE))))
					.addGap(29))
		);
		currentDate = new JFormattedTextField();
		currentDate.setEditable(false);
	    ActionListener listener = new ActionListener(){
	            public void actionPerformed(ActionEvent event){
	               Date now = new Date();
	               currentDate.setText(now.toString());
	            }
	     };
	    Timer t = new Timer(DELAY, listener);
	    t.start();
		
		lblDate = new JLabel("Date");
		
		lblInvoice = new JLabel("Invoice");
		lblInvoice.setDisplayedMnemonic(KeyEvent.VK_ENTER);
		lblInvoice.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		
		textTax = new JTextField();
		textTax.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textTax.setEditable(false);
		textTax.setColumns(10);
		
		textTip = new JTextField();
		textTip.setEditable(false);
		textTip.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textTip.setColumns(10);
		textTip.setText("$ 0");
		
		textTotal = new JTextField();
		textTotal.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textTotal.setEditable(false);
		textTotal.setColumns(10);
		
		lblTotal = new JLabel("Total");	
		lblTip = new JLabel("Tip");		
		lblTax = new JLabel("Tax");
		
		scrollPane = new JScrollPane();
		
		lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		textSubtotal = new JTextField();
		textSubtotal.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textSubtotal.setColumns(10);
		
		btnTip0 = new JButton("0%");
		btnTip0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	tip = 0;
	        	tip = totalBill * 0;
				textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
				textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill+tip)));				
			}
		});
		
		btnTip15 = new JButton("15%");
		btnTip15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tip = 0;
				tip = totalBill * 0.15;

				textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
				textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill+tip)));
			}
		});
		btnTip15.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		btnTip18 = new JButton("18%");
		btnTip18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tip = 0;
				tip = totalBill * 0.18;

				textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
				textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill+tip)));
			
			}
		});			
			
		btnTip20 = new JButton("20%");
		btnTip20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	        	tip = 0;
	        	tip = totalBill * 0.2;

				textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
				textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill+tip)));        	
			}
		});
		btnTip20.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		textPayMessage = new JTextField();
		textPayMessage.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textPayMessage.setEditable(false);
		textPayMessage.setColumns(10);
		
		btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				subtotal= 0;
				taxBill = 0;
				tip = 0;
				textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
				
				totalBill= taxBill + subtotal + tip;
				textSubtotal.setText("$ " + Double.toString(subtotal));
				textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
				textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
				textPayMessage.setText("Thank you " + customerName.getText() + " for being being a loyal customer");
				textAreaBill.setText(textAreaBill.getText().replace(textAreaBill.getText(),
									(" Ordered\t             Item Quantity\t   Item Price\t         Item Total" + newLine +
									"---------------------------------------------------------------" + newLine)));
			
				item1Qty.setText(null);
	
				item2Qty.setText(null);
			
				item3Qty.setText(null);
			
				item4Qty.setText(null);
				
				item5Qty.setText(null);
			
				item6Qty.setText(null);
			
				item7Qty.setText(null);
				
				item8Qty.setText(null);
		
				item9Qty.setText(null);
			
				item10Qty.setText(null);
		
				item11Qty.setText(null);
		
				item12Qty.setText(null);
	}
});
		
		btnPay.setForeground(new Color(165, 42, 42));
		btnPay.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);	

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 510, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblSubtotal)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textSubtotal, 0, 0, Short.MAX_VALUE))
								.addComponent(lblDate)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(lblTotal)
										.addComponent(lblTip, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTax, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
									.addGap(33)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
											.addComponent(textTotal, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE)
											.addComponent(textTip, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))
										.addComponent(textTax, GroupLayout.PREFERRED_SIZE, 111, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(btnPay)
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(btnTip0, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnTip15)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnTip18, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnTip20, GroupLayout.PREFERRED_SIZE, 64, GroupLayout.PREFERRED_SIZE)))
									.addGap(19))
								.addComponent(textPayMessage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
								.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
									.addComponent(currentDate, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
									.addGap(17)))))
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(273, Short.MAX_VALUE)
					.addComponent(lblInvoice)
					.addGap(223))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblInvoice)
					.addGap(15)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDate)
						.addComponent(currentDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 316, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(textSubtotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSubtotal)
						.addComponent(textPayMessage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(35)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(textTip, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTip)
								.addComponent(btnTip0)
								.addComponent(btnTip15)
								.addComponent(btnTip18)
								.addComponent(btnTip20)))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTax)
							.addComponent(textTax, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblTotal)
							.addComponent(textTotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(btnPay))
					.addGap(33))
		);
		
		textAreaBill = new JTextArea(18,4);
		textAreaBill.setEditable(false);
		textAreaBill.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane.setViewportView(textAreaBill);
		panel.setLayout(gl_panel);
		
		lblMenuItems = new JLabel("Menu Items");		
		lblType = new JLabel("Type");		
		lblPrice = new JLabel("Price");		
		lblQuantity = new JLabel("Quantity");		
		lblAddRemove = new JLabel("Add / Remove Item");
		
		separatorMenuCustomer = new JSeparator();		
		
		food0 = new Food(" ", " ", 0);
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
		
		currentMenu.addItem(food0);
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
	
		textAreaBill.append(" Ordered\t             Item Quantity\t   Item Price\t         Item Total " + newLine);
		textAreaBill.append("--------------------------------------------------------------- " + newLine);
		
		menuItem1 = new JTextField();
		menuItem1.setDisabledTextColor(new Color(0, 0, 139));
		menuItem1.setForeground(new Color(0, 0, 139));
		menuItem1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem1.setEditable(false);
		menuItem1.setColumns(10);
		menuItem1.setText(Menu.foodItems.get(1).getName());
		
		item1Type = new JTextField();
		item1Type.setDisabledTextColor(new Color(0, 0, 139));
		item1Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1Type.setForeground(new Color(0, 0, 139));
		item1Type.setEditable(false);
		item1Type.setColumns(10);
		item1Type.setText(Menu.foodItems.get(1).getType());
		
		item1Price = new JTextField();
		item1Price.setDisabledTextColor(new Color(0, 0, 139));
		item1Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1Price.setForeground(new Color(0, 0, 139));
		item1Price.setEditable(false);
		item1Price.setColumns(10);
		item1Price.setText("$ " + Double.toString(Menu.foodItems.get(1).getPrice()));
		
		item1Qty = new JTextField();
		item1Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1Qty.setDisabledTextColor(new Color(0, 0, 139));
		item1Qty.setForeground(new Color(0, 0, 139));
		item1Qty.setColumns(10);
		
		item1Add = new JButton("Add");
		item1Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {			
					if (item1Qty.getText().length()> 0 && Integer.parseInt(item1Qty.getText()) > 0){
						
						try {
							itemPrice1 = (Menu.foodItems.get(1).getPrice()) * (Integer.parseInt(item1Qty.getText()));
							newCustomer.placeOrder(menuItem1.getText(), Integer.parseInt(item1Qty.getText()));
							
							textAreaBill.append(menuItem1.getText()+ " \t\t" + item1Qty.getText() 
							  				  + " \t      " + item1Price.getText() + "\t            $" 
							  				  + Double.toString(itemPrice1)+ newLine);
							count1++;
							subtotal+= itemPrice1;
							subtotal1Track += itemPrice1;
							
							taxBill += itemPrice1 * 0.07;
							tax1Track += itemPrice1 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty1) {
							customerPaneMessage();
						}
					}
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty1) {
					customerPaneMessage();
				}
			}
		});	
		

		
		item1Remove = new JButton("Remove");
		item1Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1Remove.setBackground(new Color(211, 211, 211));
		item1Remove.setForeground(new Color(165, 42, 42));
		item1Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem1.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));	
						 
						 try {						
							if (item1Qty.getText().length()> 0 && count1 > 0) {
								newCustomer.reduceOrder(menuItem1.getText());							
								
								subtotal-= subtotal1Track;	
								subtotal1Track = 0;
								taxBill -= tax1Track;
								tax1Track = 0;
								
								count1 = 0;
								
								tip = 0;
								
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
									
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item1Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty1) {
							customerPaneMessage();
						}
					}
					
				}
			}
		});	

		menuItem2 = new JTextField();
		menuItem2.setForeground(new Color(0, 0, 139));
		menuItem2.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem2.setDisabledTextColor(new Color(0, 0, 139));
		menuItem2.setSelectedTextColor(new Color(0, 0, 139));
		menuItem2.setEditable(false);
		menuItem2.setColumns(10);
		menuItem2.setText(Menu.foodItems.get(2).getName());
		
		item2Type = new JTextField();
		item2Type.setForeground(new Color(0, 0, 139));
		item2Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2Type.setDisabledTextColor(new Color(0, 0, 139));
		item2Type.setSelectedTextColor(new Color(0, 0, 139));
		item2Type.setEditable(false);
		item2Type.setColumns(10);
		item2Type.setText(Menu.foodItems.get(2).getType());
		
		item2Price = new JTextField();
		item2Price.setForeground(new Color(0, 0, 139));
		item2Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2Price.setDisabledTextColor(new Color(0, 0, 139));
		item2Price.setSelectedTextColor(new Color(0, 0, 139));
		item2Price.setEditable(false);
		item2Price.setColumns(10);
		item2Price.setText("$ " + Double.toString(Menu.foodItems.get(2).getPrice()));
		
		item2Qty = new JTextField();
		item2Qty.setForeground(new Color(0, 0, 139));
		item2Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2Qty.setDisabledTextColor(new Color(0, 0, 139));
		item2Qty.setSelectedTextColor(new Color(0, 0, 139));
		item2Qty.setColumns(10);
		
		item2Add = new JButton("Add");
		item2Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {			
					if (item2Qty.getText().length()> 0 && Integer.parseInt(item2Qty.getText()) > 0){
						
						try {
							itemPrice2 = (Menu.foodItems.get(2).getPrice()) * (Integer.parseInt(item2Qty.getText()));
							newCustomer.placeOrder(menuItem2.getText(), Integer.parseInt(item2Qty.getText()));
							
							textAreaBill.append(menuItem2.getText()+ " \t\t" + item2Qty.getText() 
							  				  + " \t      " + item2Price.getText() + "\t            $" 
							  				  + Double.toString(itemPrice2)+ newLine);
							count2++;
							subtotal+= itemPrice2;
							subtotal2Track += itemPrice2;
							
							taxBill += itemPrice2 * 0.07;
							tax2Track += itemPrice2 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty2) {
							customerPaneMessage();
						}
					}
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty2) {
					customerPaneMessage();
				}
			}
		});	
		
		item2Remove = new JButton("Remove");
		item2Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2Remove.setForeground(new Color(165, 42, 42));
		item2Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem2.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));	
						 
						 try {						
							if (item2Qty.getText().length()> 0 && count2 > 0) {
								newCustomer.reduceOrder(menuItem2.getText());							
								
								subtotal-= subtotal2Track;	
								subtotal2Track = 0;
								taxBill -= tax2Track;
								tax2Track = 0;
								
								count2 = 0;
								
								tip = 0;
								
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
									
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item2Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty2) {
							customerPaneMessage();
						}
					}	
				}
			}
		});	
		
		menuItem3 = new JTextField();
		menuItem3.setForeground(new Color(0, 0, 139));
		menuItem3.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem3.setDisabledTextColor(new Color(0, 0, 139));
		menuItem3.setSelectedTextColor(new Color(0, 0, 139));
		menuItem3.setEditable(false);
		menuItem3.setColumns(10);
		menuItem3.setText(Menu.foodItems.get(3).getName());
		
		item3Type = new JTextField();
		item3Type.setForeground(new Color(0, 0, 139));
		item3Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3Type.setDisabledTextColor(new Color(0, 0, 139));
		item3Type.setSelectedTextColor(new Color(0, 0, 139));
		item3Type.setEditable(false);
		item3Type.setColumns(10);
		item3Type.setText(Menu.foodItems.get(3).getType());
		
		item3Price = new JTextField();
		item3Price.setForeground(new Color(0, 0, 139));
		item3Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3Price.setDisabledTextColor(new Color(0, 0, 139));
		item3Price.setSelectedTextColor(new Color(0, 0, 139));
		item3Price.setEditable(false);
		item3Price.setColumns(10);
		item3Price.setText("$ " + Double.toString(Menu.foodItems.get(3).getPrice()));
		
		item3Qty = new JTextField();
		item3Qty.setForeground(new Color(0, 0, 139));
		item3Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3Qty.setDisabledTextColor(new Color(0, 0, 139));
		item3Qty.setSelectedTextColor(new Color(0, 0, 139));
		item3Qty.setColumns(10);
		
		item3Add = new JButton("Add");
		item3Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {	
					if (item3Qty.getText().length()> 0 && Integer.parseInt(item3Qty.getText()) > 0){
						try {
							itemPrice3 = (Menu.foodItems.get(3).getPrice()) * (Integer.parseInt(item3Qty.getText()));
							
							newCustomer.placeOrder(menuItem3.getText(), Integer.parseInt(item3Qty.getText()));
							
							textAreaBill.append(menuItem3.getText()+ " \t\t" + item3Qty.getText() 
							  + " \t      " + item3Price.getText() + "\t            $" 
							  + Double.toString(itemPrice3)+ newLine);
							
							count3++;
							subtotal+= itemPrice3;
							subtotal3Track += itemPrice3; 
							
							taxBill += itemPrice3 * 0.07;
							tax3Track += itemPrice3 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty3) {
							customerPaneMessage();
						}
					}
					
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty3) {
					customerPaneMessage();
				}
			}
		});
		
		item3Remove = new JButton("Remove");
		item3Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3Remove.setForeground(new Color(165, 42, 42));
		item3Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem3.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));	
						 
						 try {						
							if (item3Qty.getText().length()> 0 && count3 > 0) {
								newCustomer.reduceOrder(menuItem3.getText());							
								
								subtotal-= subtotal3Track;	
								subtotal3Track = 0;
								taxBill -= tax3Track;
								tax3Track = 0;
								
								count3 = 0;
								
								tip = 0;
								
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
									
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item3Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty3) {
							customerPaneMessage();
						}
					}	
				}
			}
		});		
		
		
		menuItem4 = new JTextField();
		menuItem4.setForeground(new Color(0, 0, 139));
		menuItem4.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem4.setDisabledTextColor(new Color(0, 0, 139));
		menuItem4.setSelectedTextColor(new Color(0, 0, 139));
		menuItem4.setEditable(false);
		menuItem4.setColumns(10);
		menuItem4.setText(Menu.foodItems.get(4).getName());
		
		item4Type = new JTextField();
		item4Type.setForeground(new Color(0, 0, 139));
		item4Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4Type.setDisabledTextColor(new Color(0, 0, 139));
		item4Type.setSelectedTextColor(new Color(0, 0, 139));
		item4Type.setEditable(false);
		item4Type.setColumns(10);
		item4Type.setText(Menu.foodItems.get(4).getType());
		
		item4Price = new JTextField();
		item4Price.setForeground(new Color(0, 0, 139));
		item4Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4Price.setDisabledTextColor(new Color(0, 0, 139));
		item4Price.setSelectedTextColor(new Color(0, 0, 139));
		item4Price.setEditable(false);
		item4Price.setColumns(10);
		item4Price.setText("$ " + Double.toString(Menu.foodItems.get(4).getPrice()));
		
		item4Qty = new JTextField();
		item4Qty.setForeground(new Color(0, 0, 139));
		item4Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4Qty.setDisabledTextColor(new Color(0, 0, 139));
		item4Qty.setSelectedTextColor(new Color(0, 0, 139));
		item4Qty.setColumns(10);
		
		item4Add = new JButton("Add");
		item4Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item4Qty.getText().length() > 0 && Integer.parseInt(item4Qty.getText()) > 0){
						try {
							itemPrice4 = (Menu.foodItems.get(4).getPrice()) * (Integer.parseInt(item4Qty.getText()));
							newCustomer.placeOrder(menuItem4.getText(), Integer.parseInt(item4Qty.getText()));
							
							textAreaBill.append(menuItem4.getText()+ " \t\t" + item4Qty.getText() 
							  + " \t      " + item4Price.getText() + "\t            $" 
							  + Double.toString(itemPrice4)+ newLine);
							
							count4++;
							subtotal+= itemPrice4;
							subtotal4Track += itemPrice4;
							
							taxBill += itemPrice4 * 0.07;
							tax4Track += itemPrice4 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty4) {
							customerPaneMessage();
						}
					} 
					
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty4) {
					customerPaneMessage();
				}
			}
		});
		
		item4Remove = new JButton("Remove");
		item4Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4Remove.setForeground(new Color(165, 42, 42));
		item4Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem4.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));
						 
						 try {						
							if (item4Qty.getText().length() > 0 && count4 > 0) {
								newCustomer.reduceOrder(menuItem4.getText());							
								
								subtotal-= subtotal4Track;	
								
								subtotal4Track = 0;
								
								taxBill -= tax4Track;
								tax4Track = 0;
								
								count4 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item4Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
							}
						catch (NumberFormatException qty4) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		
		menuItem5 = new JTextField();
		menuItem5.setForeground(new Color(0, 0, 139));
		menuItem5.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem5.setDisabledTextColor(new Color(0, 0, 139));
		menuItem5.setSelectedTextColor(new Color(0, 0, 139));
		menuItem5.setEditable(false);
		menuItem5.setColumns(10);
		menuItem5.setText(Menu.foodItems.get(5).getName());
		
		item5Type = new JTextField();
		item5Type.setForeground(new Color(0, 0, 139));
		item5Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5Type.setDisabledTextColor(new Color(0, 0, 139));
		item5Type.setSelectedTextColor(new Color(0, 0, 139));
		item5Type.setEditable(false);
		item5Type.setColumns(10);
		item5Type.setText(Menu.foodItems.get(5).getType());
		
		item5Price = new JTextField();
		item5Price.setForeground(new Color(0, 0, 139));
		item5Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5Price.setDisabledTextColor(new Color(0, 0, 139));
		item5Price.setSelectedTextColor(new Color(0, 0, 139));
		item5Price.setEditable(false);
		item5Price.setColumns(10);
		item5Price.setText("$ " + Double.toString(Menu.foodItems.get(5).getPrice()));
		
		item5Qty = new JTextField();
		item5Qty.setForeground(new Color(0, 0, 139));
		item5Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5Qty.setDisabledTextColor(new Color(0, 0, 139));
		item5Qty.setSelectedTextColor(new Color(0, 0, 139));
		item5Qty.setColumns(10);
		
		item5Add = new JButton("Add");
		item5Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (item5Qty.getText().length() > 0 && Integer.parseInt(item5Qty.getText()) > 0){
						try {
							itemPrice5 = (Menu.foodItems.get(5).getPrice()) * (Integer.parseInt(item5Qty.getText()));
							newCustomer.placeOrder(menuItem5.getText(), Integer.parseInt(item5Qty.getText()));
							
							textAreaBill.append(menuItem5.getText()+ " \t\t" + item5Qty.getText() 
							  + " \t      " + item5Price.getText() + "\t            $" 
							  + Double.toString(itemPrice5)+ newLine);
							
							count5++;
							subtotal+= itemPrice5;
							subtotal5Track += itemPrice5;
							
							taxBill += itemPrice5 * 0.07;
							tax5Track += itemPrice5 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty5) {
							customerPaneMessage();
						}
					}
					
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty5) {
					customerPaneMessage();
				}
			}
		});
		
		item5Remove = new JButton("Remove");
		item5Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5Remove.setForeground(new Color(165, 42, 42));
		item5Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem5.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));					
						
						 try {
							if (item5Qty.getText().length() > 0 && count5 > 0) {
								newCustomer.reduceOrder(menuItem5.getText());							
								
								subtotal-= subtotal5Track;
								subtotal5Track = 0;
								
								taxBill -= tax5Track;
								tax5Track = 0;
								
								count5 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item5Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
							}
						catch (NumberFormatException qty5) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		menuItem6 = new JTextField();
		menuItem6.setSelectedTextColor(new Color(0, 0, 139));
		menuItem6.setForeground(new Color(0, 0, 139));
		menuItem6.setEditable(false);
		menuItem6.setDisabledTextColor(new Color(0, 0, 139));
		menuItem6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem6.setColumns(10);
		menuItem6.setText(Menu.foodItems.get(6).getName());
		
		item6Type = new JTextField();
		item6Type.setSelectedTextColor(new Color(0, 0, 139));
		item6Type.setForeground(new Color(0, 0, 139));
		item6Type.setEditable(false);
		item6Type.setDisabledTextColor(new Color(0, 0, 139));
		item6Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6Type.setColumns(10);
		item6Type.setText(Menu.foodItems.get(6).getType());
		
		item6Price = new JTextField();
		item6Price.setSelectedTextColor(new Color(0, 0, 139));
		item6Price.setForeground(new Color(0, 0, 139));
		item6Price.setEditable(false);
		item6Price.setDisabledTextColor(new Color(0, 0, 139));
		item6Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6Price.setColumns(10);
		item6Price.setText("$ " + Double.toString(Menu.foodItems.get(6).getPrice()));		
		
		item6Qty = new JTextField();
		item6Qty.setSelectedTextColor(new Color(0, 0, 139));
		item6Qty.setForeground(new Color(0, 0, 139));
		item6Qty.setDisabledTextColor(new Color(0, 0, 139));
		item6Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6Qty.setColumns(10);
		
		item6Add = new JButton("Add");
		item6Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item6Qty.getText().length() > 0 && Integer.parseInt(item6Qty.getText()) > 0){
						try {
							itemPrice6 = (Menu.foodItems.get(6).getPrice()) * (Integer.parseInt(item6Qty.getText()));
							newCustomer.placeOrder(menuItem6.getText(), Integer.parseInt(item6Qty.getText()));
							
							textAreaBill.append(menuItem6.getText()+ " \t" + item6Qty.getText() 
							  + " \t      " + item6Price.getText() + "\t            $" 
							  + Double.toString(itemPrice6)+ newLine);
							
							count6++;
							subtotal+= itemPrice6;
							subtotal6Track += itemPrice6;
							
							taxBill += itemPrice6 * 0.07;
							tax6Track += itemPrice6 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty6) {
							customerPaneMessage();
						}
					}
					
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty6) {
					customerPaneMessage();
				}
			}
		});
		
		
		item6Remove = new JButton("Remove");
		item6Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6Remove.setForeground(new Color(165, 42, 42));
		item6Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem6.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));					
						
						 try {
							if (item6Qty.getText().length() > 0 && count6 > 0) {
								newCustomer.reduceOrder(menuItem6.getText());							
								
								subtotal-= subtotal6Track;	
								subtotal6Track = 0;
								
								taxBill -= tax6Track;
								tax6Track = 0;
								
								count6 = 0; 
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item6Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty6) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		menuItem7 = new JTextField();
		menuItem7.setSelectedTextColor(new Color(0, 0, 139));
		menuItem7.setForeground(new Color(0, 0, 139));
		menuItem7.setEditable(false);
		menuItem7.setDisabledTextColor(new Color(0, 0, 139));
		menuItem7.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem7.setColumns(10);
		menuItem7.setText(Menu.foodItems.get(7).getName());
		
		item7Type = new JTextField();
		item7Type.setSelectedTextColor(new Color(0, 0, 139));
		item7Type.setForeground(new Color(0, 0, 139));
		item7Type.setEditable(false);
		item7Type.setDisabledTextColor(new Color(0, 0, 139));
		item7Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7Type.setColumns(10);
		item7Type.setText(Menu.foodItems.get(7).getType());
		
		item7Price = new JTextField();
		item7Price.setSelectedTextColor(new Color(0, 0, 139));
		item7Price.setForeground(new Color(0, 0, 139));
		item7Price.setEditable(false);
		item7Price.setDisabledTextColor(new Color(0, 0, 139));
		item7Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7Price.setColumns(10);
		item7Price.setText("$ " + Double.toString(Menu.foodItems.get(7).getPrice()));
		
		item7Qty = new JTextField();
		item7Qty.setSelectedTextColor(new Color(0, 0, 139));
		item7Qty.setForeground(new Color(0, 0, 139));
		item7Qty.setDisabledTextColor(new Color(0, 0, 139));
		item7Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7Qty.setColumns(10);
		
		item7Add = new JButton("Add");
		item7Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item7Qty.getText().length() > 0 && Integer.parseInt(item7Qty.getText()) > 0){
						try {
							itemPrice7 = (Menu.foodItems.get(7).getPrice()) * (Integer.parseInt(item7Qty.getText()));
							newCustomer.placeOrder(menuItem7.getText(), Integer.parseInt(item7Qty.getText()));
							
							textAreaBill.append(menuItem7.getText()+ " \t" + item7Qty.getText() 
							  + " \t      " + item7Price.getText() + "\t            $" 
							  + Double.toString(itemPrice7)+ newLine);							
							
							count7++;
							subtotal+= itemPrice7;
							subtotal7Track += itemPrice7;
							
							taxBill += itemPrice7 * 0.07;
							tax7Track += itemPrice7 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty7) {
							customerPaneMessage();
						}
					}
					
					else {				
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty7) {
					customerPaneMessage();
				}
			}
		});
		
		item7Remove = new JButton("Remove");
		item7Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7Remove.setForeground(new Color(165, 42, 42));
		
		item7Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem7.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));					
						
						 try {
							if (item7Qty.getText().length() > 0 && count7 > 0) {
								newCustomer.reduceOrder(menuItem7.getText());							
								
								subtotal-= subtotal7Track;
								subtotal7Track = 0;
								
								taxBill -= tax7Track;
								tax7Track = 0;
								
								count7 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item7Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty7) {
							customerPaneMessage();
						}
					}	
				}
			}
		});		
		
		menuItem8 = new JTextField();
		menuItem8.setSelectedTextColor(new Color(0, 0, 139));
		menuItem8.setForeground(new Color(0, 0, 139));
		menuItem8.setEditable(false);
		menuItem8.setDisabledTextColor(new Color(0, 0, 139));
		menuItem8.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem8.setColumns(10);
		menuItem8.setText(Menu.foodItems.get(8).getName());
		
		item8Type = new JTextField();
		item8Type.setSelectedTextColor(new Color(0, 0, 139));
		item8Type.setForeground(new Color(0, 0, 139));
		item8Type.setEditable(false);
		item8Type.setDisabledTextColor(new Color(0, 0, 139));
		item8Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8Type.setColumns(10);
		item8Type.setText(Menu.foodItems.get(8).getType());
		
		item8Price = new JTextField();
		item8Price.setSelectedTextColor(new Color(0, 0, 139));
		item8Price.setForeground(new Color(0, 0, 139));
		item8Price.setEditable(false);
		item8Price.setDisabledTextColor(new Color(0, 0, 139));
		item8Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8Price.setColumns(10);
		item8Price.setText("$ " + Double.toString(Menu.foodItems.get(8).getPrice()));
		
		item8Qty = new JTextField();
		item8Qty.setSelectedTextColor(new Color(0, 0, 139));
		item8Qty.setForeground(new Color(0, 0, 139));
		item8Qty.setDisabledTextColor(new Color(0, 0, 139));
		item8Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8Qty.setColumns(10);
		
		item8Add = new JButton("Add");
		item8Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item8Qty.getText().length() > 0 && Integer.parseInt(item8Qty.getText()) > 0){
						try {
							itemPrice8 = (Menu.foodItems.get(8).getPrice()) * (Integer.parseInt(item8Qty.getText()));
							newCustomer.placeOrder(menuItem8.getText(), Integer.parseInt(item8Qty.getText()));
							
							textAreaBill.append(menuItem8.getText()+ " \t" + item8Qty.getText() 
							  + " \t      " + item8Price.getText() + "\t            $" 
							  + Double.toString(itemPrice8)+ newLine);							
							
							count8++;
							subtotal+= itemPrice8;
							subtotal8Track += itemPrice8;
							
							taxBill += itemPrice8 * 0.07;
							tax8Track += itemPrice8 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty8) {
							customerPaneMessage();
						}
					}
					
					else {				
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty8) {
					customerPaneMessage();
				}
			}
		});
		
		item8Remove = new JButton("Remove");
		item8Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8Remove.setForeground(new Color(165, 42, 42));
		item8Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem8.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));					
						
						 try {
							if (item8Qty.getText().length() > 0 && count8 > 0) {
								newCustomer.reduceOrder(menuItem8.getText());							
								
								subtotal-= subtotal8Track;	
								subtotal8Track = 0;
								
								taxBill -= tax8Track;
								tax8Track = 0;
								
								count8 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item8Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty8) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		menuItem9 = new JTextField();
		menuItem9.setSelectedTextColor(new Color(0, 0, 139));
		menuItem9.setForeground(new Color(0, 0, 139));
		menuItem9.setEditable(false);
		menuItem9.setDisabledTextColor(new Color(0, 0, 139));
		menuItem9.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem9.setColumns(10);
		menuItem9.setText(Menu.foodItems.get(9).getName());
		
		item9Type = new JTextField();
		item9Type.setSelectedTextColor(new Color(0, 0, 139));
		item9Type.setForeground(new Color(0, 0, 139));
		item9Type.setEditable(false);
		item9Type.setDisabledTextColor(new Color(0, 0, 139));
		item9Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9Type.setColumns(10);
		item9Type.setText(Menu.foodItems.get(9).getType());
		
		item9Price = new JTextField();
		item9Price.setSelectedTextColor(new Color(0, 0, 139));
		item9Price.setForeground(new Color(0, 0, 139));
		item9Price.setEditable(false);
		item9Price.setDisabledTextColor(new Color(0, 0, 139));
		item9Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9Price.setColumns(10);
		item9Price.setText("$ " + Double.toString(Menu.foodItems.get(9).getPrice()));
		
		item9Qty = new JTextField();
		item9Qty.setSelectedTextColor(new Color(0, 0, 139));
		item9Qty.setForeground(new Color(0, 0, 139));
		item9Qty.setDisabledTextColor(new Color(0, 0, 139));
		item9Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9Qty.setColumns(10);
		
		item9Add = new JButton("Add");
		item9Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item9Qty.getText().length()> 0 && Integer.parseInt(item9Qty.getText()) > 0){
						try {
							itemPrice9 = (Menu.foodItems.get(9).getPrice()) * (Integer.parseInt(item9Qty.getText()));
							newCustomer.placeOrder(menuItem9.getText(), Integer.parseInt(item9Qty.getText()));
							
							textAreaBill.append(menuItem9.getText()+ " \t\t" + item9Qty.getText() 
							  + " \t      " + item9Price.getText() + "\t            $" 
							  + Double.toString(itemPrice9)+ newLine);
							
							count9++;
							subtotal+= itemPrice9;
							subtotal9Track += itemPrice9;
							
							taxBill += itemPrice9 * 0.07;
							tax9Track += itemPrice9 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty9) {
							customerPaneMessage();
						}
					}
					
					else {				
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty9) {
					customerPaneMessage();
				}
			}
		});
		
		item9Remove = new JButton("Remove");
		item9Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9Remove.setForeground(new Color(165, 42, 42));
		item9Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem9.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));				
						
						 try {
							if (item9Qty.getText().length()> 0 && count9 > 0) {
								newCustomer.reduceOrder(menuItem9.getText());
								
								
								subtotal-= subtotal9Track;	
								subtotal9Track = 0;
								
								taxBill -= tax9Track;
								tax9Track = 0;
								
								count9 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item9Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty9) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		
		menuItem10 = new JTextField();
		menuItem10.setSelectedTextColor(new Color(0, 0, 139));
		menuItem10.setForeground(new Color(0, 0, 139));
		menuItem10.setEditable(false);
		menuItem10.setDisabledTextColor(new Color(0, 0, 139));
		menuItem10.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem10.setColumns(10);
		menuItem10.setText(Menu.foodItems.get(10).getName());
		
		item10Type = new JTextField();
		item10Type.setSelectedTextColor(new Color(0, 0, 139));
		item10Type.setForeground(new Color(0, 0, 139));
		item10Type.setEditable(false);
		item10Type.setDisabledTextColor(new Color(0, 0, 139));
		item10Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10Type.setColumns(10);
		item10Type.setText(Menu.foodItems.get(10).getType());
		
		item10Price = new JTextField();
		item10Price.setSelectedTextColor(new Color(0, 0, 139));
		item10Price.setForeground(new Color(0, 0, 139));
		item10Price.setEditable(false);
		item10Price.setDisabledTextColor(new Color(0, 0, 139));
		item10Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10Price.setColumns(10);
		item10Price.setText("$ " + Double.toString(Menu.foodItems.get(10).getPrice()));
		
		item10Qty = new JTextField();
		item10Qty.setSelectedTextColor(new Color(0, 0, 139));
		item10Qty.setForeground(new Color(0, 0, 139));
		item10Qty.setDisabledTextColor(new Color(0, 0, 139));
		item10Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10Qty.setColumns(10);
		
		item10Add = new JButton("Add");
		item10Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item10Qty.getText().length() > 0 && Integer.parseInt(item10Qty.getText()) > 0){
						try {
							itemPrice10 = (Menu.foodItems.get(10).getPrice()) * (Integer.parseInt(item10Qty.getText()));
							newCustomer.placeOrder(menuItem10.getText(), Integer.parseInt(item10Qty.getText()));
							
							textAreaBill.append(menuItem10.getText()+ " \t\t" + item10Qty.getText() 
							  + " \t      " + item10Price.getText() + "\t            $" 
							  + Double.toString(itemPrice10)+ newLine);
							
							count10++;
							subtotal+= itemPrice10;
							subtotal10Track += itemPrice10;
							
							taxBill += itemPrice10 * 0.07;
							tax10Track += itemPrice10 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty10) {
							customerPaneMessage();
						}
					}
					
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty10) {
					customerPaneMessage();
				}
			}
		});
		
		item10Remove = new JButton("Remove");
		item10Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10Remove.setForeground(new Color(165, 42, 42));
		item10Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem10.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));				
						
						 try {
							if (item10Qty.getText().length() > 0 && count10 > 0) {
								newCustomer.reduceOrder(menuItem10.getText());							
								
								subtotal-= subtotal10Track;	
								subtotal10Track = 0;
								
								taxBill -= tax10Track;
								tax10Track = 0;
								
								count10 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item10Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						}
						catch (NumberFormatException qty10) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		menuItem11 = new JTextField();
		menuItem11.setSelectedTextColor(new Color(0, 0, 139));
		menuItem11.setForeground(new Color(0, 0, 139));
		menuItem11.setEditable(false);
		menuItem11.setDisabledTextColor(new Color(0, 0, 139));
		menuItem11.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem11.setColumns(10);
		menuItem11.setText(Menu.foodItems.get(11).getName());
		
		item11Type = new JTextField();
		item11Type.setSelectedTextColor(new Color(0, 0, 139));
		item11Type.setForeground(new Color(0, 0, 139));
		item11Type.setEditable(false);
		item11Type.setDisabledTextColor(new Color(0, 0, 139));
		item11Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11Type.setColumns(10);
		item11Type.setText(Menu.foodItems.get(11).getType());
		
		item11Price = new JTextField();
		item11Price.setSelectedTextColor(new Color(0, 0, 139));
		item11Price.setForeground(new Color(0, 0, 139));
		item11Price.setEditable(false);
		item11Price.setDisabledTextColor(new Color(0, 0, 139));
		item11Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11Price.setColumns(10);
		item11Price.setText("$ " + Double.toString(Menu.foodItems.get(11).getPrice()));
		
		item11Qty = new JTextField();
		item11Qty.setSelectedTextColor(new Color(0, 0, 139));
		item11Qty.setForeground(new Color(0, 0, 139));
		item11Qty.setDisabledTextColor(new Color(0, 0, 139));
		item11Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11Qty.setColumns(10);
		
		item11Add = new JButton("Add");
		item11Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item11Qty.getText().length() > 0 && Integer.parseInt(item11Qty.getText()) > 0){
						try {
							itemPrice11 = (Menu.foodItems.get(11).getPrice()) * (Integer.parseInt(item11Qty.getText()));
							newCustomer.placeOrder(menuItem11.getText(), Integer.parseInt(item11Qty.getText()));
							
							textAreaBill.append(menuItem11.getText()+ " \t\t" + item11Qty.getText() 
							  + " \t      " + item11Price.getText() + "\t            $" 
							  + Double.toString(itemPrice11)+ newLine);
							
							count11++;
							subtotal+= itemPrice11;
							subtotal11Track += itemPrice11;
							
							taxBill += itemPrice11 * 0.07;
							tax11Track += itemPrice11 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty11) {
							customerPaneMessage();
						}
					}
					
					else {					
						customerPaneMessage();
					}
				}
				catch (NumberFormatException qty11) {
					customerPaneMessage();
				}
			}
		});
		
		item11Remove = new JButton("Remove");
		item11Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11Remove.setForeground(new Color(165, 42, 42));
		item11Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem11.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));				
						
						 try {
							if (item11Qty.getText().length() > 0 && count11 > 0) {
								newCustomer.reduceOrder(menuItem11.getText());							
								
								subtotal-= subtotal11Track;	
								subtotal11Track = 0;
								
								taxBill -= tax11Track;
								tax11Track = 0;
								
								count11 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item11Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						 }
						catch (NumberFormatException qty11) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		menuItem12 = new JTextField();
		menuItem12.setText((String) null);
		menuItem12.setSelectedTextColor(new Color(0, 0, 139));
		menuItem12.setForeground(new Color(0, 0, 139));
		menuItem12.setEditable(false);
		menuItem12.setDisabledTextColor(new Color(0, 0, 139));
		menuItem12.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem12.setColumns(10);
		menuItem12.setText(Menu.foodItems.get(12).getName());
		
		item12Type = new JTextField();
		item12Type.setText((String) null);
		item12Type.setSelectedTextColor(new Color(0, 0, 139));
		item12Type.setForeground(new Color(0, 0, 139));
		item12Type.setEditable(false);
		item12Type.setDisabledTextColor(new Color(0, 0, 139));
		item12Type.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12Type.setColumns(10);
		item12Type.setText(Menu.foodItems.get(12).getType());
		
		item12Price = new JTextField();
		item12Price.setText("$ 0.0");
		item12Price.setSelectedTextColor(new Color(0, 0, 139));
		item12Price.setForeground(new Color(0, 0, 139));
		item12Price.setEditable(false);
		item12Price.setDisabledTextColor(new Color(0, 0, 139));
		item12Price.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12Price.setColumns(10);
		item12Price.setText("$ " + Double.toString(Menu.foodItems.get(12).getPrice()));
		
		item12Qty = new JTextField();
		item12Qty.setSelectedTextColor(new Color(0, 0, 139));
		item12Qty.setForeground(new Color(0, 0, 139));
		item12Qty.setDisabledTextColor(new Color(0, 0, 139));
		item12Qty.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12Qty.setColumns(10);
		
		item12Add = new JButton("Add");
		item12Add.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					if (item12Qty.getText().length() > 0 && Integer.parseInt(item12Qty.getText()) > 0){
						try {
							itemPrice12 = (Menu.foodItems.get(12).getPrice()) * (Integer.parseInt(item12Qty.getText()));
							newCustomer.placeOrder(menuItem12.getText(), Integer.parseInt(item12Qty.getText()));
							
							textAreaBill.append(menuItem12.getText()+ " \t\t" + item12Qty.getText() 
							  + " \t      " + item12Price.getText() + "\t            $" 
							  + Double.toString(itemPrice12)+ newLine);
							
							count12++;
							subtotal+= itemPrice12;
							subtotal12Track += itemPrice12;
							
							taxBill += itemPrice12 * 0.07;
							tax12Track += itemPrice12 * 0.07;
							
							textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
							totalBill= taxBill + subtotal;
							textSubtotal.setText("$ " + Double.toString(subtotal));
							textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
						}
						catch (NumberFormatException qty12) {
							customerPaneMessage();
						}
					}
					
					else {					
						customerPaneMessage();
					}
				 }
				catch (NumberFormatException qty12) {
					customerPaneMessage();
				}
			}
		});
		
		item12Remove = new JButton("Remove");
		item12Remove.setForeground(new Color(165, 42, 42));
		item12Remove.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12Remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(String line: textAreaBill.getText().split("\n")) {
					
					if (line.contains(menuItem12.getText())) {
						 textAreaBill.setText(textAreaBill.getText().replace(line, "*"));
						 
						 try {
							if (item12Qty.getText().length() >= 0 && count12 > 0) {
								newCustomer.reduceOrder(menuItem12.getText());
								
								subtotal-= subtotal12Track;	
								subtotal12Track = 0;
								
								taxBill -= tax12Track;
								tax12Track = 0;
								
								count12 = 0;
								
								tip = 0;
								totalBill= taxBill + subtotal;
								
								if (subtotal == -0 || taxBill == -0) {
									
									subtotal = 0;
									taxBill = 0;
									totalBill = 0;
								}
	
								textSubtotal.setText("$ " + Double.toString(subtotal));
								textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
	
								textTip.setText("$ " + (new DecimalFormat("##.##").format(tip)));
								textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
								item12Qty.setText("");
							}
							
							else {
								customerPaneMessage();
							}
						 }
						catch (NumberFormatException qty12) {
							customerPaneMessage();
						}
					}	
				}
			}
		});
		
		GroupLayout gl_menuPanelCustomer = new GroupLayout(menuPanelCustomer);
		gl_menuPanelCustomer.setHorizontalGroup(
			gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPanelCustomer.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item12Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item12Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item12Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item12Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item12Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem11, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item11Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item11Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item11Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item11Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item11Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addComponent(separatorMenuCustomer, GroupLayout.PREFERRED_SIZE, 559, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addGap(30)
							.addComponent(lblMenuItems)
							.addGap(83)
							.addComponent(lblType, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(lblPrice, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblQuantity)
							.addGap(26)
							.addComponent(lblAddRemove))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(item4Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item4Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item4Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item4Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item4Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item5Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item5Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item5Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item5Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item5Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item6Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item6Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item6Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item6Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item6Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item7Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item7Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item7Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item7Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item7Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(item8Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item8Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(item8Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(item8Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item8Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(12)
							.addComponent(item9Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item9Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(item9Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addGap(6)
							.addComponent(item9Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item9Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addComponent(menuItem10, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item10Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item10Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item10Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item10Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item10Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelCustomer.createSequentialGroup()
									.addComponent(menuItem3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(item3Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item3Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item3Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelCustomer.createSequentialGroup()
									.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_menuPanelCustomer.createSequentialGroup()
											.addComponent(menuItem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(item1Type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_menuPanelCustomer.createSequentialGroup()
											.addComponent(menuItem2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(item2Type, 0, 0, Short.MAX_VALUE)))
									.addGap(18)
									.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(item1Price, 0, 0, Short.MAX_VALUE)
										.addComponent(item2Price, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
										.addComponent(item2Qty, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
										.addComponent(item1Qty, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.TRAILING)
									.addComponent(item3Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(item2Add))
								.addComponent(item1Add, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
								.addComponent(item1Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(item3Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
								.addComponent(item2Remove, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_menuPanelCustomer.setVerticalGroup(
			gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPanelCustomer.createSequentialGroup()
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblQuantity)
									.addComponent(lblAddRemove))
								.addComponent(lblMenuItems)))
						.addGroup(gl_menuPanelCustomer.createSequentialGroup()
							.addGap(5)
							.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblType)
								.addComponent(lblPrice))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(separatorMenuCustomer, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(item1Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item1Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(menuItem1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item1Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item1Add)
						.addComponent(item1Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(item2Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item2Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(menuItem2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item2Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item2Add)
						.addComponent(item2Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3Add)
						.addComponent(item3Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4Add)
						.addComponent(item4Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5Add)
						.addComponent(item5Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6Add)
						.addComponent(item6Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7Add)
						.addComponent(item7Remove))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item8Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item8Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item8Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
							.addComponent(item8Add)
							.addComponent(item8Remove)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item9Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item9Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item9Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
							.addComponent(item9Add)
							.addComponent(item9Remove)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
							.addComponent(item10Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item10Add)
							.addComponent(item10Remove))
						.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
							.addComponent(menuItem10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item10Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item10Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item11Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
							.addComponent(item11Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item11Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item11Add)
							.addComponent(item11Remove)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelCustomer.createParallelGroup(Alignment.BASELINE)
							.addComponent(item12Type, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item12Price, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item12Qty, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item12Add)
							.addComponent(item12Remove)))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		menuPanelCustomer.setLayout(gl_menuPanelCustomer);
		customerTab.setLayout(gl_customerTab);
		
		JPanel managerTab = new JPanel();
		managerTab.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		tabbedPane.addTab("Manager", null, managerTab, null);
		
		lblCurrentMenu = new JLabel("Current Menu");
		lblCurrentMenu.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblCurrentMenu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		lblUpdatedMenu = new JLabel("Updated Menu");
		lblUpdatedMenu.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		lblUpdatedMenu.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		menuPanelManager = new JPanel();
		menuPanelManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		separatorMenu = new JSeparator();
		
		lblMenuItemsManager = new JLabel("Menu Items");
		lblMenuItemsManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		lblTypeManager = new JLabel("Type");
		lblTypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		lblCurrentPrice = new JLabel("Current");
		lblCurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		lblAddRemoveManager = new JLabel("Add / Remove Item");
		lblAddRemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		menuItem1Manager = new JTextField();
		menuItem1Manager.setForeground(new Color(0, 0, 139));
		menuItem1Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem1Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem1Manager.setColumns(10);
		menuItem1Manager.setText(Menu.foodItems.get(1).getName());		
		
		item1TypeManager = new JTextField();
		item1TypeManager.setForeground(new Color(0, 0, 139));
		item1TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item1TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1TypeManager.setColumns(10);
		item1TypeManager.setText(Menu.foodItems.get(1).getType());
		
		item1CurrentPrice = new JTextField();
		item1CurrentPrice.setForeground(new Color(0, 0, 139));
		item1CurrentPrice.setEditable(false);
		item1CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item1CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1CurrentPrice.setColumns(10);
		item1CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(1).getPrice()));
		
		item1NewPrice = new JTextField();
		item1NewPrice.setForeground(new Color(0, 0, 139));
		item1NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item1NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1NewPrice.setColumns(10);
		
		item1Update = new JButton("Update");
		item1Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String oldLine = (menuItem1Manager.getText()+ " \t              " 
						 + item1TypeManager.getText() 
						 + " \t         " + item1CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(1).getPrice()+ newLine);
				
				String item1Line = menuItem1.getText()+ " \t\t" + item1Qty.getText() 
								 + " \t      " + item1Price.getText() + "\t            $" 
								 + Double.toString(itemPrice1)+ newLine;				
				
				try {
					if (item1NewPrice.getText().length()> 0 && Integer.parseInt(item1NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem1Manager.getText(), 
									   item1TypeManager.getText(), 
									   Double.parseDouble(item1NewPrice.getText()));
										Menu.foodItems.set(1, updateFood);
			
							thisManager.changePrice(food1, Integer.parseInt(item1NewPrice.getText()));
							item1NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(1).getPrice()));
							item1CurrentPrice.setText(item1NewPrice.getText());
							menuItem1.setText(Menu.foodItems.get(1).getName());
							item1Type.setText(Menu.foodItems.get(1).getType());
							item1Price.setText("$ " + Double.toString(Menu.foodItems.get(1).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem1Manager.getText())) {
									String updatedLine = menuItem1Manager.getText()+ " \t              " 
											+ item1TypeManager.getText() 
											+ " \t         " + item1CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(1).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem1.getText())) {
									
									if (count1 > 0) {
										double itemPrice1Updated = (Menu.foodItems.get(1).getPrice()) * (Integer.parseInt(item1Qty.getText()));								
									
										subtotal-= itemPrice1 * count1; 	
										taxBill -= itemPrice1 * count1 * 0.07; 
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										tip = 0;
										textTip.setText("0");
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice1 = (Menu.foodItems.get(1).getPrice()) * (Integer.parseInt(item1Qty.getText()));
										
										subtotal+= itemPrice1Updated * count1;
										subtotal1Track = itemPrice1Updated * count1;
										
										taxBill += itemPrice1Updated * count1 * 0.07;
										tax1Track = itemPrice1Updated * count1 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item1Update = menuItem1.getText()+ " \t\t" + item1Qty.getText() 
						 				   + " \t      " + item1Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice1)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item1Line, item1Update));
									}
								}
							}
						}
						catch(NumberFormatException num1) {
							managerPaneMessage();
						}
					}
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num1) {
					managerPaneMessage();
				}	
			}
		});
		item1AddManager = new JButton("Add");
		item1AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem1Manager.getText()+ " \t              " 
									+ item1TypeManager.getText() 
									+ " \t         " + item1CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(1).getPrice()+ newLine);
			}
		});
		
		item1RemoveManager = new JButton("Remove");
		item1RemoveManager.setForeground(new Color(165, 42, 42));
		item1RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item1RemoveManager.setBackground(new Color(211, 211, 211));
		item1RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line1 = (menuItem1Manager.getText()+ " \t              " 
						 + item1TypeManager.getText() 
						 + " \t         " + item1CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(1).getPrice()+ newLine);

				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem1Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line1, ""));
					}
				}

			}
		});
		
		menuItem2Manager = new JTextField();
		menuItem2Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem2Manager.setForeground(new Color(0, 0, 139));
		menuItem2Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem2Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem2Manager.setColumns(10);
		menuItem2Manager.setText(Menu.foodItems.get(2).getName());
		
		item2TypeManager = new JTextField();
		item2TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item2TypeManager.setForeground(new Color(0, 0, 139));
		item2TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item2TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2TypeManager.setColumns(10);
		item2TypeManager.setText(Menu.foodItems.get(2).getType());
		
		item2CurrentPrice = new JTextField();
		item2CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item2CurrentPrice.setForeground(new Color(0, 0, 139));
		item2CurrentPrice.setEditable(false);
		item2CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item2CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2CurrentPrice.setColumns(10);
		item2CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(2).getPrice()));
		
		item2NewPrice = new JTextField();
		item2NewPrice.setForeground(new Color(0, 0, 139));
		item2NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item2NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2NewPrice.setColumns(10);
		
		item2Update = new JButton("Update");
		item2Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem2Manager.getText()+ " \t              " 
						 + item2TypeManager.getText() 
						 + " \t         " + item2CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(2).getPrice()+ newLine);
				
				String item2Line = menuItem2.getText()+ " \t\t" + item2Qty.getText() 
								 + " \t      " + item2Price.getText() + "\t            $" 
								 + Double.toString(itemPrice2)+ newLine;			
				
				try {
					if (item2NewPrice.getText().length()> 0 && Integer.parseInt(item2NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem2Manager.getText(), 
									   item2TypeManager.getText(), 
									   Double.parseDouble(item2NewPrice.getText()));
										Menu.foodItems.set(2, updateFood);
			
							thisManager.changePrice(food2, Integer.parseInt(item2NewPrice.getText()));
							item2NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(2).getPrice()));
							item2CurrentPrice.setText(item2NewPrice.getText());
							menuItem2.setText(Menu.foodItems.get(2).getName());
							item2Type.setText(Menu.foodItems.get(2).getType());
							item2Price.setText("$ " + Double.toString(Menu.foodItems.get(2).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem2Manager.getText())) {
									String updatedLine = menuItem2Manager.getText()+ " \t              " 
											+ item2TypeManager.getText() 
											+ " \t         " + item2CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(2).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem2.getText())) {
									
									if (count2 > 0) {
										double itemPrice2Updated = (Menu.foodItems.get(2).getPrice()) * (Integer.parseInt(item2Qty.getText()));
									
										subtotal-= itemPrice2 * count2;	
										taxBill -= itemPrice2 * count2 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice2 = (Menu.foodItems.get(2).getPrice()) * (Integer.parseInt(item2Qty.getText()));
										
										subtotal+= itemPrice2Updated * count2;
										subtotal2Track = itemPrice2Updated * count2;
										
										taxBill += itemPrice2Updated * count2 * 0.07;
										tax2Track = itemPrice2Updated * count2 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item2Update = menuItem2.getText()+ " \t\t" + item2Qty.getText() 
						 				   + " \t      " + item2Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice2)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item2Line, item2Update));
									}
								}
							}
						}
						catch(NumberFormatException num2) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num2) {
					managerPaneMessage();
				}
			}
		});
		
		item2AddManager = new JButton("Add");
		item2AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem2Manager.getText()+ " \t              " 
									+ item2TypeManager.getText() 
									+ " \t         " + item2CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(2).getPrice()+ newLine);
			}
		});
		
		item2RemoveManager = new JButton("Remove");
		item2RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item2RemoveManager.setForeground(new Color(165, 42, 42));
		item2RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line2 = (menuItem2Manager.getText()+ " \t              " 
						 + item2TypeManager.getText() 
						 + " \t         " + item2CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(2).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem2Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line2, ""));
					}
				}
			}
		});
		
		menuItem3Manager = new JTextField();
		menuItem3Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem3Manager.setForeground(new Color(0, 0, 139));
		menuItem3Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem3Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem3Manager.setColumns(10);
		menuItem3Manager.setText(Menu.foodItems.get(3).getName());
		
		item3TypeManager = new JTextField();
		item3TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item3TypeManager.setForeground(new Color(0, 0, 139));
		item3TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item3TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3TypeManager.setColumns(10);
		item3TypeManager.setText(Menu.foodItems.get(3).getType());
		
		item3CurrentPrice = new JTextField();
		item3CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item3CurrentPrice.setForeground(new Color(0, 0, 139));
		item3CurrentPrice.setEditable(false);
		item3CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item3CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3CurrentPrice.setColumns(10);
		item3CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(3).getPrice()));
		
		
		item3NewPrice = new JTextField();
		item3NewPrice.setForeground(new Color(0, 0, 139));
		item3NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item3NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3NewPrice.setColumns(10);
		
		item3Update = new JButton("Update");
		item3Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem3Manager.getText()+ " \t              " 
						 + item3TypeManager.getText() 
						 + " \t         " + item3CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(3).getPrice()+ newLine);
				
				String item3Line = menuItem3.getText()+ " \t\t" + item3Qty.getText() 
								 + " \t      " + item3Price.getText() + "\t            $" 
								 + Double.toString(itemPrice3)+ newLine;				
				
				try {
					if (item3NewPrice.getText().length()> 0 && Integer.parseInt(item3NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem3Manager.getText(), 
									   item3TypeManager.getText(), 
									   Double.parseDouble(item3NewPrice.getText()));
										Menu.foodItems.set(3, updateFood);
			
							thisManager.changePrice(food3, Integer.parseInt(item3NewPrice.getText()));
							item3NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(3).getPrice()));
							item3CurrentPrice.setText(item3NewPrice.getText());
							menuItem3.setText(Menu.foodItems.get(3).getName());
							item3Type.setText(Menu.foodItems.get(3).getType());
							item3Price.setText("$ " + Double.toString(Menu.foodItems.get(3).getPrice()));
							
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem3Manager.getText())) {
									String updatedLine = menuItem3Manager.getText()+ " \t              " 
											+ item3TypeManager.getText() 
											+ " \t         " + item3CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(3).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem3.getText())) {
									
									if (count3 > 0) {
										double itemPrice3Updated = (Menu.foodItems.get(3).getPrice()) * (Integer.parseInt(item3Qty.getText()));
									
									
										subtotal-= itemPrice3 * count3;	
										taxBill -= itemPrice3 * count3 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice3 = (Menu.foodItems.get(3).getPrice()) * (Integer.parseInt(item3Qty.getText()));
										
										subtotal+= itemPrice3Updated * count3;
										subtotal3Track = itemPrice3Updated * count3;
										
										taxBill += itemPrice3Updated * count3 * 0.07;
										tax3Track = itemPrice3Updated * count3 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item3Update = menuItem3.getText()+ " \t\t" + item3Qty.getText() 
						 				   + " \t      " + item3Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice3)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item3Line, item3Update));
									}
								}
							}
						}
						catch(NumberFormatException num3) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num3) {
					managerPaneMessage();
				}
			}
		});
		
		
		item3AddManager = new JButton("Add");
		item3AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem3Manager.getText()+ " \t              " 
									+ item3TypeManager.getText() 
									+ " \t         " + item3CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(3).getPrice()+ newLine);
			}
		});		
		
		item3RemoveManager = new JButton("Remove");
		item3RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item3RemoveManager.setForeground(new Color(165, 42, 42));
		item3RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line3 = (menuItem3Manager.getText()+ " \t              " 
						 + item3TypeManager.getText() 
						 + " \t         " + item3CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(3).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem3Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line3, ""));
					}
				}
			}
		});
		
		
		menuItem4Manager = new JTextField();
		menuItem4Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem4Manager.setForeground(new Color(0, 0, 139));
		menuItem4Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem4Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem4Manager.setColumns(10);
		menuItem4Manager.setText(Menu.foodItems.get(4).getName());
		
		item4TypeManager = new JTextField();
		item4TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item4TypeManager.setForeground(new Color(0, 0, 139));
		item4TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item4TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4TypeManager.setColumns(10);
		item4TypeManager.setText(Menu.foodItems.get(4).getType());
		
		item4CurrentPrice = new JTextField();
		item4CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item4CurrentPrice.setForeground(new Color(0, 0, 139));
		item4CurrentPrice.setEditable(false);
		item4CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item4CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4CurrentPrice.setColumns(10);
		item4CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(4).getPrice()));
		
		item4NewPrice = new JTextField();
		item4NewPrice.setForeground(new Color(0, 0, 139));
		item4NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item4NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4NewPrice.setColumns(10);
		
		item4Update = new JButton("Update");
		item4Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem4Manager.getText()+ " \t              " 
						 + item4TypeManager.getText() 
						 + " \t         " + item4CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(4).getPrice()+ newLine);
				
				String item4Line = menuItem4.getText()+ " \t\t" + item4Qty.getText() 
								 + " \t      " + item4Price.getText() + "\t            $" 
								 + Double.toString(itemPrice4)+ newLine;
				
				try {
					if (item4NewPrice.getText().length()> 0 && Integer.parseInt(item4NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem4Manager.getText(), 
									   item4TypeManager.getText(), 
									   Double.parseDouble(item4NewPrice.getText()));
									   Menu.foodItems.set(4, updateFood);
			
							thisManager.changePrice(food4, Integer.parseInt(item4NewPrice.getText()));
							item4NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(4).getPrice()));
							item4CurrentPrice.setText(item4NewPrice.getText());
							menuItem4.setText(Menu.foodItems.get(4).getName());
							item4Type.setText(Menu.foodItems.get(4).getType());
							item4Price.setText("$ " + Double.toString(Menu.foodItems.get(4).getPrice()));
							
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem4Manager.getText())) {
									String updatedLine = menuItem4Manager.getText()+ " \t              " 
											+ item4TypeManager.getText() 
											+ " \t         " + item4CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(4).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem4.getText())) {
									
									if (count4 > 0) {
										double itemPrice4Updated = (Menu.foodItems.get(4).getPrice()) * (Integer.parseInt(item4Qty.getText()));
									
									
										subtotal-= itemPrice4 * count4;	
										taxBill -= itemPrice4 * count4 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice4 = (Menu.foodItems.get(4).getPrice()) * (Integer.parseInt(item4Qty.getText()));
										
										subtotal+= itemPrice4Updated * count4;
										subtotal4Track = itemPrice4Updated * count4;
										
										taxBill += itemPrice4Updated * count4 * 0.07;
										tax4Track = itemPrice4Updated * count4 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item4Update = menuItem4.getText()+ " \t\t" + item4Qty.getText() 
						 				   + " \t      " + item4Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice4)+ newLine;
										
										textAreaBill.setText(textAreaBill.getText().replace(item4Line, item4Update));
									}
								}
							}
						}
						catch(NumberFormatException num4) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num4) {
					managerPaneMessage();
				}
			}
		});
		
		item4AddManager = new JButton("Add");
		item4AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem4Manager.getText()+ " \t              " 
									+ item4TypeManager.getText() 
									+ " \t         " + item4CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(4).getPrice()+ newLine);
			}
		});
		
		item4RemoveManager = new JButton("Remove");
		item4RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item4RemoveManager.setForeground(new Color(165, 42, 42));
		item4RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line4 = (menuItem4Manager.getText()+ " \t              " 
						 + item4TypeManager.getText() 
						 + " \t         " + item4CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(4).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem4Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line4, ""));
					}
				}
			}
		});
		
		menuItem5Manager = new JTextField();
		menuItem5Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem5Manager.setForeground(new Color(0, 0, 139));
		menuItem5Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem5Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem5Manager.setColumns(10);
		menuItem5Manager.setText(Menu.foodItems.get(5).getName());
		
		item5TypeManager = new JTextField();
		item5TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item5TypeManager.setForeground(new Color(0, 0, 139));
		item5TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item5TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5TypeManager.setColumns(10);
		item5TypeManager.setText(Menu.foodItems.get(5).getType());
		
		item5CurrentPrice = new JTextField();
		item5CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item5CurrentPrice.setForeground(new Color(0, 0, 139));
		item5CurrentPrice.setEditable(false);
		item5CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item5CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5CurrentPrice.setColumns(10);
		item5CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(5).getPrice()));
		
		item5NewPrice = new JTextField();
		item5NewPrice.setForeground(new Color(0, 0, 139));
		item5NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item5NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5NewPrice.setColumns(10);
		
		item5Update = new JButton("Update");
		item5Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem5Manager.getText()+ " \t              " 
						 + item5TypeManager.getText() 
						 + " \t         " + item5CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(5).getPrice()+ newLine);
				
				String item5Line = menuItem5.getText()+ " \t\t" + item5Qty.getText() 
								 + " \t      " + item5Price.getText() + "\t            $" 
								 + Double.toString(itemPrice5)+ newLine;
				
				try {
					if (item5NewPrice.getText().length()> 0 && Integer.parseInt(item5NewPrice.getText()) > 0){
					
						try {					
							Food updateFood = new Food(menuItem5Manager.getText(), 
									   item5TypeManager.getText(), 
									   Double.parseDouble(item5NewPrice.getText()));
									   Menu.foodItems.set(5, updateFood);
			
							thisManager.changePrice(food5, Integer.parseInt(item5NewPrice.getText()));
							item5NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(5).getPrice()));
							item5CurrentPrice.setText(item5NewPrice.getText());
							menuItem5.setText(Menu.foodItems.get(5).getName());
							item5Type.setText(Menu.foodItems.get(5).getType());
							item5Price.setText("$ " + Double.toString(Menu.foodItems.get(5).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem5Manager.getText())) {
									String updatedLine = menuItem5Manager.getText()+ " \t              " 
											+ item5TypeManager.getText() 
											+ " \t         " + item5CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(5).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem5.getText())) {
									
									if (count5 > 0) {
										double itemPrice5Updated = (Menu.foodItems.get(5).getPrice()) * (Integer.parseInt(item5Qty.getText()));								
									
										subtotal-= itemPrice5 * count5;	
										taxBill -= itemPrice5 * count5 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice5 = (Menu.foodItems.get(5).getPrice()) * (Integer.parseInt(item5Qty.getText()));
										
										subtotal+= itemPrice5Updated * count5;	
										subtotal5Track = itemPrice5Updated * count5;
										
										taxBill += itemPrice5Updated * count5 * 0.07;
										tax5Track = itemPrice5Updated * count5 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item5Update = menuItem5.getText()+ " \t\t" + item5Qty.getText() 
						 				   + " \t      " + item5Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice5)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item5Line, item5Update));
									}
								}
							}
						}
						catch(NumberFormatException num5) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num5) {
					managerPaneMessage();
				}
			}
		});
		
		item5AddManager = new JButton("Add");
		item5AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem5Manager.getText()+ " \t              " 
									+ item5TypeManager.getText() 
									+ " \t         " + item5CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(5).getPrice()+ newLine);
			}
		});
		
		item5RemoveManager = new JButton("Remove");
		item5RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item5RemoveManager.setForeground(new Color(165, 42, 42));
		item5RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line5 = (menuItem5Manager.getText()+ " \t              " 
						 + item5TypeManager.getText() 
						 + " \t         " + item5CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(5).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem5Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line5, ""));
					}
				}
			}
		});
		
		menuItem6Manager = new JTextField();
		menuItem6Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem6Manager.setForeground(new Color(0, 0, 139));
		menuItem6Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem6Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem6Manager.setColumns(10);
		menuItem6Manager.setText(Menu.foodItems.get(6).getName());
		
		item6TypeManager = new JTextField();
		item6TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item6TypeManager.setForeground(new Color(0, 0, 139));
		item6TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item6TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6TypeManager.setColumns(10);
		item6TypeManager.setText(Menu.foodItems.get(6).getType());
		
		item6CurrentPrice = new JTextField();
		item6CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item6CurrentPrice.setForeground(new Color(0, 0, 139));
		item6CurrentPrice.setEditable(false);
		item6CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item6CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6CurrentPrice.setColumns(10);
		item6CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(6).getPrice()));
		
		item6NewPrice = new JTextField();
		item6NewPrice.setForeground(new Color(0, 0, 139));
		item6NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item6NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6NewPrice.setColumns(10);
		item6Update = new JButton("Update");
		item6Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem6Manager.getText()+ "            " 
						 + item6TypeManager.getText() 
						 + " \t         " + item6CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(6).getPrice()+ newLine);
				
				String item6Line = menuItem6.getText()+ " \t" + item6Qty.getText() 
				  				 + " \t      " + item6Price.getText() + "\t            $" 
				  				 + Double.toString(itemPrice6)+ newLine;
				
				try {
					if (item6NewPrice.getText().length()> 0 && Integer.parseInt(item6NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem6Manager.getText(), 
									   item6TypeManager.getText(), 
									   Double.parseDouble(item6NewPrice.getText()));
									   Menu.foodItems.set(6, updateFood);
			
							thisManager.changePrice(food6, Integer.parseInt(item6NewPrice.getText()));
							item6NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(6).getPrice()));
							item6CurrentPrice.setText(item6NewPrice.getText());
							menuItem6.setText(Menu.foodItems.get(6).getName());
							item6Type.setText(Menu.foodItems.get(6).getType());
							item6Price.setText("$ " + Double.toString(Menu.foodItems.get(6).getPrice()));					
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem6Manager.getText())) {
									String updatedLine = menuItem6Manager.getText()+ "            " 
											+ item6TypeManager.getText() 
											+ " \t         " + item6CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(6).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem6.getText())) {
									
									if (count6 > 0) {
										double itemPrice6Updated = (Menu.foodItems.get(6).getPrice()) * (Integer.parseInt(item6Qty.getText()));								
									
										subtotal-= itemPrice6 * count6;	
										taxBill -= itemPrice6 * count6 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice6 = (Menu.foodItems.get(6).getPrice()) * (Integer.parseInt(item6Qty.getText()));
										
										subtotal+= itemPrice6Updated* count6;	
										subtotal6Track = itemPrice6Updated* count6;
										
										taxBill += itemPrice6Updated * count6 * 0.07;
										tax6Track = itemPrice6Updated * count6 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item6Update = menuItem6.getText()+ " \t" + item6Qty.getText() 
										  					+ " \t      " + item6Price.getText() + "\t            $" 
										  					+ Double.toString(itemPrice6)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item6Line, item6Update));
									}
								}
							}
						}
						catch(NumberFormatException num6) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num6) {
					managerPaneMessage();
				}
			}
		});
		
		item6AddManager = new JButton("Add");
		item6AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem6Manager.getText()+ "            " 
									+ item6TypeManager.getText() 
									+ " \t         " + item6CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(6).getPrice()+ newLine);
			}
		});
		
		item6RemoveManager = new JButton("Remove");
		item6RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item6RemoveManager.setForeground(new Color(165, 42, 42));
		item6RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line6 = (menuItem6Manager.getText()+ "            " 
						 + item6TypeManager.getText() 
						 + " \t         " + item6CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(6).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem6Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line6, ""));
					}
				}
			}
		});
		
		menuItem7Manager = new JTextField();
		menuItem7Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem7Manager.setForeground(new Color(0, 0, 139));
		menuItem7Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem7Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem7Manager.setColumns(10);
		menuItem7Manager.setText(Menu.foodItems.get(7).getName());
		
		item7TypeManager = new JTextField();
		item7TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item7TypeManager.setForeground(new Color(0, 0, 139));
		item7TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item7TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7TypeManager.setColumns(10);
		item7TypeManager.setText(Menu.foodItems.get(7).getType());
		
		item7CurrentPrice = new JTextField();
		item7CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item7CurrentPrice.setForeground(new Color(0, 0, 139));
		item7CurrentPrice.setEditable(false);
		item7CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item7CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7CurrentPrice.setColumns(10);
		item7CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(7).getPrice()));
		
		item7NewPrice = new JTextField();
		item7NewPrice.setForeground(new Color(0, 0, 139));
		item7NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item7NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7NewPrice.setColumns(10);
		
		item7Update = new JButton("Update");
		item7Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem7Manager.getText()+ "          " 
						 + item7TypeManager.getText() 
						 + " \t         " + item7CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(7).getPrice()+ newLine);
				
				String item7Line = menuItem7.getText()+ " \t" + item7Qty.getText() 
				  				 + " \t      " + item7Price.getText() + "\t            $" 
				  				 + Double.toString(itemPrice7)+ newLine;
				
				try {
					if (item7NewPrice.getText().length()> 0 && Integer.parseInt(item7NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem7Manager.getText(), 
									   item7TypeManager.getText(), 
									   Double.parseDouble(item7NewPrice.getText()));
									   Menu.foodItems.set(7, updateFood);
			
							thisManager.changePrice(food7, Integer.parseInt(item7NewPrice.getText()));
							item7NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(7).getPrice()));
							item7CurrentPrice.setText(item7NewPrice.getText());
							menuItem7.setText(Menu.foodItems.get(7).getName());
							item7Type.setText(Menu.foodItems.get(7).getType());
							item7Price.setText("$ " + Double.toString(Menu.foodItems.get(7).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem7Manager.getText())) {
									String updatedLine = menuItem7Manager.getText()+ "          " 
											+ item7TypeManager.getText() 
											+ " \t         " + item7CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(7).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem7.getText())) {
									
									if (count7 > 0) {
										double itemPrice7Updated = (Menu.foodItems.get(7).getPrice()) * (Integer.parseInt(item7Qty.getText()));								
									
										subtotal-= itemPrice7 * count7;	
										taxBill -= itemPrice7 * count7 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice7 = (Menu.foodItems.get(7).getPrice()) * (Integer.parseInt(item7Qty.getText()));
										
										subtotal+= itemPrice7Updated * count7;	
										subtotal7Track = itemPrice7Updated * count7;
										
										taxBill += itemPrice7Updated * count7 * 0.07;
										tax7Track = itemPrice7Updated * count7 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item7Update = menuItem7.getText()+ " \t" + item7Qty.getText() 
										  					+ " \t      " + item7Price.getText() + "\t            $" 
										  					+ Double.toString(itemPrice7)+ newLine;
										
										textAreaBill.setText(textAreaBill.getText().replace(item7Line, item7Update));
									}
								}
							}
						}
						catch(NumberFormatException num7) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num7) {
					managerPaneMessage();
				}
			}
		});
		
		item7AddManager = new JButton("Add");
		item7AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem7Manager.getText()+ "          " 
									+ item7TypeManager.getText() 
									+ " \t         " + item7CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(7).getPrice()+ newLine);

			}
		});
		
		item7RemoveManager = new JButton("Remove");
		item7RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item7RemoveManager.setForeground(new Color(165, 42, 42));
		item7RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line7 = (menuItem7Manager.getText()+ "          " 
						 + item7TypeManager.getText() 
						 + " \t         " + item7CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(7).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem7Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line7, ""));
					}
				}
			}
		});
		
		menuItem8Manager = new JTextField();
		menuItem8Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem8Manager.setForeground(new Color(0, 0, 139));
		menuItem8Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem8Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem8Manager.setColumns(10);
		menuItem8Manager.setText(Menu.foodItems.get(8).getName());
		
		item8TypeManager = new JTextField();
		item8TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item8TypeManager.setForeground(new Color(0, 0, 139));
		item8TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item8TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8TypeManager.setColumns(10);
		item8TypeManager.setText(Menu.foodItems.get(8).getType());
		
		item8CurrentPrice = new JTextField();
		item8CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item8CurrentPrice.setForeground(new Color(0, 0, 139));
		item8CurrentPrice.setEditable(false);
		item8CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item8CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8CurrentPrice.setColumns(10);
		item8CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(8).getPrice()));
		
		item8NewPrice = new JTextField();
		item8NewPrice.setForeground(new Color(0, 0, 139));
		item8NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item8NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8NewPrice.setColumns(10);
		
		item8Update = new JButton("Update");
		item8Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem8Manager.getText()+ "              " 
						 + item8TypeManager.getText() 
						 + " \t         " + item8CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(8).getPrice()+ newLine);
				
				String item8Line = menuItem8.getText()+ " \t" + item8Qty.getText() 
				  				 + " \t      " + item8Price.getText() + "\t            $" 
				  				 + Double.toString(itemPrice8)+ newLine;
				
				try {
					if (item8NewPrice.getText().length()> 0 && Integer.parseInt(item8NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem8Manager.getText(), 
									   item8TypeManager.getText(), 
									   Double.parseDouble(item8NewPrice.getText()));
										Menu.foodItems.set(8, updateFood);
			
							thisManager.changePrice(food8, Integer.parseInt(item8NewPrice.getText()));
							item8NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(8).getPrice()));
							item8CurrentPrice.setText(item8NewPrice.getText());
							menuItem8.setText(Menu.foodItems.get(8).getName());
							item8Type.setText(Menu.foodItems.get(8).getType());
							item8Price.setText("$ " + Double.toString(Menu.foodItems.get(8).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem8Manager.getText())) {
									String updatedLine = menuItem8Manager.getText()+ "              " 
											+ item8TypeManager.getText() 
											+ " \t         " + item8CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(8).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem8.getText())) {
									
									if (count8 > 0) {
										double itemPrice8Updated = (Menu.foodItems.get(8).getPrice()) * (Integer.parseInt(item8Qty.getText()));
																	
										subtotal-= itemPrice8 * count8;	
										taxBill -= itemPrice8 * count8 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice8 = (Menu.foodItems.get(8).getPrice()) * (Integer.parseInt(item8Qty.getText()));
										
										subtotal+= itemPrice8Updated * count8;
										subtotal8Track = itemPrice8Updated * count8;
										
										taxBill += itemPrice8Updated * count8 * 0.07;
										tax8Track = itemPrice8Updated * count8 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item8Update = menuItem8.getText()+ " \t" + item8Qty.getText() 
										  					+ " \t      " + item8Price.getText() + "\t            $" 
										  					+ Double.toString(itemPrice8)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item8Line, item8Update));
									}
								}
							}
						}
						catch(NumberFormatException num8) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num8) {
					managerPaneMessage();
				}
			}
		});
		
		item8AddManager = new JButton("Add");
		item8AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem8Manager.getText()+ "              " 
									+ item8TypeManager.getText() 
									+ " \t         " + item8CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(8).getPrice()+ newLine);
			}
		});
		
		item8RemoveManager = new JButton("Remove");
		item8RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item8RemoveManager.setForeground(new Color(165, 42, 42));
		item8RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line8 = (menuItem8Manager.getText()+ "              " 
						 + item8TypeManager.getText() 
						 + " \t         " + item8CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(8).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem8Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line8, ""));
					}
				}
			}
		});
		
		menuItem9Manager = new JTextField();
		menuItem9Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem9Manager.setForeground(new Color(0, 0, 139));
		menuItem9Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem9Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem9Manager.setColumns(10);
		menuItem9Manager.setText(Menu.foodItems.get(9).getName());
		
		item9TypeManager = new JTextField();
		item9TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item9TypeManager.setForeground(new Color(0, 0, 139));
		item9TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item9TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9TypeManager.setColumns(10);
		item9TypeManager.setText(Menu.foodItems.get(9).getType());
		
		item9CurrentPrice = new JTextField();
		item9CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item9CurrentPrice.setForeground(new Color(0, 0, 139));
		item9CurrentPrice.setEditable(false);
		item9CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item9CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9CurrentPrice.setColumns(10);
		item9CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(9).getPrice()));
		
		item9NewPrice = new JTextField();
		item9NewPrice.setForeground(new Color(0, 0, 139));
		item9NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item9NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9NewPrice.setColumns(10);
		
		item9Update = new JButton("Update");
		item9Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem9Manager.getText()+ " \t              " 
						 + item9TypeManager.getText() 
						 + " \t         " + item9CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(9).getPrice()+ newLine);
				
				String item9Line = menuItem9.getText()+ " \t\t" + item9Qty.getText() 
								 + " \t      " + item9Price.getText() + "\t            $" 
								 + Double.toString(itemPrice9)+ newLine;
				
				try {
					if (item9NewPrice.getText().length()> 0 && Integer.parseInt(item9NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem9Manager.getText(), 
									   item9TypeManager.getText(), 
									   Double.parseDouble(item9NewPrice.getText()));
										Menu.foodItems.set(9, updateFood);
			
							thisManager.changePrice(food9, Integer.parseInt(item9NewPrice.getText()));
							item9NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(9).getPrice()));
							item9CurrentPrice.setText(item9NewPrice.getText());
							menuItem9.setText(Menu.foodItems.get(9).getName());
							item9Type.setText(Menu.foodItems.get(9).getType());
							item9Price.setText("$ " + Double.toString(Menu.foodItems.get(9).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem9Manager.getText())) {
									String updatedLine = menuItem9Manager.getText()+ " \t              " 
											+ item9TypeManager.getText() 
											+ " \t         " + item9CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(9).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem9.getText())) {
									
									if (count9 > 0) {
										double itemPrice9Updated = (Menu.foodItems.get(9).getPrice()) * (Integer.parseInt(item9Qty.getText()));								
									
										subtotal-= itemPrice9 * count9;	
										taxBill -= itemPrice9 * count9 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice9 = (Menu.foodItems.get(9).getPrice()) * (Integer.parseInt(item9Qty.getText()));
										
										subtotal+= itemPrice9Updated * count9;
										subtotal9Track = itemPrice9Updated * count9;
										
										taxBill += itemPrice9Updated * count9 * 0.07;
										tax9Track = itemPrice9Updated * count9 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item9Update = menuItem9.getText()+ " \t\t" + item9Qty.getText() 
						 				   + " \t      " + item9Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice9)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item9Line, item9Update));
									}
								}
							}
						}
						catch(NumberFormatException num9) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num9) {
					managerPaneMessage();
				}
			}
		});
		
		item9AddManager = new JButton("Add");
		item9AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem9Manager.getText()+ " \t              " 
									+ item9TypeManager.getText() 
									+ " \t         " + item9CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(9).getPrice()+ newLine);
			}
		});
		
		item9RemoveManager = new JButton("Remove");
		item9RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item9RemoveManager.setForeground(new Color(165, 42, 42));
		item9RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line9 = (menuItem9Manager.getText()+ " \t              " 
						 + item9TypeManager.getText() 
						 + " \t         " + item9CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(9).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem9Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line9, ""));
					}
				}
			}
		});
		
		menuItem10Manager = new JTextField();
		menuItem10Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem10Manager.setForeground(new Color(0, 0, 139));
		menuItem10Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem10Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem10Manager.setColumns(10);
		menuItem10Manager.setText(Menu.foodItems.get(10).getName());
		
		item10TypeManager = new JTextField();
		item10TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item10TypeManager.setForeground(new Color(0, 0, 139));
		item10TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item10TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10TypeManager.setColumns(10);
		item10TypeManager.setText(Menu.foodItems.get(10).getType());
		
		item10CurrentPrice = new JTextField();
		item10CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item10CurrentPrice.setForeground(new Color(0, 0, 139));
		item10CurrentPrice.setEditable(false);
		item10CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item10CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10CurrentPrice.setColumns(10);
		item10CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(10).getPrice()));
		
		item10NewPrice = new JTextField();
		item10NewPrice.setForeground(new Color(0, 0, 139));
		item10NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item10NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10NewPrice.setColumns(10);
		item10Update = new JButton("Update");
		item10Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem10Manager.getText()+ " \t              " 
						 + item10TypeManager.getText() 
						 + " \t\t         " + item10CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(10).getPrice()+ newLine);
				
				String item10Line = menuItem10.getText()+ " \t\t" + item10Qty.getText() 
								 + " \t      " + item10Price.getText() + "\t            $" 
								 + Double.toString(itemPrice10)+ newLine;
				
				try {
					if (item10NewPrice.getText().length()> 0 && Integer.parseInt(item10NewPrice.getText()) > 0){
					
						try {
							Food updateFood = new Food(menuItem10Manager.getText(), 
									   item10TypeManager.getText(), 
									   Double.parseDouble(item10NewPrice.getText()));
									   Menu.foodItems.set(10, updateFood);
			
							thisManager.changePrice(food10, Integer.parseInt(item10NewPrice.getText()));
							item10NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(10).getPrice()));
							item10CurrentPrice.setText(item10NewPrice.getText());
							menuItem10.setText(Menu.foodItems.get(10).getName());
							item10Type.setText(Menu.foodItems.get(10).getType());
							item10Price.setText("$ " + Double.toString(Menu.foodItems.get(10).getPrice()));						
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem10Manager.getText())) {
									String updatedLine = menuItem10Manager.getText()+ " \t              " 
											+ item10TypeManager.getText() 
											+ " \t\t         " + item10CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(10).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem10.getText())) {
									
									if (count10 > 0) {
										double itemPrice10Updated = (Menu.foodItems.get(10).getPrice()) * (Integer.parseInt(item10Qty.getText()));								
									
										subtotal-= itemPrice10 * count10;	
										taxBill -= itemPrice10 * count10 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice10 = (Menu.foodItems.get(10).getPrice()) * (Integer.parseInt(item10Qty.getText()));
										
										subtotal+= itemPrice10Updated * count10;
										subtotal10Track = itemPrice10Updated * count10;
										
										taxBill += itemPrice10Updated * count10 * 0.07;
										tax10Track = itemPrice10Updated * count10 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item10Update = menuItem10.getText()+ " \t\t" + item10Qty.getText() 
						 				   + " \t      " + item10Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice10)+ newLine;
										
										textAreaBill.setText(textAreaBill.getText().replace(item10Line, item10Update));
									}
								}
							}
						}
						catch(NumberFormatException num10) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num10) {
					managerPaneMessage();
				}
			}
		});
		
		item10AddManager = new JButton("Add");
		item10AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem10Manager.getText()+ " \t              " 
									+ item10TypeManager.getText() 
									+ " \t\t         " + item10CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(10).getPrice()+ newLine);
			}
		});
		
		item10RemoveManager = new JButton("Remove");
		item10RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item10RemoveManager.setForeground(new Color(165, 42, 42));
		item10RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line10 = (menuItem10Manager.getText()+ " \t              " 
						 + item10TypeManager.getText() 
						 + " \t\t         " + item10CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(10).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem10Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line10, ""));
					}
				}
			}
		});
		
		menuItem11Manager = new JTextField();
		menuItem11Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem11Manager.setForeground(new Color(0, 0, 139));
		menuItem11Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem11Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem11Manager.setColumns(10);
		menuItem11Manager.setText(Menu.foodItems.get(11).getName());
		
		item11TypeManager = new JTextField();
		item11TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item11TypeManager.setForeground(new Color(0, 0, 139));
		item11TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item11TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11TypeManager.setColumns(10);
		item11TypeManager.setText(Menu.foodItems.get(11).getType());
		
		item11CurrentPrice = new JTextField();
		item11CurrentPrice.setEditable(false);
		item11CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item11CurrentPrice.setForeground(new Color(0, 0, 139));
		item11CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item11CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11CurrentPrice.setColumns(10);
		item11CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(11).getPrice()));
		
		item11NewPrice = new JTextField();
		item11NewPrice.setForeground(new Color(0, 0, 139));
		item11NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item11NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11NewPrice.setColumns(10);		
		
		item11Update = new JButton("Update");
		item11Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem11Manager.getText()+ " \t              " 
						 + item11TypeManager.getText() 
						 + " \t\t         " + item11CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(11).getPrice()+ newLine);
				
				String item11Line = menuItem11.getText()+ " \t\t" + item11Qty.getText() 
								 + " \t      " + item11Price.getText() + "\t            $" 
								 + Double.toString(itemPrice11)+ newLine;
				
				try {
					if (item11NewPrice.getText().length()> 0 && Integer.parseInt(item11NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem11Manager.getText(), 
									   item11TypeManager.getText(), 
									   Double.parseDouble(item11NewPrice.getText()));
										Menu.foodItems.set(11, updateFood);
			
							thisManager.changePrice(food11, Integer.parseInt(item11NewPrice.getText()));
							item11NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(11).getPrice()));
							item11CurrentPrice.setText(item11NewPrice.getText());
							menuItem11.setText(Menu.foodItems.get(11).getName());
							item11Type.setText(Menu.foodItems.get(11).getType());
							item11Price.setText("$ " + Double.toString(Menu.foodItems.get(11).getPrice()));
							
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem11Manager.getText())) {
									String updatedLine = menuItem11Manager.getText()+ " \t              " 
											+ item11TypeManager.getText() 
											+ " \t\t         " + item11CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(11).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem11.getText())) {
									
									if (count11 > 0) {
										double itemPrice11Updated = (Menu.foodItems.get(11).getPrice()) * (Integer.parseInt(item11Qty.getText()));								
									
										subtotal-= itemPrice11 * count11;	
										taxBill -= itemPrice11 * count11 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice11 = (Menu.foodItems.get(11).getPrice()) * (Integer.parseInt(item11Qty.getText()));
										
										subtotal+= itemPrice11Updated * count11;
										subtotal11Track = itemPrice11Updated * count11;
										
										taxBill += itemPrice11Updated * count11 * 0.07;
										tax11Track = itemPrice11Updated * count11 * 0.07;
										
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item11Update = menuItem11.getText()+ " \t\t" + item11Qty.getText() 
						 				   + " \t      " + item11Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice11)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item11Line, item11Update));
									}
								}
							}
						}
						catch(NumberFormatException num11) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();					
					}
				}
				catch(NumberFormatException num11) {
					managerPaneMessage();
				}
			}
		});		
		
		item11AddManager = new JButton("Add");
		item11AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem11Manager.getText()+ " \t              " 
									+ item11TypeManager.getText() 
									+ " \t\t         " + item11CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(11).getPrice()+ newLine);
			}
		});
		
		item11RemoveManager = new JButton("Remove");
		item11RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item11RemoveManager.setForeground(new Color(165, 42, 42));
		item11RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line11 = (menuItem11Manager.getText()+ " \t              " 
						 + item11TypeManager.getText() 
						 + " \t\t         " + item11CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(11).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem11Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line11, ""));
					}
				}
			}
		});
		
		menuItem12Manager = new JTextField();
		menuItem12Manager.setSelectedTextColor(new Color(0, 0, 139));
		menuItem12Manager.setForeground(new Color(0, 0, 139));
		menuItem12Manager.setDisabledTextColor(new Color(0, 0, 139));
		menuItem12Manager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		menuItem12Manager.setColumns(10);
		menuItem12Manager.setText(Menu.foodItems.get(12).getName());
		
		item12TypeManager = new JTextField();
		item12TypeManager.setSelectedTextColor(new Color(0, 0, 139));
		item12TypeManager.setForeground(new Color(0, 0, 139));
		item12TypeManager.setDisabledTextColor(new Color(0, 0, 139));
		item12TypeManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12TypeManager.setColumns(10);
		item12TypeManager.setText(Menu.foodItems.get(12).getType());
		
		item12CurrentPrice = new JTextField();
		item12CurrentPrice.setEditable(false);
		item12CurrentPrice.setSelectedTextColor(new Color(0, 0, 139));
		item12CurrentPrice.setForeground(new Color(0, 0, 139));
		item12CurrentPrice.setDisabledTextColor(new Color(0, 0, 139));
		item12CurrentPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12CurrentPrice.setColumns(10);
		item12CurrentPrice.setText("$ " + Double.toString(Menu.foodItems.get(12).getPrice()));
		
		item12NewPrice = new JTextField();
		item12NewPrice.setForeground(new Color(0, 0, 139));
		item12NewPrice.setDisabledTextColor(new Color(0, 0, 139));
		item12NewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12NewPrice.setColumns(10);
		
		item12Update = new JButton("Update");
		item12Update.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String oldLine = (menuItem12Manager.getText()+ " \t              " 
						 + item12TypeManager.getText() 
						 + " \t\t         " + item12CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(12).getPrice()+ newLine);
				
				String item12Line = menuItem12.getText()+ " \t\t" + item12Qty.getText() 
								 + " \t      " + item12Price.getText() + "\t            $" 
								 + Double.toString(itemPrice12)+ newLine;
				
				try {
					if (item12NewPrice.getText().length()> 0 && Integer.parseInt(item12NewPrice.getText()) > 0){
					
						try {						
							Food updateFood = new Food(menuItem12Manager.getText(), 
									   item12TypeManager.getText(), 
									   Double.parseDouble(item12NewPrice.getText()));
										Menu.foodItems.set(12, updateFood);
			
							thisManager.changePrice(food12, Integer.parseInt(item12NewPrice.getText()));
							item12NewPrice.setText("$ " + Double.toString(Menu.foodItems.get(12).getPrice()));
							item12CurrentPrice.setText(item12NewPrice.getText());
							menuItem12.setText(Menu.foodItems.get(12).getName());
							item12Type.setText(Menu.foodItems.get(12).getType());
							item12Price.setText("$ " + Double.toString(Menu.foodItems.get(12).getPrice()));							
							
							for(String line: textAreaManager.getText().split("\n")) {
								
								if (line.contains(menuItem12Manager.getText())) {
									String updatedLine = menuItem12Manager.getText()+ " \t              " 
											+ item12TypeManager.getText() 
											+ " \t\t         " + item12CurrentPrice.getText() 
											+ "\t            $" +  
											+ Menu.foodItems.get(12).getPrice()+ newLine;
									
								textAreaManager.setText(textAreaManager.getText().replace(oldLine, updatedLine));
								}
							}						
							
							for(String line: textAreaBill.getText().split("\n")) {
								
								if (line.contains(menuItem12.getText())) {
									
									if (count12 > 0) {
										double itemPrice12Updated = (Menu.foodItems.get(12).getPrice()) * (Integer.parseInt(item12Qty.getText()));								
									
										subtotal-= itemPrice12 * count12;	
										taxBill -= itemPrice12 * count12 * 0.07;
										tip = 0;
										textTip.setText("0");
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										itemPrice12 = (Menu.foodItems.get(12).getPrice()) * (Integer.parseInt(item12Qty.getText()));
										
										subtotal+= itemPrice12Updated * count12;	
										subtotal12Track = itemPrice12Updated * count12;
										
										taxBill += itemPrice12Updated * count12 * 0.07;
										tax12Track = itemPrice12Updated * count12 * 0.07;
										
										textTax.setText("$ " + (new DecimalFormat("##.##").format(taxBill)));
										totalBill= taxBill + subtotal;
										textSubtotal.setText("$ " + Double.toString(subtotal));
										textTotal.setText("$ " + (new DecimalFormat("##.##").format(totalBill)));
										
										String item12Update = menuItem12.getText()+ " \t\t" + item12Qty.getText() 
						 				   + " \t      " + item12Price.getText() + "\t            $" 
						 				   + Double.toString(itemPrice12)+ newLine;
										
										 textAreaBill.setText(textAreaBill.getText().replace(item12Line, item12Update));
									}
								}
							}
						}
						catch(NumberFormatException num12) {
							managerPaneMessage();
						}
					}
					
					else {
						managerPaneMessage();
					}
				}
				catch(NumberFormatException num12) {
					managerPaneMessage();
				}
			}
		});
		
		item12AddManager = new JButton("Add");
		item12AddManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12AddManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaManager.append(menuItem12Manager.getText()+ " \t              " 
									+ item12TypeManager.getText() 
									+ " \t\t         " + item12CurrentPrice.getText() 
									+ "\t            $" +  
									+ Menu.foodItems.get(12).getPrice()+ newLine);
			}
		});
		
		item12RemoveManager = new JButton("Remove");
		item12RemoveManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		item12RemoveManager.setForeground(new Color(165, 42, 42));
		item12RemoveManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String line12 = (menuItem12Manager.getText()+ " \t              " 
						 + item12TypeManager.getText() 
						 + " \t\t         " + item12CurrentPrice.getText() 
						 + "\t            $" +  
						 + Menu.foodItems.get(12).getPrice()+ newLine);
				
				for(String line: textAreaManager.getText().split("\n")) {
					
					if (line.contains(menuItem12Manager.getText())) {
						
						textAreaManager.setText(textAreaManager.getText().replace(line12, ""));
					}
				}
			}
		});
		
		lblNewPrice = new JLabel("New");
		lblNewPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		lblUpdate = new JLabel("Change");
		lblUpdate.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		lblPriceManager = new JLabel("Price");
		lblPriceManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		
		separatorPrice = new JSeparator();
		separatorPrice.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);		
		
		JSeparator separator = new JSeparator();
		
		GroupLayout gl_menuPanelManager = new GroupLayout(menuPanelManager);
		gl_menuPanelManager.setHorizontalGroup(
			gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuPanelManager.createSequentialGroup()
					.addContainerGap(398, Short.MAX_VALUE)
					.addComponent(lblPriceManager)
					.addGap(269))
				.addGroup(gl_menuPanelManager.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(menuItem12Manager, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item12TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item12CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item12NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item12Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item12AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item12RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addComponent(separatorMenu, GroupLayout.PREFERRED_SIZE, 660, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addGap(28)
							.addComponent(lblMenuItemsManager)
							.addGap(79)
							.addComponent(lblTypeManager, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(15)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addComponent(separatorPrice, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(lblCurrentPrice, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewPrice)
									.addGap(34)
									.addComponent(lblUpdate)
									.addGap(34)
									.addComponent(lblAddRemoveManager)))
							.addGap(28))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(menuItem6Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item6TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item6CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item6NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item6Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(item6AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item6RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(menuItem7Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(item7TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item7CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(item7NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item7Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(item7AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(item7RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem3Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(item3TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item3CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_menuPanelManager.createSequentialGroup()
											.addComponent(menuItem2Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(item2TypeManager, 0, 0, Short.MAX_VALUE))
										.addGroup(gl_menuPanelManager.createSequentialGroup()
											.addComponent(menuItem1Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(item1TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(item1CurrentPrice, 0, 0, Short.MAX_VALUE)
										.addComponent(item2CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))))
							.addGap(18)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addComponent(item1NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(item2NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(item3NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.TRAILING)
									.addComponent(item1Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addComponent(item2Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
								.addComponent(item3Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item1AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item1RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_menuPanelManager.createSequentialGroup()
										.addComponent(item3AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(item3RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
									.addGroup(gl_menuPanelManager.createSequentialGroup()
										.addComponent(item2AddManager)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(item2RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem11Manager, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(item11TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item11CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem10Manager, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(item10TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item10CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem9Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(item9TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item9CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem8Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(item8TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item8CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addComponent(item8NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(item9NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(item10NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
								.addComponent(item11NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addComponent(item8Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(item9Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(item10Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
								.addComponent(item11Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item11AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item11RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item8AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item8RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item9AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item9RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item10AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item10RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem4Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(item4TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item4CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(menuItem5Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(item5TypeManager, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(item5CurrentPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item5NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item5Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(item5AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item5RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addComponent(item4NewPrice, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item4Update, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(item4AddManager, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(item4RemoveManager, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
				.addGroup(gl_menuPanelManager.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_menuPanelManager.setVerticalGroup(
			gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_menuPanelManager.createSequentialGroup()
					.addContainerGap()
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(lblPriceManager)
							.addGap(4)
							.addComponent(separatorPrice, GroupLayout.PREFERRED_SIZE, 11, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblCurrentPrice, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addGap(11)
									.addComponent(lblNewPrice))
								.addGroup(gl_menuPanelManager.createSequentialGroup()
									.addGap(11)
									.addComponent(lblUpdate)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(lblAddRemoveManager)
							.addGap(12))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(lblTypeManager)
							.addGap(12))
						.addGroup(gl_menuPanelManager.createSequentialGroup()
							.addComponent(lblMenuItemsManager)
							.addGap(12)))
					.addComponent(separatorMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(item1TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item1CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(menuItem1Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item1AddManager)
						.addComponent(item1RemoveManager)
						.addComponent(item1NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item1Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(item2TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item2CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(menuItem2Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item2AddManager)
						.addComponent(item2RemoveManager)
						.addComponent(item2NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item2Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem3Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3AddManager)
						.addComponent(item3RemoveManager)
						.addComponent(item3NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item3Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem4Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4AddManager)
						.addComponent(item4RemoveManager)
						.addComponent(item4NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item4Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem5Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5AddManager)
						.addComponent(item5RemoveManager)
						.addComponent(item5NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item5Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem6Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6AddManager)
						.addComponent(item6RemoveManager)
						.addComponent(item6NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item6Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem7Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7AddManager)
						.addComponent(item7RemoveManager)
						.addComponent(item7NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item7Update))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem8Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item8TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
							.addComponent(item8CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item8AddManager)
							.addComponent(item8RemoveManager)
							.addComponent(item8NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item8Update)))
					.addGap(9)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem9Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item9TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
							.addComponent(item9CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item9AddManager)
							.addComponent(item9RemoveManager)
							.addComponent(item9NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item9Update)))
					.addGap(9)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
						.addComponent(menuItem10Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item10TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item10CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item10AddManager)
						.addComponent(item10RemoveManager)
						.addComponent(item10NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item10Update))
					.addGap(9)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem11Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(item11TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
							.addComponent(item11CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item11AddManager)
							.addComponent(item11RemoveManager)
							.addComponent(item11NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item11Update)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.LEADING)
						.addComponent(menuItem12Manager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_menuPanelManager.createParallelGroup(Alignment.BASELINE)
							.addComponent(item12TypeManager, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item12CurrentPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item12NewPrice, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(item12Update)
							.addComponent(item12AddManager)
							.addComponent(item12RemoveManager)))
					.addGap(47))
		);
		menuPanelManager.setLayout(gl_menuPanelManager);
		
		JScrollPane scrollPaneManager = new JScrollPane();
		GroupLayout gl_managerTab = new GroupLayout(managerTab);
		gl_managerTab.setHorizontalGroup(
			gl_managerTab.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_managerTab.createSequentialGroup()
					.addGap(298)
					.addComponent(lblCurrentMenu)
					.addPreferredGap(ComponentPlacement.RELATED, 525, Short.MAX_VALUE)
					.addComponent(lblUpdatedMenu, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGap(187))
				.addGroup(gl_managerTab.createSequentialGroup()
					.addGap(16)
					.addComponent(menuPanelManager, GroupLayout.PREFERRED_SIZE, 697, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(scrollPaneManager, GroupLayout.PREFERRED_SIZE, 498, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(16, Short.MAX_VALUE))
		);
		gl_managerTab.setVerticalGroup(
			gl_managerTab.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_managerTab.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_managerTab.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCurrentMenu, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUpdatedMenu, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_managerTab.createParallelGroup(Alignment.LEADING)
						.addComponent(scrollPaneManager, GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
						.addComponent(menuPanelManager, GroupLayout.PREFERRED_SIZE, 558, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		textAreaManager = new JTextArea();
		textAreaManager.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPaneManager.setViewportView(textAreaManager);
		textAreaManager.append(" Menu Item\t             Menu Type\t   Current Price\t         New Price" + newLine);
		textAreaManager.append("--------------------------------------------------------------" + newLine);
		
		managerTab.setLayout(gl_managerTab);
		tabbedPane.setBackgroundAt(1, SystemColor.textHighlight);
		tabbedPane.setForegroundAt(1, SystemColor.controlHighlight);
		tabbedPane.setEnabledAt(1, true);
		contentPane.setLayout(gl_contentPane);
	}


	private void customerPaneMessage() {
		
		JFrame  frame = new JFrame();		
		JOptionPane.showMessageDialog(frame, "Please enter a positive quantity in numeric format");
	}
	
	private void managerPaneMessage() {
		
		JFrame  frame = new JFrame();	
		JOptionPane.showMessageDialog(frame, "Please enter a positive new price in numeric format");
		
	}
}

