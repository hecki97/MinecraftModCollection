package net.minecraft.src;

public class mod_MoSmelting extends BaseMod
{
	public static final Item Diamondparticle = new ItemMoSmelting(5000).setItemName("Diamond particle");
	public static final Item Ironlump = new ItemMoSmelting(5001).setItemName("Iron lump");
    
	public void load()
    {
            Diamondparticle.iconIndex = ModLoader.addOverride("/gui/items.png", "/Diamondparticle.png");
            ModLoader.addName(Diamondparticle, "Diamond particle");
            ModLoader.addRecipe(new ItemStack(Item.diamond, 1), new Object [] {"##", "##", Character.valueOf('#'), mod_MoSmelting.Diamondparticle});
    
            Ironlump.iconIndex = ModLoader.addOverride("/gui/items.png", "/ironlump.png");
            ModLoader.addName(Ironlump, "Iron lump");
            ModLoader.addRecipe(new ItemStack(Item.ingotIron, 1), new Object [] {"##", "##", Character.valueOf('#'), mod_MoSmelting.Ironlump});
            
            ModLoader.addSmelting(Item.shovelGold.shiftedIndex, new ItemStack(Item.goldNugget, 4));
            ModLoader.addSmelting(Item.pickaxeGold.shiftedIndex, new ItemStack(Item.goldNugget, 8));
            ModLoader.addSmelting(Item.axeGold.shiftedIndex, new ItemStack(Item.goldNugget, 8));
            ModLoader.addSmelting(Item.swordGold.shiftedIndex, new ItemStack(Item.goldNugget, 6));
            ModLoader.addSmelting(Item.hoeGold.shiftedIndex, new ItemStack(Item.goldNugget, 6));
            
            ModLoader.addSmelting(Item.shovelStone.shiftedIndex, new ItemStack(Block.stone, 0));
            ModLoader.addSmelting(Item.pickaxeStone.shiftedIndex, new ItemStack(Block.stone, 2));
            ModLoader.addSmelting(Item.axeStone.shiftedIndex, new ItemStack(Block.stone, 2));
            ModLoader.addSmelting(Item.swordStone.shiftedIndex, new ItemStack(Block.stone, 1));
            ModLoader.addSmelting(Item.hoeStone.shiftedIndex, new ItemStack(Block.stone, 1));
            
            ModLoader.addSmelting(Item.shovelDiamond.shiftedIndex, new ItemStack(mod_MoSmelting.Diamondparticle, 1));
            ModLoader.addSmelting(Item.pickaxeDiamond.shiftedIndex, new ItemStack(mod_MoSmelting.Diamondparticle, 5));
            ModLoader.addSmelting(Item.axeDiamond.shiftedIndex, new ItemStack(mod_MoSmelting.Diamondparticle, 5));
            ModLoader.addSmelting(Item.swordDiamond.shiftedIndex, new ItemStack(mod_MoSmelting.Diamondparticle, 3));
            ModLoader.addSmelting(Item.hoeDiamond.shiftedIndex, new ItemStack(mod_MoSmelting.Diamondparticle, 3));
    
            ModLoader.addSmelting(Item.shovelSteel.shiftedIndex, new ItemStack(mod_MoSmelting.Ironlump, 1));
            ModLoader.addSmelting(Item.pickaxeSteel.shiftedIndex, new ItemStack(mod_MoSmelting.Ironlump, 5));
            ModLoader.addSmelting(Item.axeSteel.shiftedIndex, new ItemStack(mod_MoSmelting.Ironlump, 5));
            ModLoader.addSmelting(Item.swordSteel.shiftedIndex, new ItemStack(mod_MoSmelting.Ironlump, 3));
            ModLoader.addSmelting(Item.hoeSteel.shiftedIndex, new ItemStack(mod_MoSmelting.Ironlump, 3));
    }
	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.2.5";
	}
	public int addFuel(int i, int j)
	{
	  if(i == Item.shovelWood.shiftedIndex)
	   return 250;
  
	  if(i == Item.pickaxeWood.shiftedIndex)
	   return 650;

	  if(i == Item.axeWood.shiftedIndex)
		   return 650;
	  
	  if(i == Item.swordWood.shiftedIndex)
	   return 400;

	  if(i == Item.hoeWood.shiftedIndex)
	   return 400;

	  return 0;
	}
}
