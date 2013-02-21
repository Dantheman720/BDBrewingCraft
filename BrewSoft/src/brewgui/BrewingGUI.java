package brewgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class BrewingGUI {

	private JFrame BDHopworks = new JFrame("BDHopworks Brewcrafter");
	private JRootPane danPane = new JRootPane();
	
	private JMenuBar mb = new JMenuBar();// Menu Bar
	private JMenu mnuFile = new JMenu("File"); // File Entry on Menu bar
	private JMenuItem mnuItemCreateRecipe = new JMenuItem("Create New Recipe"); //Create a New Recipe
	private JMenuItem mnuItemQuit = new JMenuItem("Quit"); // Quit sub item
	private JMenu mnuHelp = new JMenu("Help"); // Help Menu entry
	private JMenuItem mnuItemAbout = new JMenuItem("About"); // About Entry
	private JTextComponent dan = new JTextField("Head Brewer");
	
	
	public BrewingGUI() {

		// Create the menubar

		BDHopworks.setJMenuBar(mb);
		mnuItemAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BrewingGUI gui = new BrewingGUI();
				gui.createNewRecipe();
				
			}
		});
		// Create the menu items
		mnuFile.add(mnuItemCreateRecipe); // Create new recipe line
		mnuFile.add(mnuItemQuit); // Create Quit line
		mnuHelp.add(mnuItemAbout); // Create About line

		mb.add(mnuFile); // Add Menu items to form

		mb.add(mnuHelp);

	}

	public void launchFrame() {
		BDHopworks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BDHopworks.pack();
		BDHopworks.reshape(100, 50, 500, 700);
		BDHopworks.setVisible(true);
	}
	
	public void createNewRecipe(){
		BDHopworks.add(dan);
		BDHopworks.setVisible(true);

		
	}

	

}
