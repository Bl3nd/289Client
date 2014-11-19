package src.rs.ground;

import src.rs.Class13;
import src.rs.Class15;
import src.rs.Class17;
import src.rs.Class19;
import src.rs.Class27;
import src.rs.Class33;
import src.rs.node.Node;
import src.rs.node.object.InteractiveObject;

public class Ground extends Node {

	//The z coordinate of the object.
	public int z;
	//The x coordinate of the object.
	public int x;
	//The y coordinate of the object.
	public int y;
	//The plane of the object.
	public int plane;
	public int anInt1346;
	public int anInt1349;
	public int anInt1350;
	public int anInt1354;
	public int anInt1355;
	public int anInt1356;
	public int anInt1357;
	
	//The size of the interactive objects.
	public int interactiveObjectsSize[];
	
	public boolean aBoolean1351;
	public boolean aBoolean1352;
	public boolean aBoolean1353;
	public boolean aBoolean1335;
	
	//The interactive objects.
	public InteractiveObject interactiveObjects[];
	public Ground ground;
	public Class27 aClass27_1340;
	public Class15 aClass15_1341;
	public Class33 aClass33_1342;
	public Class13 aClass13_1343;
	public Class17 aClass17_1344;
	public Class19 aClass19_1345;

	/**
	 * Set the ground coordinates.
	 * 
	 * @param zCoord
	 * 		The z (plane) coordinate.
	 * @param xCoord
	 * 		The x coordinate.
	 * @param yCoord
	 * 		The y coordinate.
	 */
	public Ground(int zCoord, int xCoord, int yCoord) {
		aBoolean1335 = false;
		interactiveObjects = new InteractiveObject[5];
		interactiveObjectsSize = new int[5];
		plane = z = zCoord;
		x = xCoord;
		y = yCoord;
	}
}
