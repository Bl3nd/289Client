package src.rs.animable.impl;

import sign.signlink;
import src.rs.Class26;
import src.rs.Class35;
import src.rs.Class8;
import src.rs.animable.Animable;
import src.rs.client.Client;

public class GameObject extends Animable {

	public static Client client;
	public int objectId;
	public int type;
	public int orientation;
	public int vertexHeightBottomLeft;
	public int vertexHeightBottomRight;
	public int vertexHeightTopRight;
	public int vertexHeightTopLeft;
	public Class26 animation;
	public int frame;
	public int nextFrameTime;
	public int varBitId;
	public int childrenIds[];

	public GameObject(int objectOrientation, int id, int objectType, int heightTopLeft, int heightTopRight, boolean flag, int heightBottomLeft, int animationId, 
			boolean animating, int heightBottomRight) {
		try {
			objectId = id;
			type = objectType;
			orientation = objectOrientation;
			vertexHeightBottomLeft = heightBottomLeft;
			vertexHeightBottomRight = heightBottomRight;
			vertexHeightTopRight = heightTopRight;
			vertexHeightTopLeft = heightTopLeft;
			if (flag) {
				throw new NullPointerException();
			}
			if (animationId != -1) {
				animation = Class26.animations[animationId];
				frame = 0;
				nextFrameTime = Client.tick;
				if (animating && animation.frameStep != -1) {
					frame = (int) (Math.random() * (double) animation.frameCount);
					nextFrameTime -= (int) (Math.random() * (double) animation.method254(frame, 24425));
				}
			}
			Class8 class8 = Class8.method199(objectId);
			varBitId = class8.anInt249;
			childrenIds = class8.anIntArray250;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("78557, " + objectOrientation + ", " + id + ", " + objectType + ", " + heightTopLeft + ", " + heightTopRight + ", " + flag + ", " 
					+ heightBottomLeft + ", " + animationId + ", " + animating + ", " + heightBottomRight + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Model getRotatedModel(int i) {
		try {
			if (i != -37770) {
				for (int j = 1; j > 0; j++) {
				}
			}
			int animationId = -1;
			if (animation != null) {
				int step = Client.tick - nextFrameTime;
				if (step > 100 && animation.frameStep > 0) {
					step = 100;
				}
				while (step > animation.method254(frame, 24425)) {
					step -= animation.method254(frame, 24425);
					frame++;
					if (frame < animation.frameCount) {
						continue;
					}
					frame -= animation.frameStep;
					if (frame >= 0 && frame < animation.frameCount) {
						continue;
					}
					animation = null;
					break;
				}
				nextFrameTime = Client.tick - step;
				animationId = animation.frame2Ids[frame];
			}
			Class8 class8;
			if (childrenIds != null) {
				Class35 varBit = Class35.cache[varBitId];
				int configId = varBit.anInt592;
				int lsb = varBit.anInt593;
				int msb = varBit.anInt594;
				int bit = Client.BITFIELD_MAX_VALUE[msb - lsb];
				int child = client.interfaceSettings[configId] >> lsb & bit;
				if (child < 0 || child >= childrenIds.length || childrenIds[child] == -1) {
					return null;
				}
				class8 = Class8.method199(childrenIds[child]);
			} else {
				class8 = Class8.method199(objectId);
			}
			Model model = class8.method205(type, orientation, vertexHeightBottomLeft, vertexHeightBottomRight, vertexHeightTopRight, vertexHeightTopLeft, animationId);
			return model;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("27197, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}
}
