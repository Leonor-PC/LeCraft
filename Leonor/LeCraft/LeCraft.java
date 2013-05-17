package Leonor.LeCraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import Leonor.LeCraft.Blocks.BlocksHelper;
import Leonor.LeCraft.Items.ItemsHelper;
import Leonor.LeCraft.Proxies.LeonorCommonProxy;



@Mod(modid = Reference.modid, name = Reference.modName, version = Reference.Version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class LeCraft {

		@SidedProxy(clientSide = "Leonor.LeCraft.Proxies.LeonorClientProxy", serverSide = "Leonor.LeCraft.LeonorCommonProxy")
		public static LeonorCommonProxy proxy;
		
		static int startEntityId = 300;
		
		@Instance(Reference.modid)
		public static LeCraft instance = new LeCraft();
		
		@PreInit
		public void preInit(FMLPreInitializationEvent event) {
			Configuration config = new Configuration(event.getSuggestedConfigurationFile());
			
		config.load();
		
		IDsHelper.runConfiguration(config);
		
		config.save();
		}
		
		@Init
		public void load(FMLInitializationEvent event) {
			
		proxy.init();
		LocaleHelper.loadLanguages();
		BlocksHelper.setupBlocks();
		ItemsHelper.setupItems();
		
		craftingRecipes();
		smeltingRecipes();	
			
		}
		
		private static void smeltingRecipes() {
			GameRegistry.addSmelting(Item.book.itemID, new ItemStack(Item.paper, 4), 0.6F);
		}
		
		private static void craftingRecipes() {
	//Shapless
			GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.Asphalt, 2), new ItemStack(ItemsHelper.Bitum, 2), new ItemStack(Block.sand), new ItemStack(Block.gravel));
			GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.AsphaltQuer), new ItemStack(BlocksHelper.Asphalt));
			GameRegistry.addShapelessRecipe(new ItemStack(BlocksHelper.Tapete1), new ItemStack(ItemsHelper.PatroneBlau), new ItemStack(ItemsHelper.PatroneGelb), new ItemStack(ItemsHelper.PatroneRot), new ItemStack(BlocksHelper.Tapete));


			
	//Shaped
			GameRegistry.addRecipe(new ItemStack(BlocksHelper.Tapete, 4),  "###",
																   		"###",
																   		"###",
						'#', Item.paper);
			GameRegistry.addRecipe(new ItemStack(BlocksHelper.Pappe, 4),  "###",
			   																"###",
			   																"UUU",
			   					'#', Item.paper);
		}
		
		
		
		
		
}
