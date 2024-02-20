
public class ContentWarningNode {

	private ContentWarnings warning;
	public ContentWarningNode next;
	
	// default constructor
	public ContentWarningNode(ContentWarnings warning) {
		this.warning = warning;
		next = null;
	}
	
	// get content warning name
	public ContentWarnings getContentWarning() {
		return warning;
	}
	
}
