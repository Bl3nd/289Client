package src.rs.animable.entity.player;

import sign.signlink;
import src.rs.Class11;
import src.rs.Class12;
import src.rs.Class14;
import src.rs.Class22;
import src.rs.Class26;
import src.rs.Class32;
import src.rs.Class39;
import src.rs.Class48;
import src.rs.animable.Animable;
import src.rs.animable.entity.Entity;
import src.rs.animable.impl.Model;
import src.rs.client.Client;
import src.rs.stream.Stream;

public class Player extends Entity {

	public int anInt1670;
	public boolean aBoolean1671;
	public String name;
	public boolean visible;
	public int gender;
	public int headIcon;
	public int appearance[];
	public int colors[];
	public int combatLevel;
	public int skill;
	public long appearanceOffset;
	public int drawHeight2;
	public int anInt1682;
	public int modelAppearanceEndTime;
	public int anInt1684;
	public int drawHeight;
	public int anInt1686;
	public Model playerModel;
	public int anInt1688;
	public int anInt1689;
	public int anInt1690;
	public int anInt1691;
	public boolean preventRotation;
	public long aLong1693;
	public Class12 npcAppearance;
	public int team;
	public static Class39 mruNodes = new Class39((byte) 7, 260);

	public void updatePlayerAppearance(boolean flag, Stream stream) {
		try {
			if (flag) {
				aBoolean1671 = !aBoolean1671;
			}
			stream.currentOffset = 0;
			gender = stream.getUnsignedByte();
			headIcon = stream.getUnsignedByte();
			npcAppearance = null;
			team = 0;
			for (int slot = 0; slot < 12; slot++) {
				int itemdId1 = stream.getUnsignedByte();
				if (itemdId1 == 0) {
					appearance[slot] = 0;
					continue;
				}
				int itemId2 = stream.getUnsignedByte();
				appearance[slot] = (itemdId1 << 8) + itemId2;
				if (slot == 0 && appearance[0] == 65535) {
					npcAppearance = Class12.method214(stream.getUnsignedLEShort());
					break;
				}
				if (appearance[slot] >= 512 && appearance[slot] - 512 < Class14.itemCount) {
					int team1 = Class14.method220(appearance[slot] - 512).teamId;
					if (team1 != 0) {
						team = team1;
					}
				}
			}
			for (int bodyPart = 0; bodyPart < 5; bodyPart++) {
				int color = stream.getUnsignedByte();
				if (color < 0 || color >= Client.playerRecolors[bodyPart].length) {
					color = 0;
				}
				colors[bodyPart] = color;
			}
			super.standAnimationId = stream.getUnsignedLEShort();
			if (super.standAnimationId == 65535) {
				super.standAnimationId = -1;
			}
			super.standTurnAnimationId = stream.getUnsignedLEShort();
			if (super.standTurnAnimationId == 65535) {
				super.standTurnAnimationId = -1;
			}
			super.walkAnimationId = stream.getUnsignedLEShort();
			if (super.walkAnimationId == 65535) {
				super.walkAnimationId = -1;
			}
			super.turnAnimationId = stream.getUnsignedLEShort();
			if (super.turnAnimationId == 65535) {
				super.turnAnimationId = -1;
			}
			super.turnRightAnimationId = stream.getUnsignedLEShort();
			if (super.turnRightAnimationId == 65535) {
				super.turnRightAnimationId = -1;
			}
			super.turnLeftAnimationId = stream.getUnsignedLEShort();
			if (super.turnLeftAnimationId == 65535) {
				super.turnLeftAnimationId = -1;
			}
			super.runAnimationId = stream.getUnsignedLEShort();
			if (super.runAnimationId == 65535) {
				super.runAnimationId = -1;
			}
			name = Class48.method554(Class48.method551(stream.getLong(true), true), true);
			combatLevel = stream.getUnsignedByte();
			skill = stream.getUnsignedLEShort();
			visible = true;
			appearanceOffset = 0L;
			for (int slot = 0; slot < 12; slot++) {
				appearanceOffset <<= 4;
				if (appearance[slot] >= 256) {
					appearanceOffset += appearance[slot] - 256;
				}
			}
			if (appearance[0] >= 256) {
				appearanceOffset += appearance[0] - 256 >> 4;
			}
			if (appearance[1] >= 256) {
				appearanceOffset += appearance[1] - 256 >> 8;
			}
			for (int l1 = 0; l1 < 5; l1++) {
				appearanceOffset <<= 3;
				appearanceOffset += colors[l1];
			}
			appearanceOffset <<= 1;
			appearanceOffset += gender;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("26459, " + flag + ", " + stream + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Model getRotatedModel(int i) {
		try {
			if (!visible) {
				return null;
			}
			Model model = getAnimatedModel(false);
			if (i != -37770) {
				throw new NullPointerException();
			}
			if (model == null) {
				return null;
			}
			super.height = ((Animable) (model)).modelHeight;
			model.singleTile = true;
			if (preventRotation) {
				return model;
			}
			if (super.graphicId != -1 && super.currentAnimationId != -1) {
				Class32 spotAnimation = Class32.cache[super.graphicId];
				Model model_2 = spotAnimation.method271();
				if (model_2 != null) {
					Model model_3 = new Model(model_2, Class11.method211(super.currentAnimationId, 0), false, anInt1670, true);
					model_3.method519(-super.graphicHeight, 0, (byte) 2, 0);
					model_3.method513((byte) 3);
					model_3.method514(spotAnimation.sequences.frame2Ids[super.currentAnimationId], 188);
					model_3.triangleSkin = null;
					model_3.vertexSkin = null;
					if (spotAnimation.scaleXY != 128 || spotAnimation.scaleZ != 128) {
						model_3.method522(spotAnimation.scaleXY, spotAnimation.scaleXY, spotAnimation.scaleZ, (byte) 31);
					}
					model_3.method523(64 + spotAnimation.modelLightFalloff, 850 + spotAnimation.modelLightAmbient, -30, -50, -30, true);
					Model models[] = { model, model_3 };
					model = new Model(true, 0, models, 2);
				}
			}
			if (playerModel != null) {
				if (Client.tick >= modelAppearanceEndTime) {
					playerModel = null;
				}
				if (Client.tick >= anInt1682 && Client.tick < modelAppearanceEndTime) {
					Model model_1 = playerModel;
					model_1.method519(drawHeight - drawHeight2, anInt1684 - super.xCoordinate, (byte) 2, anInt1686 - super.yCoordinate);
					if (super.turnDirection == 512) {
						model_1.method517(0);
						model_1.method517(0);
						model_1.method517(0);
					} else if (super.turnDirection == 1024) {
						model_1.method517(0);
						model_1.method517(0);
					} else if (super.turnDirection == 1536) {
						model_1.method517(0);
					}
					Model models[] = { model, model_1 };
					model = new Model(true, 0, models, 2);
					if (super.turnDirection == 512) {
						model_1.method517(0);
					} else if (super.turnDirection == 1024) {
						model_1.method517(0);
						model_1.method517(0);
					} else if (super.turnDirection == 1536) {
						model_1.method517(0);
						model_1.method517(0);
						model_1.method517(0);
					}
					model_1.method519(drawHeight2 - drawHeight, super.xCoordinate - anInt1684, (byte) 2, super.yCoordinate - anInt1686);
				}
			}
			model.singleTile = true;
			return model;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("67533, " + i + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Model getAnimatedModel(boolean flag) {
		try {
			if (npcAppearance != null) {
				int frameId = -1;
				if (super.animation >= 0 && super.animationDelay == 0) {
					frameId = Class26.animations[super.animation].frame2Ids[super.currentAnimationFrame];
				} else if (super.queuedAnimationId >= 0) {
					frameId = Class26.animations[super.queuedAnimationId].frame2Ids[super.queuedAnimationFrame];
				}
				Model model = npcAppearance.method216(0, -1, frameId, null);
				return model;
			}
			long l = appearanceOffset;
			int j = -1;
			int k = -1;
			int i1 = -1;
			int j1 = -1;
			if (super.animation >= 0 && super.animationDelay == 0) {
				Class26 animation = Class26.animations[super.animation];
				j = animation.frame2Ids[super.currentAnimationFrame];
				if (super.queuedAnimationId >= 0 && super.queuedAnimationId != super.standAnimationId) {
					k = Class26.animations[super.queuedAnimationId].frame2Ids[super.queuedAnimationFrame];
				}
				if (animation.playerReplacementShield >= 0) {
					i1 = animation.playerReplacementShield;
					l += i1 - appearance[5] << 40;
				}
				if (animation.playerReplacementWeapon >= 0) {
					j1 = animation.playerReplacementWeapon;
					l += j1 - appearance[3] << 48;
				}
			} else if (super.queuedAnimationId >= 0) {
				j = Class26.animations[super.queuedAnimationId].frame2Ids[super.queuedAnimationFrame];
			}
			Model model_1 = (Model) mruNodes.method339(l);
			if (flag) {
				aBoolean1671 = !aBoolean1671;
			}
			if (model_1 == null) {
				boolean flag1 = false;
				for (int k1 = 0; k1 < 12; k1++) {
					int i2 = appearance[k1];
					if (j1 >= 0 && k1 == 3) {
						i2 = j1;
					}
					if (i1 >= 0 && k1 == 5) {
						i2 = i1;
					}
					if (i2 >= 256 && i2 < 512 && !Class22.cache[i2 - 256].method249(9)) {
						flag1 = true;
					}
					if (i2 >= 512 && !Class14.method220(i2 - 512).method227(false, gender)) {
						flag1 = true;
					}
				}
				if (flag1) {
					if (aLong1693 != -1L) {
						model_1 = (Model) mruNodes.method339(aLong1693);
					}
					if (model_1 == null) {
						return null;
					}
				}
			}
			if (model_1 == null) {
				Model appearances[] = new Model[12];
				int l1 = 0;
				for (int j2 = 0; j2 < 12; j2++) {
					int k2 = appearance[j2];
					if (j1 >= 0 && j2 == 3) {
						k2 = j1;
					}
					if (i1 >= 0 && j2 == 5) {
						k2 = i1;
					}
					if (k2 >= 256 && k2 < 512) {
						Model model = Class22.cache[k2 - 256].method250(0);
						if (model != null) {
							appearances[l1++] = model;
						}
					}
					if (k2 >= 512) {
						Model model_4 = Class14.method220(k2 - 512).method228(gender, 0);
						if (model_4 != null) {
							appearances[l1++] = model_4;
						}
					}
				}
				model_1 = new Model(appearances, l1, -33019);
				for (int part = 0; part < 5; part++) {
					if (colors[part] != 0) {
						model_1.method520(Client.playerRecolors[part][0], Client.playerRecolors[part][colors[part]]);
						if (part == 1) {
							model_1.method520(Client.anIntArray1043[0], Client.anIntArray1043[colors[part]]);
						}
					}
				}
				model_1.method513((byte) 3);
				model_1.method523(64, 850, -30, -50, -30, true);
				mruNodes.method340(l, (byte) 76, model_1);
				aLong1693 = l;
			}
			if (preventRotation) {
				return model_1;
			}
			Model model_2 = Model.model_1530;
			model_2.method508(Class11.method211(j, 0) & Class11.method211(k, 0), model_1, 0);
			if (j != -1 && k != -1) {
				model_2.method515(j, true, k, Class26.animations[super.animation].flowControl);
			} else if (j != -1) {
				model_2.method514(j, 188);
			}
			model_2.method510(-18258);
			model_2.triangleSkin = null;
			model_2.vertexSkin = null;
			return model_2;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("33523, " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Model getHeadModel(boolean flag) {
		try {
			if (flag) {
				for (int i = 1; i > 0; i++) {
				}
			}
			if (!visible) {
				return null;
			}
			if (npcAppearance != null) {
				return npcAppearance.method217((byte) 105);
			}
			boolean flag1 = false;
			for (int j = 0; j < 12; j++) {
				int k = appearance[j];
				if (k >= 256 && k < 512 && !Class22.cache[k - 256].method251((byte) 0)) {
					flag1 = true;
				}
				if (k >= 512 && !Class14.method220(k - 512).method229(true, gender)) {
					flag1 = true;
				}
			}
			if (flag1) {
				return null;
			}
			Model apperances[] = new Model[12];
			int l = 0;
			for (int i1 = 0; i1 < 12; i1++) {
				int j1 = appearance[i1];
				if (j1 >= 256 && j1 < 512) {
					Model model = Class22.cache[j1 - 256].method252((byte) -45);
					if (model != null) {
						apperances[l++] = model;
					}
				}
				if (j1 >= 512) {
					Model model_1 = Class14.method220(j1 - 512).method230(481, gender);
					if (model_1 != null) {
						apperances[l++] = model_1;
					}
				}
			}
			Model model = new Model(apperances, l, -33019);
			for (int k1 = 0; k1 < 5; k1++) {
				if (colors[k1] != 0) {
					model.method520(Client.playerRecolors[k1][0], Client.playerRecolors[k1][colors[k1]]);
					if (k1 == 1) {
						model.method520(Client.anIntArray1043[0], Client.anIntArray1043[colors[k1]]);
					}
				}
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("96228, " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public boolean isVisible(boolean isVisible) {
		try {
			if (!isVisible) {
				throw new NullPointerException();
			}
			return visible;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("52910, " + isVisible + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Player() {
		aBoolean1671 = false;
		visible = false;
		appearance = new int[12];
		colors = new int[5];
		preventRotation = false;
		aLong1693 = -1L;
	}

}
