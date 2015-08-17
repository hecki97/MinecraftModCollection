package net.minecraft.src;

public class mod_CookedFood extends BaseMod
{
	public static Item porkRaw = new ItemPork(63, 3, 0.3F, true).setIconCoord(7, 5).setItemName("porkchopRaw");
	public static Item fishRaw = new ItemFish(93, 2, 0.3F, false).setIconCoord(9, 5).setItemName("fishRaw");
	public static Item beefRaw = (new ItemBeef(107, 3, 0.3F, true)).setIconCoord(9, 6).setItemName("beefRaw");
	public static Item chickenRaw = (new ItemChicken(109, 2, 0.3F, true)).setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setIconCoord(9, 7).setItemName("chickenRaw");
	
	public String getVersion() {
		
		return "1.2.5";
	}

	
	public void load() {
		
		
	}

}
