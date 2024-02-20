public class Drink extends Food {

	private DrinkKind kind; 
	
	public Drink() {
		name = null;
		ingredients = null;
		kind = null;
		contentWarning = null;
		cost = 0.0;
	}

	public Drink(String name, IngredientsLinkedList ingredients, DrinkKind kind, 
			ContentWarningLinkedList contentWarning, double cost) {
		this.name = name;
		this.ingredients = ingredients;
		this.kind = kind;
		this.contentWarning = contentWarning;
		this.cost = cost;
	}

	
	public DrinkKind getDrinkKind(){
		return kind;
	}

	public void setDrinkKind(DrinkKind kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		return ANSI_GREEN + name + ANSI_RESET + " " + ANSI_GOLD + "$" + cost + ANSI_RESET + "\n\t\t\t" + ANSI_PURPLE + "Ingredients: " +
	ANSI_RESET + ingredients.printData() + (((contentWarning != null) && (contentWarning.size > 0) ? "\n\t\t\t"+ ANSI_RED + "Content Warnings: "+ ANSI_RESET + contentWarning.printData():")"));
	}
	
}
