
public class DrinkTree {
	
	public DrinkTreeNode root;
	private int nodeCount = 0;

	public DrinkTree() 
	{
		root = null;
	}

	public void insert(Drink drink) {
		root = insert(drink, root);
		setNodeCount((nodeCount+1));
	}
	
	private static DrinkTreeNode insert(Drink drink, DrinkTreeNode t) {
		if (t == null)
			t = new DrinkTreeNode(drink, null, null);
		else if (drink.name.compareTo(t.getDrink().name) < 0)
			t.leftChild = insert(drink, t.leftChild);
		else if (drink.name.compareTo(t.getDrink().name) > 0)
			t.rightChild = insert(drink, t.rightChild);
		else
			;
		return t;
	}

	public DrinkTreeNode search(Drink drink) {
		return search(drink, root);
	}

	private static DrinkTreeNode search(Drink drink, DrinkTreeNode t) {
		if (t == null)
			return null;
		else if (drink.name.toLowerCase().compareTo(t.getDrink().name.toLowerCase()) < 0)
			return search(drink, t.leftChild);
		else if (drink.name.toLowerCase().compareTo(t.getDrink().name.toLowerCase()) > 0)
			return search(drink, t.rightChild);
		else {
			return t;
		}
			
	}


	public void remove(Drink drink) {
		root = remove(drink, root);
		setNodeCount((nodeCount-1));
		
	}
	
	private static DrinkTreeNode remove(Drink drink, DrinkTreeNode t) {
		if (t == null)
			return t;
		if (drink.name.compareTo(t.getDrink().name) < 0)
			t.leftChild = remove(drink, t.leftChild);
		else if (drink.name.compareTo(t.getDrink().name) > 0)
			t.rightChild = remove(drink, t.rightChild);
		else if (t.leftChild != null && t.rightChild != null) {
			t.setDrink(findMax(t.leftChild).getDrink());
			t.leftChild = remove(t.getDrink(), t.leftChild);

		} else if (t.leftChild != null)
			t = t.leftChild;
		else
			t = t.rightChild;
		return t;
	}

	public static DrinkTreeNode findMax(DrinkTreeNode root) {
		
		DrinkTreeNode current = root;
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
	
	public void multipleInsert(Drink[] drinks) {
		for (int i = 0; i < drinks.length; i++) {
			insert(drinks[i]);
		}
	}
	
}
