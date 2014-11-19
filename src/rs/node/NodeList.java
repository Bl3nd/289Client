package src.rs.node;
import sign.signlink;

/**
 * Renamed 11/18/14 2:47PM
 * 
 * @author Cody
 *
 */
public class NodeList {

	public int anInt532;
	public boolean aBoolean533;
	public Node head;
	public Node currentNode;

	public NodeList(int i) {
		anInt532 = 9;
		aBoolean533 = true;
		head = new Node();
		try {
			head.previousNode = head;
			if (i >= 0) {
				for (int j = 1; j > 0; j++) {
				}
			}
			head.nextNode = head;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("20960, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void insertHead(Node node) {
		if (node.nextNode != null) {
			node.unlink();
		}
		node.nextNode = head.nextNode;
		node.previousNode = head;
		node.nextNode.previousNode = node;
		node.previousNode.nextNode = node;
	}

	public void insertTail(Node node, int i) {
		try {
			if (node.nextNode != null) {
				node.unlink();
			}
			node.nextNode = head;
			node.previousNode = head.previousNode;
			node.nextNode.previousNode = node;
			node.previousNode.nextNode = node;
			if (i != -12925) {
				aBoolean533 = !aBoolean533;
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("22708, " + node + ", " + i + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public Node popHead() {
		Node node = head.previousNode;
		if (node == head) {
			return null;
		} else {
			node.unlink();
			return node;
		}
	}

	public Node getBack() {
		Node node = head.previousNode;
		if (node == head) {
			currentNode = null;
			return null;
		} else {
			currentNode = node.previousNode;
			return node;
		}
	}

	public Node getFirst(int i) {
		try {
			Node node = head.nextNode;
			if (node == head) {
				currentNode = null;
				return null;
			}
			currentNode = node.nextNode;
			if (i != 0) {
				aBoolean533 = !aBoolean533;
			}
			return node;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("18269, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Node reverseGetNext(boolean flag) {
		try {
			Node node = currentNode;
			if (flag) {
				throw new NullPointerException();
			}
			if (node == head) {
				currentNode = null;
				return null;
			} else {
				currentNode = node.previousNode;
				return node;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("49472, " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Node getNext(int i) {
		try {
			Node node = currentNode;
			if (i != -20683) {
				throw new NullPointerException();
			}
			if (node == head) {
				currentNode = null;
				return null;
			} else {
				currentNode = node.nextNode;
				return node;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("30725, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void removeAll() {
		if (head.previousNode == head) {
			return;
		}
		do {
			Node node = head.previousNode;
			if (node == head) {
				return;
			}
			node.unlink();
		} while (true);
	}
}
