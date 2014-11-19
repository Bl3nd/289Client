public class SubNode extends Node {

	public boolean aBoolean1359;
	public SubNode previousSubNode;
	public SubNode nextSubNode;
	public static boolean aBoolean1362;

	public void method405() {
		if (nextSubNode == null) {
			return;
		} else {
			nextSubNode.previousSubNode = previousSubNode;
			previousSubNode.nextSubNode = nextSubNode;
			previousSubNode = null;
			nextSubNode = null;
			return;
		}
	}

	public SubNode() {
		aBoolean1359 = false;
	}
}
