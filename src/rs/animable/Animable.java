package src.rs.animable;
import sign.signlink;
import src.rs.animable.impl.Model;
import src.rs.node.SubNode;
import src.rs.util.vertex.Vertex;

public class Animable extends SubNode {

	public int anInt1410;
	public Vertex vertices[];
	public int modelHeight;
	public static boolean aBoolean1413;

	public void renderAtPoint(int i, int j, int k, int l, int i1, int j1, int k1, int l1, int i2) {
		Model model = getRotatedModel(-37770);
		if (model != null) {
			modelHeight = ((Animable) (model)).modelHeight;
			model.renderAtPoint(i, j, k, l, i1, j1, k1, l1, i2);
		}
	}

	public Model getRotatedModel(int i) {
		try {
			if (i != -37770) {
				anInt1410 = 414;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("59009, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Animable() {
		anInt1410 = 772;
		modelHeight = 1000;
	}
}
