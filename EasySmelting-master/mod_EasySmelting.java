package net.minecraft.src;

public class mod_EasySmelting extends BaseMod
{

	@Override
	public String getVersion() {
		
		return "1.2.5";
	}

	@Override
	public void load()
	{
		ModLoader.addShapelessRecipe(new ItemStack(Item.ingotIron, 1), new Object []
		{Item.coal, Block.oreIron});
		
		ModLoader.addShapelessRecipe(new ItemStack(Item.ingotGold, 1), new Object []
		{Item.coal, Block.oreGold});	
	
		ModLoader.addShapelessRecipe(new ItemStack(Item.ingotIron, 1), new Object []
		{new ItemStack(Item.coal,1,1), Block.oreIron});
	
		ModLoader.addShapelessRecipe(new ItemStack(Item.ingotGold, 1), new Object []
		{new ItemStack(Item.coal,1,1), Block.oreGold});
	}
	

}
