
public class FoodTree {
	
	public FoodTreeNode root;
	private int nodeCount = 0;

	public FoodTree() 
	{
		root = null;
	}

	public void insert(Food food) {
		root = insert(food, root);
		setNodeCount((nodeCount+1));
	}
	
	private static FoodTreeNode insert(Food food, FoodTreeNode t) {
		if (t == null)
			t = new FoodTreeNode(food, null, null);
		else if (food.name.compareTo(t.getFood().name) < 0)
			t.leftChild = insert(food, t.leftChild);
		else if (food.name.compareTo(t.getFood().name) > 0)
			t.rightChild = insert(food, t.rightChild);
		else
			;
		return t;
	}

	public FoodTreeNode search(Food food) {
		return search(food, root);
	}

	private static FoodTreeNode search(Food food, FoodTreeNode t) {
		if (t == null)
			return null;
		else if (food.name.toLowerCase().compareTo(t.getFood().name.toLowerCase()) < 0)
			return search(food, t.leftChild);
		else if (food.name.toLowerCase().compareTo(t.getFood().name.toLowerCase()) > 0)
			return search(food, t.rightChild);
		else {
			return t;
		}
			
	}


	public void remove(Food food) {
		root = remove(food, root);
		setNodeCount((nodeCount-1));
		
	}
	
	private static FoodTreeNode remove(Food food, FoodTreeNode t) {
		if (t == null)
			return t;
		if (food.name.compareTo(t.getFood().name) < 0)
			t.leftChild = remove(food, t.leftChild);
		else if (food.name.compareTo(t.getFood().name) > 0)
			t.rightChild = remove(food, t.rightChild);
		else if (t.leftChild != null && t.rightChild != null) {
			t.setFood(findMax(t.leftChild).getFood());
			t.leftChild = remove(t.getFood(), t.leftChild);

		} else if (t.leftChild != null)
			t = t.leftChild;
		else
			t = t.rightChild;
		return t;
	}

	public static FoodTreeNode findMax(FoodTreeNode root) {
		
		FoodTreeNode current = root;
		while(current.rightChild != null) {
			current = current.rightChild;
		}
		return current;
	}
	
	public int getNodeCount() {
		return nodeCount;
	}

	public void setNodeCount(int nodeCount) {
		this.nodeCount = nodeCount;
	}
	
	public void multipleInsert(Food[] foods) {
		for (int i = 0; i < foods.length; i++) {
			insert(foods[i]);
		}
	}
	
}
