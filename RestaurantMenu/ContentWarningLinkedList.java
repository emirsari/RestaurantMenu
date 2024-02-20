
public class ContentWarningLinkedList {

	private ContentWarningNode root;
	public int size = 0;

	// default constructor
	public ContentWarningLinkedList() {
		root = null;
		size = 0;
	}

	public ContentWarningLinkedList(ContentWarnings[] warningsArray) {
		root = null;
		size = 0;
		addMultipleWarnings(warningsArray);
	}

	public String printData() {

		ContentWarningNode current = root;
		String warnings = "";

		while (current != null) {

			if (current == root) {
				warnings += current.getContentWarning();
				// System.out.print(current.getContentWarning());
			} else {
				warnings += (", " + current.getContentWarning());
				// System.out.print(", " + current.getContentWarning());
			}
			current = current.next;

		}
		return warnings;
	}

	public void addContentWarning(ContentWarnings warning) {
		
		if (root == null) {
			// list is empty
			root = new ContentWarningNode(warning);
		} else {
			// list is not empty
			ContentWarningNode current = root;

			while (current.next != null) {
				current = current.next;
			}

			current.next = new ContentWarningNode(warning);
		}
		size++;
	}

	public void deleteContentWarning(ContentWarnings warning) {

		ContentWarningNode curr = root, prev = null;

		if (curr != null && curr.getContentWarning() == warning) {
			root = curr.next;
			size--;
			return;
		}

		while (curr != null && curr.getContentWarning() != warning) {
			prev = curr;
			curr = curr.next;
		}

		if (curr == null)
			return;

		prev.next = curr.next;
		size--;
	}

	public void addMultipleWarnings(ContentWarnings[] warningsArray) {

		for (int i = 0; i < warningsArray.length; i++) {
			addContentWarning(warningsArray[i]);
		}

	}

}
