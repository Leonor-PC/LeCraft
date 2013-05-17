package Leonor.LeCraft.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import Leonor.LeCraft.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockDeko extends Block {
	
	public BlockDeko(int par1) {
		super(par1, Material.rock);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.blockIcon = reg.registerIcon("LeCraft:" + this.getUnlocalizedName().substring(5));
		
	}

}
