package brewcomponents;

import dataholder.TypeOfIngredient;

public interface Brewable {

	public String getName();

	public String getAdditionalNotes();

	public TypeOfIngredient getType();
}
