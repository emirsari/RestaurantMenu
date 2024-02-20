public class Food{
	
	// text coloring
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_RED = "\u001b[38;5;209m";
	public static final String ANSI_PURPLE = "\u001b[38;5;117m";
	public static final String ANSI_GOLD = "\u001b[38;5;220m";
			
	public String name;
	public IngredientsLinkedList ingredients; 
	private FoodKind kind; 
	public ContentWarningLinkedList contentWarning; 
	public double cost;

	// default constructor
	public Food() {
		name = null;
		ingredients = null;
		kind = null;
		contentWarning = null;
		cost = 0.0;
	}
	
	
	public Food(String name, IngredientsLinkedList ingredients, FoodKind kind,
			ContentWarningLinkedList contentWarning, double cost){
		
		this.name = name;
		this.ingredients = ingredients;
		this.kind = kind;
		this.contentWarning = contentWarning;
		this.cost = cost;
	}

	public FoodKind getFoodKind() {
		return kind;
	}

	public void setFoodKind(FoodKind kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return ANSI_GREEN + name + ANSI_RESET + " " + ANSI_GOLD + "$" + cost + ANSI_RESET + "\n\t\t\t" + ANSI_PURPLE + "Ingredients: " +
				ANSI_RESET + ingredients.printData() + (((contentWarning != null) && (contentWarning.size > 0) ? "\n\t\t\t"+ ANSI_RED + "Content Warnings: "+ ANSI_RESET + contentWarning.printData():")"));
	}
	
}
