import brewcomponents.Grain;
import brewgui.BrewingGUI;


public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Grain dan = new Grain("2-Row Malt", 1.036, 77.9, 2);
		dan.setAdditionalNotes("The Base malt for all beers");
		System.out.println(dan);
		*/
		
		BrewingGUI dan = new BrewingGUI();
		dan.launchFrame();
	}

}
