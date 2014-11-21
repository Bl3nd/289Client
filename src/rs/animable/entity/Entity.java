package src.rs.animable.entity;

import sign.signlink;
import src.rs.Class26;
import src.rs.animable.Animable;

public class Entity extends Animable {

	public boolean aBoolean1613;
	public boolean aBoolean1614;
	public int xCoordinate;
	public int yCoordinate;
	public int anInt1617;
	public boolean aBoolean1618;
	public int boundaryDimension;
	public int standAnimationId;
	public int standTurnAnimationId;
	public int walkAnimationId;
	public int turnAnimationId;
	public int turnRightAnimationId;
	public int turnLeftAnimationId;
	public int runAnimationId;
	public String overheadTextMessage;
	public int anInt1628;
	public int anInt1629;
	public int anInt1630;
	public int hitArray[];
	public int hitMarkTypes[];
	public int hitsLoopCycle[];
	public int anInt1634;
	public int anInt1635;
	public int anInt1636;
	public int anInt1637;
	public int anInt1638;
	public int anInt1639;
	public int queuedAnimationId;
	public int queuedAnimationFrame;
	public int anInt1642;
	public int animation;
	public int currentAnimationFrame;
	public int anInt1645;
	public int animationDelay;
	public int anInt1647;
	public int graphicId;
	public int currentAnimationId;
	public int anInt1650;
	public int anInt1651;
	public int graphicHeight;
	public int anInt1653;
	public int anInt1654;
	public int anInt1655;
	public int anInt1656;
	public int anInt1657;
	public int anInt1658;
	public int anInt1659;
	public int anInt1660;
	public int height;
	public int turnDirection;
	public int anInt1663;
	public int waypointCount;
	public int waypointX[];
	public int waypointY[];
	public boolean ranWaypoint[];
	public int stepsDelayed;
	public int stepsRemaining;

	public void setPosition(int y, boolean teleported, int x, byte b) {
		try {
			if (animation != -1 && Class26.animations[animation].precendenceWalking == 1) {
				animation = -1;
			}
			if (!teleported) {
				int distanceX = y - waypointX[0];
				int distanceY = x - waypointY[0];
				if (distanceX >= -8 && distanceX <= 8 && distanceY >= -8 && distanceY <= 8) {
					if (waypointCount < 9) {
						waypointCount++;
					}
					for (int i1 = waypointCount; i1 > 0; i1--) {
						waypointX[i1] = waypointX[i1 - 1];
						waypointY[i1] = waypointY[i1 - 1];
						ranWaypoint[i1] = ranWaypoint[i1 - 1];
					}
					waypointX[0] = y;
					waypointY[0] = x;
					ranWaypoint[0] = false;
					return;
				}
			}
			waypointCount = 0;
			stepsRemaining = 0;
			stepsDelayed = 0;
			waypointX[0] = y;
			waypointY[0] = x;
			xCoordinate = waypointX[0] * 128 + boundaryDimension * 64;
			if (b == 1) {
				b = 0;
			} else {
				aBoolean1613 = !aBoolean1613;
			}
			yCoordinate = waypointY[0] * 128 + boundaryDimension * 64;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("61882, " + y + ", " + teleported + ", " + x + ", " + b + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void move(boolean flag, int direction, int j) {
		try {
			int x = waypointX[0];
			int y = waypointY[0];
			if (direction == 0) {
				x--;
				y++;
			}
			if (direction == 1) {
				y++;
			}
			if (direction == 2) {
				x++;
				y++;
			}
			if (direction == 3) {
				x--;
			}
			if (direction == 4) {
				x++;
			}
			if (direction == 5) {
				x--;
				y--;
			}
			if (direction == 6) {
				y--;
			}
			if (direction == 7) {
				x++;
				y--;
			}
			if (animation != -1 && Class26.animations[animation].precendenceWalking == 1) {
				animation = -1;
			}
			if (waypointCount < 9) {
				waypointCount++;
			}
			for (int i1 = waypointCount; i1 > 0; i1--) {
				waypointX[i1] = waypointX[i1 - 1];
				waypointY[i1] = waypointY[i1 - 1];
				ranWaypoint[i1] = ranWaypoint[i1 - 1];
			}
			waypointX[0] = x;
			waypointY[0] = y;
			ranWaypoint[0] = flag;
			if (j != -6002) {
				return;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("37957, " + flag + ", " + direction + ", " + j + ", " + runtimeexception.toString());
			throw new RuntimeException();
		}
	}

	public void resetPath(boolean reset) {
		try {
			if (reset) {
				aBoolean1614 = !aBoolean1614;
			}
			waypointCount = 0;
			stepsRemaining = 0;
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("39799, " + reset + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public boolean isVisible(boolean visible) {
		try {
			if (!visible) {
				throw new NullPointerException();
			} else {
				return false;
			}
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("30413, " + visible + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public void updateHitData(int type, int currentTime, int damage, boolean flag) {
		try {
			if (flag) {
				return;
			}
			for (int hit = 0; hit < 4; hit++) {
				if (hitsLoopCycle[hit] <= currentTime) {
					hitArray[hit] = damage;
					hitMarkTypes[hit] = type;
					hitsLoopCycle[hit] = currentTime + 70;
					return;
				}
			}
			return;
		} catch (RuntimeException runtimeexception) {
			signlink.reporterror("15311, " + type + ", " + currentTime + ", " + damage + ", " + flag + ", " + runtimeexception.toString());
		}
		throw new RuntimeException();
	}

	public Entity() {
		aBoolean1613 = false;
		aBoolean1614 = false;
		aBoolean1618 = false;
		boundaryDimension = 1;
		standAnimationId = -1;
		standTurnAnimationId = -1;
		walkAnimationId = -1;
		turnAnimationId = -1;
		turnRightAnimationId = -1;
		turnLeftAnimationId = -1;
		runAnimationId = -1;
		anInt1628 = 100;
		hitArray = new int[4];
		hitMarkTypes = new int[4];
		hitsLoopCycle = new int[4];
		anInt1634 = -1000;
		anInt1637 = -1;
		queuedAnimationId = -1;
		animation = -1;
		graphicId = -1;
		height = 200;
		anInt1663 = 32;
		waypointX = new int[10];
		waypointY = new int[10];
		ranWaypoint = new boolean[10];
	}
}
