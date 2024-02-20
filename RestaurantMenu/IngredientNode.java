
public class IngredientNode {
	
	private String name;
	public IngredientNode next;
	
	// default constructor
	public IngredientNode(String name) {
		this.name = name;
		next = null;
	}
	
	// get ingredient name
	public String getName() {
		return name;
	}

}
