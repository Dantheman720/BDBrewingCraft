package brewcomponents;

import javax.xml.bind.annotation.XmlElement;

import dataholder.TypeOfIngredient;
 

public class Grain implements Brewable {

	private String gName;
	private double gPotential;
	private double gYield;
	private double gSRM;
	private String additionalNotes = null;
	private double diastaticPower;
	private double maxPercentInBatch;
	private double proteinContent;
	private TypeOfIngredient type;

	public Grain(String name, double potential, double yield, double SRM) {
		gName = name;
		gPotential = potential;
		gYield = yield;
		gSRM = SRM;
		type = TypeOfIngredient.GRAIN;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return gName;
	}

	@Override
	public String getAdditionalNotes() {
		// TODO Auto-generated method stub
		return additionalNotes;
	}

	/**
	 * @return the gPotential
	 */
	public double getgPotential() {
		return gPotential;
	}

	/**
	 * @param gPotential the gPotential to set
	 */
	public void setgPotential(double gPotential) {
		this.gPotential = gPotential;
	}

	/**
	 * @return the gYield
	 */
	public double getgYield() {
		return gYield;
	}

	/**
	 * @param gYield the gYield to set
	 */
	@XmlElement
	public void setgYield(double gYield) {
		this.gYield = gYield;
	}

	/**
	 * @return the gSRM
	 */
	public double getgSRM() {
		return gSRM;
	}

	/**
	 * @param gSRM the gSRM to set
	 */
	public void setgSRM(double gSRM) {
		this.gSRM = gSRM;
	}

	/**
	 * @return the diastaticPower
	 */
	public double getDiastaticPower() {
		return diastaticPower;
	}

	/**
	 * @param diastaticPower the diastaticPower to set
	 */
	public void setDiastaticPower(double diastaticPower) {
		this.diastaticPower = diastaticPower;
	}

	/**
	 * @return the maxPercentInBatch
	 */
	public double getMaxPercentInBatch() {
		return maxPercentInBatch;
	}

	/**
	 * @param maxPercentInBatch the maxPercentInBatch to set
	 */
	public void setMaxPercentInBatch(double maxPercentInBatch) {
		this.maxPercentInBatch = maxPercentInBatch;
	}

	/**
	 * @return the proteinContent
	 */
	public double getProteinContent() {
		return proteinContent;
	}

	/**
	 * @param proteinContent the proteinContent to set
	 */
	public void setProteinContent(double proteinContent) {
		this.proteinContent = proteinContent;
	}

	/**
	 * @return the type
	 */
	public TypeOfIngredient getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(TypeOfIngredient type) {
		this.type = type;
	}

	/**
	 * @param additionalNotes the additionalNotes to set
	 */
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}

	public String toString(){
		
		return "Grain Name: " + gName + " Potential: " + gPotential + " Yield "
				+ gYield + "% SRM: " + gSRM;
	}
	
}
