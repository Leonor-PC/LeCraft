package Leonor.LeCraft;

import net.minecraftforge.common.Configuration;

public class IDsHelper {

	
		//Categories
	public static String blockids = "Block IDs";
	public static String itemids = "Item IDs";
	
	//Block IDs
	
	public static int AsphaltID;
	public static int AsphaltQuerID;

	//Item IDs
	
	public static int BitumID;
	
	public static void runConfiguration(Configuration config) {
		
		//Block
		AsphaltID = config.get(blockids, "Asphalt", 700).getInt();
		AsphaltQuerID = config.get(blockids, "Asphalt Quer", 701).getInt();

		
		
		//Item
		BitumID = config.get(itemids, "Bitum", 1000).getInt();
	}
}
