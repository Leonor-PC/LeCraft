package Leonor.LeCraft.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import Leonor.LeCraft.IDsHelper;
import Leonor.LeCraft.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemsHelper {

	// Items
	public static Item Bitum;
	public static Item PatroneGelb;
	public static Item PatroneRot;
	public static Item PatroneBlau;
	public static Item PatroneLeer;

	public static void setupItems() {
		//LOADING
		Bitum = new ItemOther(IDsHelper.BitumID, "Bitum").setCreativeTab(CreativeTabs.tabMaterials);
		PatroneGelb = new ItemOther(IDsHelper.PatroneGelbID, "PatroneGelb").setCreativeTab(CreativeTabs.tabMaterials);
		PatroneBlau = new ItemOther(IDsHelper.PatroneBlauID, "PatroneBlau").setCreativeTab(CreativeTabs.tabMaterials);
		PatroneRot = new ItemOther(IDsHelper.PatroneRotID, "PatroneRot").setCreativeTab(CreativeTabs.tabMaterials);
		PatroneLeer = new ItemOther(IDsHelper.PatroneLeerID, "PatroneLeer").setCreativeTab(CreativeTabs.tabMaterials);

	gameRegisters();
	
	}
	
	private static void gameRegisters() {
		//Registry
		GameRegistry.registerItem(Bitum, "Bitum", Reference.modid);
		GameRegistry.registerItem(PatroneGelb, "Patrone Gelb", Reference.modid);
		GameRegistry.registerItem(PatroneRot, "Patrone Rot", Reference.modid);
		GameRegistry.registerItem(PatroneBlau, "Patrone Blau", Reference.modid);
		GameRegistry.registerItem(PatroneLeer, "Patrone Leer", Reference.modid);

	}
}
