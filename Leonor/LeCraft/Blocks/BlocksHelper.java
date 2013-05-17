package Leonor.LeCraft.Blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import Leonor.LeCraft.IDsHelper;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class BlocksHelper {

	//Blocks
	public static Block Asphalt;
	public static Block AsphaltQuer;

	
	
	public static void setupBlocks() {
		
		// Normal Blocks
		Asphalt = new BlockDeko(IDsHelper.AsphaltID).setHardness(10F).setResistance(0.2F)
				.setUnlocalizedName("Asphalt").setCreativeTab(CreativeTabs.tabBlock);
		AsphaltQuer = new BlockDeko(IDsHelper.AsphaltQuerID).setHardness(10F).setResistance(0.2F)
				.setUnlocalizedName("AsphaltQuer").setCreativeTab(CreativeTabs.tabBlock);
	
	gameRegisters();
	
	
	}
	
	private static void gameRegisters() {
		// Block Registry
		GameRegistry.registerBlock(Asphalt, "Asphalt");
		GameRegistry.registerBlock(AsphaltQuer, "Asphalt Quer");
}
	
	
	
	
}
