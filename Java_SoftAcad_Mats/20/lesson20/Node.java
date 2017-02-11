package lesson20;

public class Node {
	private Node nextNode;
	private Object value;
	/**
	 * @return the nextNode
	 */
	public Node getNextNode() {
		return nextNode;
	}
	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}
	
}
