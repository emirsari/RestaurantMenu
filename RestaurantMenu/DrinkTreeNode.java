
public class DrinkTreeNode {

	private Drink drink; 
	public DrinkTreeNode leftChild, rightChild; 
	
	DrinkTreeNode(Drink drink, DrinkTreeNode leftChild, DrinkTreeNode rightChild) {
		this.drink = drink;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Drink getDrink() {
		return drink;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	
}
