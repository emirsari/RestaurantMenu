
public class FoodTreeNode {

	private Food food; 
	public FoodTreeNode leftChild, rightChild; 
	
	FoodTreeNode(Food food, FoodTreeNode leftChild, FoodTreeNode rightChild) {
		this.food = food;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	
	
}
