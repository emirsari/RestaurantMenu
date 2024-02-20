
public class IngredientsLinkedList {

	private IngredientNode root;
	public int size;
	
	// default constructor
	public IngredientsLinkedList() {
		root = null;
		size = 0;
	}
	
	public IngredientsLinkedList(String[] ingredientsArray) {
		root = null;
		size = 0;
		addMultipleIngredients(ingredientsArray);
	}
	
	public String printData(){
		
		IngredientNode current = root;
		String ingredients = "";
        
        while(current != null){
        	
        	if(current == root) {
        		ingredients += current.getName();
        		//System.out.print(current.getName());
        	}
        	else{
        		ingredients += (", " + current.getName());
        		//System.out.print(", " + current.getName());
        	}
        	current = current.next;
        
                  
        }
        return ingredients;
    }
	
	
	public void addIngredient(String ingredient) {
		
		if(root == null) { 
			// list is empty
			root = new IngredientNode(ingredient);
		}else {
			// list is not empty
			IngredientNode current = root;
			
			while(current.next != null) {
				current = current.next;
			}
			
			current.next = new IngredientNode(ingredient);
		}
		size++;
	}
	
	public void deleteIngredient(String ingredient)
    {
    
		IngredientNode curr = root, prev = null;

        
        if (curr != null && curr.getName().equals(ingredient)) {
            root = curr.next; 
            size--;
            return;
        }
 
        
        while (curr != null && !(curr.getName().equals(ingredient))) {
            prev = curr;
            curr = curr.next;
        }
 
        
        if (curr == null)
            return;
 
        prev.next = curr.next;
        size--;
    }
	
	public void addMultipleIngredients(String[] ingredientsArray) {
		
		for(int i = 0; i < ingredientsArray.length; i++) {
			
			addIngredient(ingredientsArray[i]);
		}
		
	}
	
}

