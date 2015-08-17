package net.minecraft.src;

public class mod_AdventureBlock extends BaseMod
{
public static final Block adventureBlock = new BlockAdventure(255, 0).setBlockName("Adventure Block").setHardness(0.5F).setResistance(1F).setLightValue(0F);
public static int AdventureBlockTop = ModLoader.addOverride("/terrain.png", "/adventureblock/block.png");
public static int AdventureBlockSides = ModLoader.addOverride("/terrain.png", "/adventureblock/blockside.png");
public String getVersion() {
		// TODO Auto-generated method stub
		return "1.2.5";
	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		ModLoader.registerBlock(adventureBlock);
	    ModLoader.addName(adventureBlock, "Adventure Block");
	    ModLoader.addRecipe(new ItemStack(adventureBlock, 1), new Object[]
	    		{"3", Character.valueOf('3'), Block.dirt});
	    
}
}
