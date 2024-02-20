import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

		// Begin Populate Menu
		Menu menu = new Menu(); // create menu
		FoodTree foods = new FoodTree(); // create food tree
		DrinkTree drinks = new DrinkTree(); // create drink tree

		// --- FOODS ---

		// --Breakfast--
		Food f1 = new Food("Panini Toast", new IngredientsLinkedList(new String[] { "Tomatoes", "White Cheese" }),
				FoodKind.BREAKFAST,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY, ContentWarnings.LACTOSE }),
				5.99);

		Food f2 = new Food("Menemen", new IngredientsLinkedList(new String[] { "Tomato", "Pepper", "Eggs" }),
				FoodKind.BREAKFAST,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE, ContentWarnings.EGG }),
				9.99);

		Food f3 = new Food("Mushroom Omelette", new IngredientsLinkedList(new String[] { "Three Eggs", "Mushrooms" }),
				FoodKind.BREAKFAST,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.SOY, ContentWarnings.EGG }),
				12.00);
		// --Starters--
		Food f4 = new Food("Chicken in London",
				new IngredientsLinkedList(
						new String[] { "Chicken Strips", "Cajun Spices", "French Fries", "Honey Mustard Sauce" }),
				FoodKind.STARTER,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.EGG,
						ContentWarnings.LACTOSE, ContentWarnings.MUSTARD, ContentWarnings.CELERY }),
				16.99);

		Food f5 = new Food("Mac and Cheese",
				new IngredientsLinkedList(new String[] { "Elbows Macaroni", "Cheese Sauce", "Jalapeno Peppers",
						"Mexican Beans", "Spicy Bolognese Sauce", "Fried Tortilla Chips" }),
				FoodKind.STARTER,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.EGG, ContentWarnings.LACTOSE }),
				18.00);

		Food f6 = new Food("Onion Rings",
				new IngredientsLinkedList(new String[] { "Ten Onion Rings", "Asianda Sauce" }), FoodKind.STARTER,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.EGG }), 6.49);
		// --Salad--
		Food f7 = new Food("Caesar Salad",
				new IngredientsLinkedList(
						new String[] { "Lettuce Leaves", "Cherry Tomatoes", "Croutons", "Caesar Sauce", "Parmesan" }),
				FoodKind.SALAD, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.LACTOSE, ContentWarnings.EGG, ContentWarnings.SESAME }),
				11.99);

		Food f8 = new Food("Tuna Salad", new IngredientsLinkedList(
				new String[] { "Tuna", "Tomato", "Cucumber", "Black Olives", "Corn", "Olive Oil", "Lemon Sauce" }),
				FoodKind.SALAD, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.EGG, ContentWarnings.SESAME, ContentWarnings.FISH }),
				14.99);

		Food f9 = new Food("Cereal Salad",
				new IngredientsLinkedList(new String[] { "Wheat", "Cherry Tomato", "Strawberry", "Raisin", "Dried Fig",
						"Dried Apricot", "Orange", "Curd Cheese", "Walnut", "Mint", "Pomegranate Sauce" }),
				FoodKind.SALAD,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE, ContentWarnings.EGG,
								ContentWarnings.SESAME, ContentWarnings.CRUSTACEAN, ContentWarnings.SULFUR_DIOXIDE }),
				19.99);
		// --Burger--
		Food f10 = new Food("Mappy Hoon’s Burger",
				new IngredientsLinkedList(new String[] { "Burger Meat (180gr)", "Burger Sauce",
						"Warm Sauce with Mushroom and Cream", "Crispy Onion", "Cheddar Cheese", "French Fries" }),
				FoodKind.BURGER,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY, ContentWarnings.LACTOSE,
								ContentWarnings.EGG, ContentWarnings.SESAME, ContentWarnings.MUSTARD }),
				22.99);

		Food f11 = new Food("Colorado Burger",
				new IngredientsLinkedList(new String[] { "Tortilla Bread", "Burger Meat (180gr)", "Burger Sauce",
						"Mushroom", "Caramelized Onion", "Cheddar Cheese", "French Fries" }),
				FoodKind.BURGER,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE,
						ContentWarnings.EGG, ContentWarnings.SESAME, ContentWarnings.MUSTARD }),
				23.99);

		Food f12 = new Food("Vegan Burger",
				new IngredientsLinkedList(new String[] { "Vegan Burger Bread", "Vegan Meat (100 gr)", "Ketchup Pickles",
						"Lettuce", "Baked Potato" }),
				FoodKind.BURGER, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN }), 27.99);
		// --Mexican---
		Food f13 = new Food("Nachos Chili Con Carne",
				new IngredientsLinkedList(new String[] { "Fried Tortilla", "Chili Con Carne", "Sour Cream Sauce",
						"Cheddar Sauce", "Hot Sauce", "Guacamole", "Mexican Beans", "Jalapeno Peppers", "Coriander" }),
				FoodKind.MEXICAN, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.LACTOSE, ContentWarnings.LUPIN, ContentWarnings.CELERY }),
				21.99);

		Food f14 = new Food("Beef Burritos",
				new IngredientsLinkedList(new String[] { "Sauteed Onions", "Tortilla Bread", "Colored Peppers", "Steak",
						"Kashar Cheese", "Cheddar Cheese", "Sour Cream Sauce", "Corn Cake", "French Fries",
						"Mexican Rice", "Ranchero Sauce" }),
				FoodKind.MEXICAN,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY, ContentWarnings.LACTOSE,
								ContentWarnings.EGG, ContentWarnings.MUSTARD, ContentWarnings.CELERY }),
				21.49);

		Food f15 = new Food("Steak Fajitas",
				new IngredientsLinkedList(new String[] { "Grilled Steak", "Onion", "Colored Peppers",
						"Sour Cream Sauce", "Salsa Sauce", "Avocado Puree", "Four Tortillas" }),
				FoodKind.MEXICAN,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY, ContentWarnings.LACTOSE }),
				23.49);
		// --Pasta--
		Food f16 = new Food("Spaghetti Bolognese",
				new IngredientsLinkedList(
						new String[] { "Bolognese Sauce", "Ground Meat", "Pesto Sauce", "Garlic", "Parmesan" }),
				FoodKind.PASTA,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE,
						ContentWarnings.EGG, ContentWarnings.CRUSTACEAN, ContentWarnings.CELERY }),
				14.49);

		Food f17 = new Food("Kayseri Ravioli",
				new IngredientsLinkedList(new String[] { "Fresh Mint", "Yogurt", "Butter Sauce" }), FoodKind.PASTA,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE,
						ContentWarnings.EGG, ContentWarnings.CELERY }),
				15.49);

		Food f18 = new Food("Veggie Noodle",
				new IngredientsLinkedList(new String[] { "Mushrooms", "Zucchini", "Carrots", "Broccoli",
						"Colored Peppers", "Spring Onions", "Sesame Seeds", "Noodle Sauce" }),
				FoodKind.PASTA, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.SOY, ContentWarnings.EGG, ContentWarnings.SESAME }),
				18.49);
		// --Main Course--
		Food f19 = new Food(
				"Arizona Chicken", new IngredientsLinkedList(new String[] { "Grilled Chicken Drumsticks",
						"Sweet Chilli Sauce", "French Fries", "Broccoli", "Roasted Capia Pepper" }),
				FoodKind.MAIN_COURSE,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY,
						ContentWarnings.LACTOSE, ContentWarnings.EGG, ContentWarnings.SESAME,
						ContentWarnings.CRUSTACEAN, ContentWarnings.MUSTARD, ContentWarnings.CELERY }),
				22.00);

		Food f20 = new Food("Chicken Tikka Masala",
				new IngredientsLinkedList(new String[] { "Marinated Chicken Breast", "Aromatic Tikka Spice",
						"Saffron Rice", "Sauteed Vegetables", "French Fries" }),
				FoodKind.MAIN_COURSE,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY, ContentWarnings.LACTOSE,
								ContentWarnings.EGG, ContentWarnings.SESAME, ContentWarnings.CRUSTACEAN,
								ContentWarnings.MUSTARD, ContentWarnings.CELERY, ContentWarnings.SULFUR_DIOXIDE }),
				26.99);

		Food f21 = new Food("Fish & Chips",
				new IngredientsLinkedList(
						new String[] { "Breaded Haddock", "French Fries", "Purple Onion", "Tartar Sauce" }),
				FoodKind.MAIN_COURSE,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.LACTOSE, ContentWarnings.EGG, ContentWarnings.FISH }),
				22.49);

		Food f22 = new Food("Hoon’s Style Grilled Meatball",
				new IngredientsLinkedList(new String[] {
						"Meatball", "French Fries", "Sauteed vegetables", "Tortilla", "Grilled Tomato", "Peppers" }),
				FoodKind.MAIN_COURSE,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.EGG, ContentWarnings.CELERY }),
				27.99);
		// --Pizza--
		Food f23 = new Food("Margherita Pizza",
				new IngredientsLinkedList(new String[] { "Mozzarella", "Tomato sauce" }), FoodKind.PIZZA,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE }),
				13.99);

		Food f24 = new Food("Happy Pizza",
				new IngredientsLinkedList(new String[] { "Mozzarella", "Tomato Sauce", "Turkish Fermented Sausage",
						"Mushrooms", "Black Olives", "Green Pepper", "Tomatoes", "Corn" }),
				FoodKind.PIZZA,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.SOY, ContentWarnings.LACTOSE }),
				16.00);

		Food f25 = new Food("Tuna Pizza",
				new IngredientsLinkedList(
						new String[] { "Mozzarella", "Tomato Sauce", "Tuna", "Corn", "Tomatoes", "Black Olives" }),
				FoodKind.PIZZA, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.LACTOSE, ContentWarnings.FISH }),
				18.00);
		// --Wrap--
		Food f26 = new Food("Chicken Wrap",
				new IngredientsLinkedList(new String[] { "Sauteed Chicken Steak Slices", "Mushrooms", "Onions",
						"Colored Peppers", "French Fries", "Tomato", "Cucumber" }),
				FoodKind.WRAP,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE }),
				13.99);

		Food f27 = new Food("Spinach Crepe",
				new IngredientsLinkedList(
						new String[] { "Sauteed Spinach", "Bechamel sauce", "Cream", "Kashar cheese" }),
				FoodKind.WRAP,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE, ContentWarnings.EGG }),
				12.49);
		// --Light Meal--
		Food f28 = new Food("FIT Chicken Shish with Mung Beans",
				new IngredientsLinkedList(new String[] { "200 gr. Grilled Chicken Shish", "Lettuce",
						"Mung Beans Tabbouleh", "Grilled Capia Peppers", "Caciki" }),
				FoodKind.LIGHT_MEAL,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE, ContentWarnings.LUPIN }),
				15.99);

		Food f29 = new Food("FIT Chicken with Asparagus",
				new IngredientsLinkedList(
						new String[] { "100 gr. Chicken Breast", "Kashar Cheese", "Asparagus", "Boiled Vegetables" }),
				FoodKind.LIGHT_MEAL, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE }),
				13.49);
		// --Dessert--
		Food f30 = new Food("Everest",
				new IngredientsLinkedList(new String[] { "Brownie Cubes", "Fresh Strawberries", "Special Cream" }),
				FoodKind.DESSERT, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.LACTOSE, ContentWarnings.EGG, ContentWarnings.CRUSTACEAN }),
				10.49);

		Food f31 = new Food("Lotus Cup",
				new IngredientsLinkedList(new String[] { "Lotus Cream", "Lotus Biscuit", "Caramel Sauce" }),
				FoodKind.DESSERT,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE, ContentWarnings.EGG }),
				11.99);

		Food f32 = new Food("Chocolate Tower",
				new IngredientsLinkedList(
						new String[] { "Dark Chocolate Ganache Cream", "Chocolate Cake", "Truffle Covered in Cream" }),
				FoodKind.DESSERT,
				new ContentWarningLinkedList(
						new ContentWarnings[] { ContentWarnings.GLUTEN, ContentWarnings.LACTOSE, ContentWarnings.EGG }),
				12.49);

		Food f33 = new Food("Waffle Cup",
				new IngredientsLinkedList(new String[] { "Waffles", "Chocolate Sauce", "Pastry Cream", "Banana",
						"Strawberry", "Plain Ice Cream" }),
				FoodKind.DESSERT, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.GLUTEN,
						ContentWarnings.LACTOSE, ContentWarnings.EGG, ContentWarnings.CRUSTACEAN }),
				12.00);

		// --- DRINKS ---

		// --Hot Coffee--
		Drink d1 = new Drink("Caramel Macchiato",
				new IngredientsLinkedList(
						new String[] { "Espresso", "Vanilla Syrup", "Steamed Milk", "Regular Foam", "Caramel Sauce" }),
				DrinkKind.HOT_COFFEE,
				new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE, ContentWarnings.SOY }),
				4.49);

		Drink d2 = new Drink("Vanilla Latte",
				new IngredientsLinkedList(new String[] { "Espresso", "Vanilla Syrup", "Steamed Milk", "Regular Foam" }),
				DrinkKind.HOT_COFFEE, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE }),
				3.49);

		Drink d3 = new Drink("Cappuccino",
				new IngredientsLinkedList(new String[] { "Espresso", "Steamed Milk", "Regular Foam" }),
				DrinkKind.HOT_COFFEE, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE }),
				3.00);
		// --Iced Coffee--
		Drink d4 = new Drink("Cold Brew",
				new IngredientsLinkedList(new String[] { "Roasted Ground Coffee", "Water", "Ice" }),
				DrinkKind.ICED_COFFEE, new ContentWarningLinkedList(new ContentWarnings[] {}), 3.99);

		Drink d5 = new Drink("Iced Caffè Mocha",
				new IngredientsLinkedList(
						new String[] { "Espresso", "Semi-Skimmed Milk", "Whipped Cream", "Mocha Sauce", "Ice" }),
				DrinkKind.ICED_COFFEE, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE }),
				4.99);
		// --Hot Tea--
		Drink d6 = new Drink("Herbal And Fruit Tea",
				new IngredientsLinkedList(new String[] { "Early Grey", "Strawberry Tea", "Red Forest Tea",
						"Caramel Tea", "Apple Cinnamon Tea", "Linden Tea", "Rosehip Tea", "Green Tea" }),
				DrinkKind.HOT_TEA, new ContentWarningLinkedList(new ContentWarnings[] {}), 5.99);

		Drink d7 = new Drink("Chai Tea",
				new IngredientsLinkedList(
						new String[] { "Black Tea", "Cinnamon", "Cardamom", "Cloves", "Ginger", "Black Peppercorns" }),
				DrinkKind.HOT_TEA, new ContentWarningLinkedList(new ContentWarnings[] {}), 4.49);
		// --Iced Tea--
		Drink d8 = new Drink("Iced Chai Tea", new IngredientsLinkedList(
				new String[] { "Black Tea", "Cinnamon", "Cardamom", "Cloves", "Ginger", "Black Peppercorns", "Ice" }),
				DrinkKind.ICED_TEA, new ContentWarningLinkedList(new ContentWarnings[] {}), 4.49);
		// --Lemonade--
		Drink d9 = new Drink("Passion Lemonade",
				new IngredientsLinkedList(new String[] { "Lemon", "Passion Fruit", "Ice" }), DrinkKind.LEMONADE,
				new ContentWarningLinkedList(new ContentWarnings[] {}), 4.99);

		Drink d10 = new Drink("Lemonade", new IngredientsLinkedList(new String[] { "Lemon", "Ice" }),
				DrinkKind.LEMONADE, new ContentWarningLinkedList(new ContentWarnings[] {}), 3.49);
		// --Generic--
		Drink d11 = new Drink("Water", new IngredientsLinkedList(new String[] { "Hydrogen", "Oxygen" }),
				DrinkKind.GENERIC, new ContentWarningLinkedList(new ContentWarnings[] {}), 1.49);

		Drink d12 = new Drink("Coca-Cola", new IngredientsLinkedList(new String[] { "Sugar", "Dissolved CO2" }),
				DrinkKind.GENERIC, new ContentWarningLinkedList(new ContentWarnings[] {}), 2.00);

		Drink d13 = new Drink("Sprite", new IngredientsLinkedList(new String[] { "Sugar", "Dissolved CO2" }),
				DrinkKind.GENERIC, new ContentWarningLinkedList(new ContentWarnings[] {}), 2.00);

		Drink d14 = new Drink("Ayran", new IngredientsLinkedList(new String[] { "Milk" }), DrinkKind.GENERIC,
				new ContentWarningLinkedList(new ContentWarnings[] {}), 1.99);

		Drink d15 = new Drink("Apple Juice",
				new IngredientsLinkedList(new String[] { "Apple", "Sugar", "Water", "Ice", "Lemon Juice" }),
				DrinkKind.GENERIC, new ContentWarningLinkedList(new ContentWarnings[] {}), 2.49);

		Drink d16 = new Drink("Mineral Water",
				new IngredientsLinkedList(new String[] { "Minerals", "Hydrogen", "Oxygen" }), DrinkKind.GENERIC,
				new ContentWarningLinkedList(new ContentWarnings[] {}), 1.99);
		// --Milkshake--
		Drink d17 = new Drink("Vanilla Milkshake", new IngredientsLinkedList(new String[] { "Vanilla", "Milk", "Ice" }),
				DrinkKind.MILKSHAKE, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE }),
				3.99);

		Drink d18 = new Drink("Kiwi Milkshake", new IngredientsLinkedList(new String[] { "Kiwi", "Milk", "Ice" }),
				DrinkKind.MILKSHAKE, new ContentWarningLinkedList(new ContentWarnings[] { ContentWarnings.LACTOSE }),
				4.49);
		// --Virgin Cocktail--
		Drink d19 = new Drink("Red Bull Twist",
				new IngredientsLinkedList(new String[] { "Orange", "Lime", "Soda", "Red Bull White Edition" }),
				DrinkKind.VIRGIN_COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 6.49);

		Drink d20 = new Drink("Yuki Mojito",
				new IngredientsLinkedList(new String[] { "Mint", "Lemon Juice", "Sugar Syrup", "Red Bull Sugarfree" }),
				DrinkKind.VIRGIN_COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 6.99);
		// --Cocktail--
		Drink d21 = new Drink("Welcome To The Jungle",
				new IngredientsLinkedList(new String[] { "Vodka", "Red Bull Energy Drink", "Rosemary",
						"Mashed Red Berries", "Sweet & Sour Mix" }),
				DrinkKind.COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 22.12);

		Drink d22 = new Drink("Cosmopolitan",
				new IngredientsLinkedList(new String[] { "Vodka Citron", "Cointreau", "Red Berries" }),
				DrinkKind.COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 19.99);

		Drink d23 = new Drink("Lynchburg Lemonade",
				new IngredientsLinkedList(new String[] { "Jack Daniel’s", "Curaçao", "Sweet & Sour Mix", "Sprite" }),
				DrinkKind.COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 24.99);

		Drink d24 = new Drink("Long Island Ice Tea",
				new IngredientsLinkedList(new String[] { "Vodka", "Gin", "Rum", "Tequila", "Curaçao",
						"Sweet & Sour Mix", "Coca Cola Classic / Fruity" }),
				DrinkKind.COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 29.99);

		Drink d25 = new Drink("Health Potion +100 HP",
				new IngredientsLinkedList(
						new String[] { "Mappy Hoons Special Electrons", "Refreshing Red Fruit Syrup" }),
				DrinkKind.COCKTAIL, new ContentWarningLinkedList(new ContentWarnings[] {}), 999.99);

		foods.multipleInsert(new Food[] { f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, f15, f16, f17,
				f18, f19, f20, f21, f22, f23, f24, f25, f26, f27, f28, f29, f30, f31, f32, f33 });
		drinks.multipleInsert(new Drink[] { d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, d17,
				d18, d19, d20, d21, d22, d23, d24, d25 });
		// End Populate Menu

		// User Prompts
		System.out.println("\n");
		Scanner in = new Scanner(System.in); // begin Scanner
		System.out.println("Welcome to Mappy Hoons !\n");
		System.out.println("Choose action \n1-Display Menu\n2-Search Food/Drink\n3-Place Order\n4-Exit");

		int menuSelection = 0;

		while (menuSelection != 4) {
			menuSelection = in.nextInt();
			in.nextLine(); // reset Scanner after int input

			if (menuSelection == 1) { // display menu
				menu.printMenu(foods, drinks);

			} else if (menuSelection == 2) {

				System.out.print("Enter item name: ");
				String itemName = in.nextLine();
				Food temp = new Food(itemName, null, null, null, 0.0);
				Drink temp2 = new Drink(itemName, null, null, null, 0.0);

				if (foods.search(temp) != null) {
					temp = foods.search(temp).getFood();
					System.out.println("Item found : " + temp.toString());

				} else if (drinks.search(temp2) != null) {
					temp2 = drinks.search(temp2).getDrink();
					System.out.println("Item found : " + temp2.toString());

				} else {
					System.out.println("Item not found !");
				}

			} else if (menuSelection == 3) {

				double sum = 0.0;
				String order = "";

				while (!(order.toLowerCase().equals("order"))) {

					System.out.print("Enter item to order, to finish ordering, type \"order\" : ");
					order = in.nextLine();
					order = order.toLowerCase();

					Food temp = new Food(order, null, null, null, 0.0);
					Drink temp2 = new Drink(order, null, null, null, 0.0);

					if (foods.search(temp) != null) {
						temp = foods.search(temp).getFood();
						System.out.println("Item found : " + temp.toString());
						sum += temp.cost;

					} else if (drinks.search(temp2) != null) {
						temp2 = drinks.search(temp2).getDrink();
						System.out.println("Item found : " + temp2.toString());
						sum += temp2.cost;

					} else {
						if (!(order.equals("order"))) {
							System.out.println("Item not found !");
						}
					}

				}
				DecimalFormat df = new DecimalFormat("0.00");
				System.out.println("Order completed. Total cost is $" + df.format(sum));

			} else if (menuSelection == 4) { // terminate program
				System.exit(0);

			}else {
				System.out.println("Invalid option !");

			}

			if (menuSelection != 4) {
				System.out.println("\nChoose action \n1-Display Menu\n2-Search Food/Drink\n3-Place Order\n4-Exit");
			}
		}

		// end Scanner
		in.close();

		
	}
	
}

