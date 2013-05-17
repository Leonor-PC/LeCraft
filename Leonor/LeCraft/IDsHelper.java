package Leonor.LeCraft;

import net.minecraftforge.common.Configuration;

public class IDsHelper {

	
		//Categories
	public static String blockids = "Block IDs";
	public static String itemids = "Item IDs";
	
	//Block IDs
	
	public static int AsphaltID;
	public static int AsphaltQuerID;
	public static int Tapete1ID;
	public static int TapeteID;
	public static int PappeID;

	//Item IDs
	
	public static int BitumID;
	public static int PatroneGelbID;
	public static int PatroneRotID;
	public static int PatroneBlauID;
	public static int PatroneLeerID;

	public static void runConfiguration(Configuration config) {
		
		//Block
		AsphaltID = config.get(blockids, "Asphalt", 700).getInt();
		AsphaltQuerID = config.get(blockids, "Asphalt Quer", 701).getInt();
		Tapete1ID = config.get(blockids, "Tapete Schwarz", 702).getInt();
		TapeteID = config.get(blockids, "Tapete Weiﬂ", 703).getInt();
		PappeID = config.get(blockids, "Pappe", 704).getInt();

		
		
		//Item
		BitumID = config.get(itemids, "Bitum", 1000).getInt();
		PatroneGelbID = config.get(itemids, "Cartridge Yellow", 1001).getInt();
		PatroneBlauID = config.get(itemids, "Cartridge Blue", 1002).getInt();
		PatroneRotID = config.get(itemids, "Cartridge Red", 1003).getInt();
		PatroneLeerID = config.get(itemids, "Cartridge Emty", 1004).getInt();
	}
}
