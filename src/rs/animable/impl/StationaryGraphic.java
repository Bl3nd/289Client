package src.rs.animable.impl;

import sign.signlink;
import src.rs.Class11;
import src.rs.Class32;
import src.rs.animable.Animable;

public class StationaryGraphic extends Animable {

	public int anInt1602;
	public int anInt1603;
	public Class32 animation;
	public int stationaryGraphicLoopCycle;
	public int z;
	public int x;
	public int y;
	public int drawHeight;
	public int elapsedFrames;
	public int duration;
	public boolean transformationCompleted;

	public StationaryGraphic(int xCoordinate, int zCoordinate, int height, int loopCycleOffset, boolean flag, int yCoordinate, int animationIndex, int loopCycle) {
		anInt1603 = 393;
		transformationCompleted = false;
		try {
			animation = Class32.cache[animationIndex];
			if (!flag) {
				anInt1603 = 385;
			}
			z = zCoordinate;
			x = xCoordinate;
			y = yCoordinate;
			drawHeight = height;
			stationaryGraphicLoopCycle = loopCycle + loopCycleOffset;
			transformationCompleted = false;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("81124, " + xCoordinate + ", " + zCoordinate + ", " + height + ", " + loopCycleOffset + ", " + flag + ", " + yCoordinate + ", " 
					+ animationIndex + ", " + loopCycle + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void animationStep(int i, int j) {
		try {
			if (i <= 0) {
				return;
			}
			for (duration += j; duration > animation.sequences.method254(elapsedFrames, 24425);) {
				duration -= animation.sequences.method254(elapsedFrames, 24425) + 1;
				elapsedFrames++;
				if (elapsedFrames >= animation.sequences.frameCount && (elapsedFrames < 0 || elapsedFrames >= animation.sequences.frameCount)) {
					elapsedFrames = 0;
					transformationCompleted = true;
				}
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("93520, " + i + ", " + j + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Model getRotatedModel(int i) {
		try {
			if (i != -37770) {
				for (int j = 1; j > 0; j++) {
				}
			}
			Model model = animation.method271();
			if (model == null) {
				return null;
			}
			int frame = animation.sequences.frame2Ids[elapsedFrames];
			Model animatedModel = new Model(model, Class11.method211(frame, 0), false, anInt1602, true);
			if (!transformationCompleted) {
				animatedModel.method513((byte) 3);
				animatedModel.method514(frame, 188);
				animatedModel.triangleSkin = null;
				animatedModel.vertexSkin = null;
			}
			if (animation.scaleXY != 128 || animation.scaleZ != 128) {
				animatedModel.method522(animation.scaleXY, animation.scaleXY, animation.scaleZ, (byte) 31);
			}
			if (animation.rotation != 0) {
				if (animation.rotation == 90) {
					animatedModel.method517(0);
				}
				if (animation.rotation == 180) {
					animatedModel.method517(0);
					animatedModel.method517(0);
				}
				if (animation.rotation == 270) {
					animatedModel.method517(0);
					animatedModel.method517(0);
					animatedModel.method517(0);
				}
			}
			animatedModel.method523(64 + animation.modelLightFalloff, 850 + animation.modelLightAmbient, -30, -50, -30, true);
			return animatedModel;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("834, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}
}
