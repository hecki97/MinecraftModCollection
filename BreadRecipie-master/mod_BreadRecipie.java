package net.minecraft.src;

public class mod_BreadRecipie extends BaseMod
{
	public static final Item dough = new ItemDough(500).setItemName("Dough");
	public static final Item meal = new ItemMeal(501).setItemName("Meal");
	 public static final Item rawBread = new ItemFood(502, 2, 1F, false).setItemName("Raw Bread");
	 
	
	
	public String getVersion() {
		
		return "1.2.5";
	}

	@Override
	public void load()
	{
		dough.iconIndex = ModLoader.addOverride("/gui/items.png", "/dough.png");
        ModLoader.addName(dough, "Dough");
        ModLoader.addShapelessRecipe(new ItemStack(mod_BreadRecipie.dough, 1), new Object [] {mod_BreadRecipie.meal, new ItemStack(Item.potion, 1, 0)});
		
        meal.iconIndex = ModLoader.addOverride("/gui/items.png", "/meal.png");
        ModLoader.addName(meal, "Meal");
        ModLoader.addShapelessRecipe(new ItemStack(mod_BreadRecipie.meal, 1), new Object [] {Block.stone, Item.wheat});
        ModLoader.addShapelessRecipe(new ItemStack(mod_BreadRecipie.meal, 1), new Object [] {Block.cobblestone, Item.wheat});
	
        rawBread.iconIndex = ModLoader.addOverride("/gui/items.png", "/rawbread.png");
        ModLoader.addName(rawBread, "Raw Bread");
        ModLoader.addRecipe(new ItemStack(rawBread, 1), new Object [] {"###", Character.valueOf('#'), mod_BreadRecipie.dough});
	
        ModLoader.addSmelting(mod_BreadRecipie.rawBread.shiftedIndex, new ItemStack(Item.bread, 1));
       
	}
	
	

}
