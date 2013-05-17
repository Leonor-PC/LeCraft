package Leonor.LeCraft.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import Leonor.LeCraft.IDsHelper;
import Leonor.LeCraft.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemsHelper {

	// Items
	public static Item Bitum;
	
	public static void setupItems() {
		//LOADING
		Bitum = new ItemOther(IDsHelper.BitumID, "Bitum").setCreativeTab(CreativeTabs.tabMaterials);
	
	gameRegisters();
	
	}
	
	private static void gameRegisters() {
		//Registry
		GameRegistry.registerItem(Bitum, "Bitum", Reference.modid);
	}
}
