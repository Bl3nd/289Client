package src.rs.animable.impl;

import sign.signlink;
import src.rs.Class14;
import src.rs.animable.Animable;

public class Item extends Animable {

	public boolean aBoolean1494;
	public int itemId;
	public int itemCount;

	public Model getRotatedModel(int i) {
		try {
			Class14 class14 = Class14.method220(itemId);
			if (i != -37770) {
				aBoolean1494 = !aBoolean1494;
			}
			return class14.method224(itemCount);
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("51746, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Item() {
		aBoolean1494 = true;
	}
}
