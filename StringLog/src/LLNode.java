
public class LLNode {
	private String data;
	private LLNode link;
	
	public LLNode(String data) {
		this.data = data;
		link = null;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public LLNode getLink() {
		return link;
	}

	public void setLink(LLNode link) {
		this.link = link;
	}

}
