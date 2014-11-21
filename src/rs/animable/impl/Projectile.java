package src.rs.animable.impl;

import sign.signlink;
import src.rs.Class11;
import src.rs.Class32;
import src.rs.animable.Animable;

public class Projectile extends Animable {

	public int anInt1497;
	public int anInt1498;
	public Class32 animation;
	public int plane;
	public int startX;
	public int startY;
	public int startZ;
	public int endZ;
	public int delay;
	public int endCycle;
	public int startSlope;
	public int startDistance;
	public int targetId;
	public boolean moving;
	public double currentX;
	public double currentY;
	public double currentZ;
	public double speedVectorX;
	public double speedVectorY;
	public double speedScalar;
	public double speedVectorZ;
	public double zOffset;
	public int rotationY;
	public int rotationX;
	public int animationFrame;
	public int duration;

	public Projectile(int distanceStart, int zStart, int delayTime, int l, int xStart, int target, int planeCoordinate, int yStart, int cycleEnd, int slopeStart, 
			boolean flag, int zEnd) {
		anInt1498 = 6;
		moving = false;
		try {
			animation = Class32.cache[l];
			plane = planeCoordinate;
			startX = xStart;
			startY = yStart;
			startZ = zStart;
			delay = delayTime;
			endCycle = cycleEnd;
			startSlope = slopeStart;
			if (flag) {
				for (int l2 = 1; l2 > 0; l2++) {
				}
			}
			startDistance = distanceStart;
			targetId = target;
			endZ = zEnd;
			moving = false;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("7515, " + distanceStart + ", " + zStart + ", " + delayTime + ", " + l + ", " + xStart + ", " + target + ", " + planeCoordinate + ", " 
					+ yStart + ", " + cycleEnd + ", " + slopeStart + ", " + flag + ", " + zEnd + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void trackTarget(int i, boolean flag, int targetY, int currentCycle, int targetX) {
		try {
			if (!moving) {
				double distanceX = targetX - startX;
				double distanceY = targetY - startY;
				double distanceScalar = Math.sqrt(distanceX * distanceX + distanceY * distanceY);
				currentX = (double) startX + (distanceX * (double) startDistance) / distanceScalar;
				currentY = (double) startY + (distanceY * (double) startDistance) / distanceScalar;
				currentZ = startZ;
			}
			double cyclesRemaining = (endCycle + 1) - currentCycle;
			speedVectorX = ((double) targetX - currentX) / cyclesRemaining;
			speedVectorY = ((double) targetY - currentY) / cyclesRemaining;
			if (!flag) {
				for (int i1 = 1; i1 > 0; i1++) {
				}
			}
			speedScalar = Math.sqrt(speedVectorX * speedVectorX + speedVectorY * speedVectorY);
			if (!moving) {
				speedVectorZ = -speedScalar * Math.tan((double) startSlope * 0.02454369D);
			}
			zOffset = (2D * ((double) i - currentZ - speedVectorZ * cyclesRemaining)) / (cyclesRemaining * cyclesRemaining);
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("57005, " + i + ", " + flag + ", " + targetY + ", " + currentCycle + ", " + targetX + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void move(int time, int j) {
		try {
			if (j >= 0) {
				anInt1498 = -474;
			}
			moving = true;
			currentX += speedVectorX * (double) time;
			currentY += speedVectorY * (double) time;
			currentZ += speedVectorZ * (double) time + 0.5D * zOffset * (double) time * (double) time;
			speedVectorZ += zOffset * (double) time;
			rotationY = (int) (Math.atan2(speedVectorX, speedVectorY) * 325.94900000000001D) + 1024 & 0x7ff;
			rotationX = (int) (Math.atan2(speedVectorZ, speedScalar) * 325.94900000000001D) & 0x7ff;
			if (animation.sequences != null) {
				for (duration += time; duration > animation.sequences.method254(animationFrame, 24425);) {
					duration -= animation.sequences.method254(animationFrame, 24425) + 1;
					animationFrame++;
					if (animationFrame >= animation.sequences.frameCount) {
						animationFrame = 0;
					}
				}
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("69669, " + time + ", " + j + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public Model getRotatedModel(int i) {
		try {
			Model model = animation.method271();
			if (model == null) {
				return null;
			}
			int frameId = -1;
			if (animation.sequences != null) {
				frameId = animation.sequences.frame2Ids[animationFrame];
			}
			Model rotatedModel = new Model(model, Class11.method211(frameId, 0), false, anInt1497, true);
			if (frameId != -1) {
				rotatedModel.method513((byte) 3);
				rotatedModel.method514(frameId, 188);
				rotatedModel.triangleSkin = null;
				rotatedModel.vertexSkin = null;
			}
			if (animation.scaleXY != 128 || animation.scaleZ != 128) {
				rotatedModel.method522(animation.scaleXY, animation.scaleXY, animation.scaleZ, (byte) 31);
			}
			rotatedModel.method518(46881, rotationX);
			if (i != -37770) {
				throw new NullPointerException();
			} else {
				rotatedModel.method523(64 + animation.modelLightFalloff, 850 + animation.modelLightAmbient, -30, -50, -30, true);
				return rotatedModel;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("13403, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}
}
