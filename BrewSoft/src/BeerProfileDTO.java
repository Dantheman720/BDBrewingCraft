import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;

import brewcomponents.Grain;
import brewcomponents.Hop;
import brewcomponents.Yeast;

public class BeerProfileDTO {

	private String beerName;
	private ArrayList<Hop> hopList;
	private ArrayList<Grain> grainList;
	private ArrayList<Yeast> yeastList;
	private String boilSize;
	private String finalColor;
	private String batchSize;
	private String typeOfFermentation;
	private String alcoholByVolume;
	private String estOriginalGrav;
	private String typeOfBeer;
	private int boilTime;
	private String additionalNotes;
	

	public BeerProfileDTO(String name) {

		beerName = name;
	}


	
	public String toString() {
		// Needs to be implemented...
		return null;

	}

}
