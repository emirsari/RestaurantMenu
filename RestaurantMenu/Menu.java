import java.util.ArrayList;

public class Menu {

	// Text coloring
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BOLD = "\u001b[1m";
	
	public ArrayList<Food>[] foodMenu = new ArrayList[11]; // food kinds = array size
	public ArrayList<Drink>[] drinkMenu = new ArrayList[9]; // drink kinds = array size


	// default constructor
	public Menu() {

	}

	// create menu
	public void printMenu(FoodTree foodTree, DrinkTree drinkTree) {

		//pre-generation to prevent errors
		for (int i = 0; i < foodMenu.length; i++) {
			foodMenu[i] = new ArrayList<Food>();
		}

		//pre-generation to prevent errors
		for (int i = 0; i < drinkMenu.length; i++) {
			drinkMenu[i] = new ArrayList<Drink>();
		}

		// traverse both trees, add each item to ArrayLists
		preorderFoodTree(foodTree.root);
		preorderDrinkTree(drinkTree.root);

		System.out.println(ANSI_BOLD + "FOODS" + ANSI_RESET);

		for (int i = 0; i < foodMenu.length; i++) {

			if(FoodKind.values()[i].name().contains("_")) {
				System.out.println("\t" + FoodKind.values()[i].name().replace("_"," "));
			}else {
				System.out.println("\t" + FoodKind.values()[i]);
			}

			for (int j = 0; j < foodMenu[i].size(); j++) {

				System.out.println("\t\t- " + foodMenu[i].get(j).toString());
			}
		}

		System.out.println(ANSI_BOLD + "\nDRINKS" + ANSI_RESET);

		for (int i = 0; i < drinkMenu.length; i++) {
			
			if(DrinkKind.values()[i].name().contains("_")) {
				System.out.println("\t" + DrinkKind.values()[i].name().replace("_"," "));
			}else {
				System.out.println("\t" + DrinkKind.values()[i]);
			}
			
			for (int j = 0; j < drinkMenu[i].size(); j++) {

				System.out.println("\t\t- " + drinkMenu[i].get(j).toString());
			}
		}

	}

	// Recursive tree traversal
	public void preorderFoodTree(FoodTreeNode t) { // send tree root
		// root - left - right
		if (t == null)
			return;

		addMenu(t.getFood(), null);

		preorderFoodTree(t.leftChild);
		preorderFoodTree(t.rightChild);

	}

	// Recursive tree traversal
	public void preorderDrinkTree(DrinkTreeNode t) { // send tree root
		// root - left - right
		if (t == null)
			return;

		addMenu(null, t.getDrink());

		preorderDrinkTree(t.leftChild);
		preorderDrinkTree(t.rightChild);

	}

	public void addMenu(Food food, Drink drink) {

		if (food != null) {
			int foodIndex = food.getFoodKind().ordinal();
			foodMenu[foodIndex].add(food);
		} else {
			int drinkIndex = drink.getDrinkKind().ordinal();
			drinkMenu[drinkIndex].add(drink);
		}

	}
}
