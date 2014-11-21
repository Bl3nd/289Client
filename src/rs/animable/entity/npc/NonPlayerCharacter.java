package src.rs.animable.entity.npc;

import sign.signlink;
import src.rs.Class11;
import src.rs.Class12;
import src.rs.Class26;
import src.rs.Class32;
import src.rs.animable.Animable;
import src.rs.animable.entity.Entity;
import src.rs.animable.impl.Model;

public class NonPlayerCharacter extends Entity {

	public int anInt1697;
	public int anInt1698;
	public boolean aBoolean1699;
	public Class12 npcDefinition;

	public Model getRotatedModel(int i) {
		try {
			if (npcDefinition == null) {
				return null;
			}
			Model rotatedModel = getChildModel(false);
			if (i != -37770) {
				throw new NullPointerException();
			}
			if (rotatedModel == null) {
				return null;
			}
			super.height = ((Animable) (rotatedModel)).modelHeight;
			if (super.graphicId != -1 && super.currentAnimationId != -1) {
				Class32 spotAnimation = Class32.cache[super.graphicId];
				Model animationModel = spotAnimation.method271();
				if (animationModel != null) {
					int frameId = spotAnimation.sequences.frame2Ids[super.currentAnimationId];
					Model animatedModel = new Model(animationModel, Class11.method211(frameId, 0), false, anInt1697, true);
					animatedModel.method519(-super.graphicHeight, 0, (byte) 2, 0);
					animatedModel.method513((byte) 3);
					animatedModel.method514(frameId, 188);
					animatedModel.triangleSkin = null;
					animatedModel.vertexSkin = null;
					if (spotAnimation.scaleXY != 128 || spotAnimation.scaleZ != 128) {
						animatedModel.method522(spotAnimation.scaleXY, spotAnimation.scaleXY, spotAnimation.scaleZ, (byte) 31);
					}
					animatedModel.method523(64 + spotAnimation.modelLightFalloff, 850 + spotAnimation.modelLightAmbient, -30, -50, -30, true);
					Model models[] = { rotatedModel, animatedModel };
					rotatedModel = new Model(true, 0, models, 2);
				}
			}
			if (npcDefinition.boundaryDimension == 1) {
				rotatedModel.singleTile = true;
			}
			return rotatedModel;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("15988, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Model getChildModel(boolean flag) {
		try {
			if (flag) {
				aBoolean1699 = !aBoolean1699;
			}
			if (super.animation >= 0 && super.animationDelay == 0) {
				int frameId2 = Class26.animations[super.animation].frame2Ids[super.currentAnimationFrame];
				int frameId1 = -1;
				if (super.queuedAnimationId >= 0 && super.queuedAnimationId != super.standAnimationId) {
					frameId1 = Class26.animations[super.queuedAnimationId].frame2Ids[super.queuedAnimationFrame];
				}
				return npcDefinition.method216(0, frameId1, frameId2, Class26.animations[super.animation].flowControl);
			}
			int frameId2 = -1;
			if (super.queuedAnimationId >= 0) {
				frameId2 = Class26.animations[super.queuedAnimationId].frame2Ids[super.queuedAnimationFrame];
			}
			return npcDefinition.method216(0, -1, frameId2, null);
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("99332, " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}
	
	public boolean isVisible(boolean isVisible) {
		try {
			if (!isVisible) {
				anInt1698 = -80;
			}
			return npcDefinition != null;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("4937, " + isVisible + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public NonPlayerCharacter() {
		anInt1698 = 8;
		aBoolean1699 = true;
	}
}
