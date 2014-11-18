/**
 * Renamed 11/18/14 2:47PM
 * 
 * @author Cody
 *
 */
public class Node {

	public long id;
	public Node previousNode;
	public Node nextNode;
	public static boolean aBoolean772;

	public void unlink() {
		if (nextNode == null) {
			return;
		} else {
			nextNode.previousNode = previousNode;
			previousNode.nextNode = nextNode;
			previousNode = null;
			nextNode = null;
			return;
		}
	}

	public Node() {
	}
}
