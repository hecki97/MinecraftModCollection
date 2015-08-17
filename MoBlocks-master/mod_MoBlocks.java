package net.minecraft.src;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.Minecraft;

public class mod_MoBlocks extends BaseMod
{
												//Treppen\\
	public static final Block stoneStairs = new BlockStairs(170, Block.stone).setBlockName("Stone Stairs").setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep).setRequiresSelfNotify();
	public static final Block dirtStairs = new BlockStairs(171, Block.dirt).setBlockName("Dirt Stairs").setHardness(0.6F).setResistance(0F).setStepSound(Block.soundGravelFootstep).setRequiresSelfNotify();
	public static final Block bedrockStairs = new BlockStairs(172, Block.bedrock).setBlockName("Bedrock Stairs").setResistance(6000000.0F).setBlockUnbreakable().setStepSound(Block.soundStoneFootstep).setRequiresSelfNotify();
	public static final Block sandStairs = new BlockStairs(173 , Block.sand).setBlockName("Sand Stairs").setHardness(0.6F).setResistance(0F).setStepSound(Block.soundSandFootstep).setRequiresSelfNotify();
    public static final Block gravelStairs = new BlockStairs(174, Block.gravel).setBlockName("Gravel Stairs").setHardness(0.6F).setResistance(0F).setStepSound(Block.soundGravelFootstep).setRequiresSelfNotify();
	public static final Block ironStairs = new BlockStairs(175, Block.blockSteel).setBlockName("Iron Stairs").setHardness(3F).setResistance(5F).setStepSound(Block.soundMetalFootstep).setRequiresSelfNotify();
    public static final Block goldStairs = new BlockStairs(176, Block.blockGold).setBlockName("Gold Stairs").setHardness(3F).setResistance(5F).setStepSound(Block.soundMetalFootstep).setRequiresSelfNotify();
    public static final Block diamondStairs = new BlockStairs(177, Block.blockDiamond).setBlockName("Diamond Stairs").setHardness(4F).setResistance(5F).setStepSound(Block.soundMetalFootstep).setRequiresSelfNotify();
    public static final Block glassStairs = new BlockStairs(178, Block.glass).setBlockName("Glass Stairs").setHardness(0.6F).setResistance(0F).setStepSound(Block.soundGlassFootstep).setRequiresSelfNotify();
	
    //*\\
   
    
    public static final Block woolStairs = new BlockMBWoolStairs(191, 64).setBlockName("Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool1Stairs = new BlockMBWoolStairs(192, 210).setBlockName("Orange Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool2Stairs = new BlockMBWoolStairs(193, 194).setBlockName("Magenta Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool3Stairs = new BlockMBWoolStairs(194, 178).setBlockName("Light Blue Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool4Stairs = new BlockMBWoolStairs(195, 162).setBlockName("Yellow Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool5Stairs = new BlockMBWoolStairs(196, 146).setBlockName("Lime Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool6Stairs = new BlockMBWoolStairs(197, 130).setBlockName("Pink Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool7Stairs = new BlockMBWoolStairs(198, 114).setBlockName("Gray Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool8Stairs = new BlockMBWoolStairs(199, 225).setBlockName("Light Gray Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool9Stairs = new BlockMBWoolStairs(200, 209).setBlockName("Cyan Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool10Stairs = new BlockMBWoolStairs(201, 193).setBlockName("Purple Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool11Stairs = new BlockMBWoolStairs(202, 177).setBlockName("Blue Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool12Stairs = new BlockMBWoolStairs(203, 161).setBlockName("Brown Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool13Stairs = new BlockMBWoolStairs(204, 145).setBlockName("Green Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool14Stairs = new BlockMBWoolStairs(205, 129).setBlockName("Red Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool15Stairs = new BlockMBWoolStairs(206, 113).setBlockName("Black Wool Stairs").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    
    //public static final Block redstoneBlock = new BlockRedstone(210, 0).setBlockName("Redstone Block").setHardness(1.5F).setResistance(10F);
    //*\\
    public static final Block clayStairs = new BlockStairs(181, Block.blockClay).setBlockName("Clay Stairs").setHardness(0.6F).setResistance(0F).setStepSound(Block.soundGravelFootstep);
    public static final Block lapisStairs = new BlockStairs(179, Block.blockLapis).setBlockName("Lapis Lazuli Stairs").setHardness(0.5F).setResistance(5F).setStepSound(Block.soundStoneFootstep);
    public static final Block mossystoneStairs = new BlockStairs(180, Block.cobblestoneMossy).setBlockName("MossyCobblestone Stairs").setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep);
    //*\\
    public static final Block planks2Stairs = new BlockMBWoodStairs(182, 198).setBlockName("Pine Wood Stairs").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
    public static final Block planks3Stairs = new BlockMBWoodStairs(183, 214).setBlockName("Birch Wood Stairs").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
    public static final Block planks4Stairs = new BlockMBWoodStairs(184, 199).setBlockName("Jungle Wood Stairs").setHardness(2.0F).setResistance(5.0F).setStepSound(Block.soundWoodFootstep);
    											//Blöcke\\
    //*\\
    public static final Block Crafting2 = new BlockMBCrafting2(207).setBlockName("Craftingbox").setHardness(2F).setResistance(5F).setStepSound(Block.soundWoodFootstep);
    public static final Block Crafting3 = new BlockMBCrafting3(208).setBlockName("Craftingbox").setHardness(2F).setResistance(5F).setStepSound(Block.soundWoodFootstep); 
    public static final Block Crafting4 = new BlockMBCrafting4(209).setBlockName("Craftingbox").setHardness(2F).setResistance(5F).setStepSound(Block.soundWoodFootstep);
    
    
    											//Zäune\\
    public static final Block mossystoneFence = new BlockFence(226, 23, Material.rock).setBlockName("MossyCobblestone Fence").setHardness(2F).setResistance(10F).setStepSound(Block.soundMetalFootstep);
    public static final Block cobbleFence = new BlockFence(227, 16, Material.rock).setBlockName("Cobblestone Fence").setHardness(2F).setResistance(10F).setStepSound(Block.soundMetalFootstep);
    public static final Block brickFence = new BlockFence(228, 7, Material.rock).setBlockName("Brick Fence").setHardness(2F).setResistance(10F).setStepSound(Block.soundMetalFootstep);
    
    public static final Block goldFence = new BlockFence(185, 23, Material.rock).setBlockName("Gold Fence").setHardness(3F).setResistance(5F).setStepSound(Block.soundMetalFootstep);
    public static final Block stoneFence = new BlockFence(186, 1, Material.rock).setBlockName("Stone Fence").setHardness(1.5F).setResistance(10F).setStepSound(Block.soundStoneFootstep);
	public static final Block bedrockFence = new BlockFence(187, 17, Material.rock).setBlockName("Bedrock Fence").setResistance(6000000.0F).setBlockUnbreakable().setStepSound(Block.soundStoneFootstep);
	public static final Block ironFence = new BlockFence(188, 22, Material.iron).setBlockName("Iron Fence").setHardness(3F).setResistance(5F).setStepSound(Block.soundMetalFootstep);
    public static final Block diamondFence = new BlockFence(189, 24, Material.rock).setBlockName("Diamond Fence").setHardness(4F).setResistance(5F).setStepSound(Block.soundMetalFootstep);
    public static final Block glassFence = new BlockFence(190, 49, Material.glass).setBlockName("Glass Fence").setHardness(0.6F).setResistance(0F).setStepSound(Block.soundGlassFootstep);
    //*\\
    public static final Block woolFence = new BlockFence(210, 64, Material.cloth).setBlockName("Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool1Fence = new BlockFence(211, 210, Material.cloth).setBlockName("Orange Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool2Fence = new BlockFence(212, 194, Material.cloth).setBlockName("Magenta Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool3Fence = new BlockFence(213, 178, Material.cloth).setBlockName("Light Blue Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool4Fence = new BlockFence(214, 162, Material.cloth).setBlockName("Yellow Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool5Fence = new BlockFence(215, 146, Material.cloth).setBlockName("Lime Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool6Fence = new BlockFence(216, 130, Material.cloth).setBlockName("Pink Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool7Fence = new BlockFence(217, 114, Material.cloth).setBlockName("Gray Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool8Fence = new BlockFence(218, 225, Material.cloth).setBlockName("Light Gray Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool9Fence = new BlockFence(219, 209, Material.cloth).setBlockName("Cyan Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool10Fence = new BlockFence(220, 193, Material.cloth).setBlockName("Purple Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool11Fence = new BlockFence(221, 177, Material.cloth).setBlockName("Blue Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool12Fence = new BlockFence(222, 161, Material.cloth).setBlockName("Brown Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool13Fence = new BlockFence(223, 145, Material.cloth).setBlockName("Green Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool14Fence = new BlockFence(224, 129, Material.cloth).setBlockName("Red Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    public static final Block wool15Fence = new BlockFence(225, 113, Material.cloth).setBlockName("Black Wool Fence").setHardness(0.6F).setResistance(3F).setStepSound(Block.soundClothFootstep);
    
    //**
    public static int Crafting2Top = ModLoader.addOverride("/terrain.png", "/moblocks/crafting2top.png");
    public static int Crafting2Side1 = ModLoader.addOverride("/terrain.png", "/moblocks/crafting2side1.png");
    public static int Crafting2Side2 = ModLoader.addOverride("/terrain.png", "/moblocks/crafting2side2.png");
    public static int Crafting3Top = ModLoader.addOverride("/terrain.png", "/moblocks/crafting3top.png");
    public static int Crafting3Side1 = ModLoader.addOverride("/terrain.png", "/moblocks/crafting3side1.png");
    public static int Crafting3Side2 = ModLoader.addOverride("/terrain.png", "/moblocks/crafting3side2.png");
    public static int Crafting4Top = ModLoader.addOverride("/terrain.png", "/moblocks/crafting4top.png");
    public static int Crafting4Side1 = ModLoader.addOverride("/terrain.png", "/moblocks/crafting4side1.png");
    public static int Crafting4Side2 = ModLoader.addOverride("/terrain.png", "/moblocks/crafting4side2.png");
    public static int Crafting2Bottom = ModLoader.addOverride("/terrain.png", "/moblocks/crafting2bottom.png");
    public static int Crafting3Bottom = ModLoader.addOverride("/terrain.png", "/moblocks/crafting3bottom.png");
    public static int Crafting4Bottom = ModLoader.addOverride("/terrain.png", "/moblocks/crafting4bottom.png");
    //*\\
    public static final Achievement bedrock = new Achievement(4560, "Bedrock", 5, 7, mod_MoBlocks.bedrockStairs, null).registerAchievement();
    
    public void load()
    {    	
    	ModLoader.setInGameHook(this, true, false);
    	ModLoader.setInGUIHook(this, true, false);
    	//*\\
        ModLoader.addAchievementDesc(bedrock, "Bedrock Stairs", "Make the impossible possible");
    	
    	
            ModLoader.registerBlock(dirtStairs);
            ModLoader.addName(dirtStairs, "Dirt Stairs");
            ModLoader.addRecipe(new ItemStack(dirtStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.dirt});
                   
            ModLoader.registerBlock(goldStairs);
            ModLoader.addName(goldStairs, "Gold Stairs");
            ModLoader.addRecipe(new ItemStack(goldStairs, 8), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Item.ingotGold});
            
            ModLoader.registerBlock(ironStairs);
            ModLoader.addName(ironStairs, "Iron Stairs");
            ModLoader.addRecipe(new ItemStack(ironStairs, 6), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Item.ingotIron});
            
            ModLoader.registerBlock(diamondStairs);
            ModLoader.addName(diamondStairs, "Diamond Stairs");
            ModLoader.addRecipe(new ItemStack(diamondStairs, 10), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Item.diamond});
           
            ModLoader.registerBlock(bedrockStairs);
            ModLoader.addName(bedrockStairs, "Bedrock Stairs");
            ModLoader.addRecipe(new ItemStack(bedrockStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.bedrock});
            
            ModLoader.registerBlock(stoneStairs);
            ModLoader.addName(stoneStairs, "Stone Stairs");
            ModLoader.addRecipe(new ItemStack(stoneStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.stone});
            
            ModLoader.registerBlock(glassStairs);
            ModLoader.addName(glassStairs, "Glass Stairs");
            ModLoader.addRecipe(new ItemStack(glassStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.glass});
            //wood1Stairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/moblocks/wood1stairs.png");
            //ModLoader.registerBlock(wood1Stairs);
            //ModLoader.addName(wood1Stairs, "Woodstairs");
            //ModLoader.addRecipe(new ItemStack(wood1Stairs, 8), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.wood, 1, 0)});
            
            ModLoader.registerBlock(lapisStairs);
            ModLoader.addName(lapisStairs, "Lapis Stairs");
            ModLoader.addRecipe(new ItemStack(lapisStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Item.dyePowder, 1, 4)});
           
            ModLoader.registerBlock(mossystoneStairs);
            ModLoader.addName(mossystoneStairs, "Mossystone Stairs");
            ModLoader.addRecipe(new ItemStack(mossystoneStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.cobblestoneMossy});
            
            ModLoader.registerBlock(clayStairs);
            ModLoader.addName(clayStairs, "Clay Stairs");
            ModLoader.addRecipe(new ItemStack(clayStairs, 2), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Item.clay});
            //snowStairs.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/moblocks/snowstairs.png");
            //ModLoader.registerBlock(snowStairs);
            //ModLoader.addName(snowStairs, "Snowstairs");
            //ModLoader.addRecipe(new ItemStack(snowStairs, 2), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Item.snowball});
            //*\\
            ModLoader.registerBlock(Crafting2);
            ModLoader.addName(Crafting2, "Crafting Table");
            ModLoader.addRecipe(new ItemStack(Crafting2, 1), new Object [] {"##", "##", Character.valueOf('#'),  new ItemStack(Block.planks, 1, 1)});
            ModLoader.registerBlock(Crafting3);
            ModLoader.addName(Crafting3, "Crafting Table");
            ModLoader.addRecipe(new ItemStack(Crafting3, 1), new Object [] {"##", "##", Character.valueOf('#'), new ItemStack(Block.planks, 1, 2)});
            ModLoader.registerBlock(Crafting4);
            ModLoader.addName(Crafting4, "Crafting Table");
            ModLoader.addRecipe(new ItemStack(Crafting4, 1), new Object [] {"##", "##", Character.valueOf('#'), new ItemStack(Block.planks, 1, 3)});
            //*\\
            ModLoader.registerBlock(woolStairs);
            ModLoader.addName(woolStairs, "Wool Stairs");
            ModLoader.registerBlock(wool1Stairs);
            ModLoader.addName(wool1Stairs, "Orange Wool Stairs");
            ModLoader.registerBlock(wool2Stairs);
            ModLoader.addName(wool2Stairs, "Magenta Wool Stairs");
            ModLoader.registerBlock(wool3Stairs);
            ModLoader.addName(wool3Stairs, "Light Blue Wool Stairs");
            ModLoader.registerBlock(wool4Stairs);
            ModLoader.addName(wool4Stairs, "Yellow Wool Stairs");
            ModLoader.registerBlock(wool5Stairs);
            ModLoader.addName(wool5Stairs, "Lime Wool Stairs");
            ModLoader.registerBlock(wool6Stairs);
            ModLoader.addName(wool6Stairs, "Pink Wool Stairs");
            ModLoader.registerBlock(wool7Stairs);
            ModLoader.addName(wool7Stairs, "Gray Wool Stairs");
            ModLoader.registerBlock(wool8Stairs);
            ModLoader.addName(wool8Stairs, "Light Gray Wool Stairs");
            ModLoader.registerBlock(wool9Stairs);
            ModLoader.addName(wool9Stairs, "Cyan Wool Stairs");
            ModLoader.registerBlock(wool10Stairs);
            ModLoader.addName(wool10Stairs, "Purple Wool Stairs");
            ModLoader.registerBlock(wool11Stairs);
            ModLoader.addName(wool11Stairs, "Blue Wool Stairs");
            ModLoader.registerBlock(wool12Stairs);
            ModLoader.addName(wool12Stairs, "Brown Wool Stairs");
            ModLoader.registerBlock(wool13Stairs);
            ModLoader.addName(wool13Stairs, "Green Wool Stairs");
            ModLoader.registerBlock(wool14Stairs);
            ModLoader.addName(wool14Stairs, "Red Wool Stairs");
            ModLoader.registerBlock(wool15Stairs);
            ModLoader.addName(wool15Stairs, "Black Wool Stairs");
            //**
            ModLoader.addRecipe(new ItemStack(woolStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 0)});
            ModLoader.addRecipe(new ItemStack(wool1Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 1)});
            ModLoader.addRecipe(new ItemStack(wool2Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 2)});
            ModLoader.addRecipe(new ItemStack(wool3Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 3)});
            ModLoader.addRecipe(new ItemStack(wool4Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 4)});
            ModLoader.addRecipe(new ItemStack(wool5Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 5)});
            ModLoader.addRecipe(new ItemStack(wool6Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 6)});
            ModLoader.addRecipe(new ItemStack(wool7Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 7)});
            ModLoader.addRecipe(new ItemStack(wool8Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 8)});
            ModLoader.addRecipe(new ItemStack(wool9Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 9)});
            ModLoader.addRecipe(new ItemStack(wool10Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 10)});
            ModLoader.addRecipe(new ItemStack(wool11Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 11)});
            ModLoader.addRecipe(new ItemStack(wool12Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 12)});
            ModLoader.addRecipe(new ItemStack(wool13Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 13)});
            ModLoader.addRecipe(new ItemStack(wool14Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 14)});
            ModLoader.addRecipe(new ItemStack(wool15Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 15)});
            //*\\
            ModLoader.registerBlock(planks2Stairs);
            ModLoader.addName(planks2Stairs, "Pine Wood Stairs");
            ModLoader.registerBlock(planks3Stairs);
            ModLoader.addName(planks3Stairs, "Birch Wood Stairs");
            ModLoader.registerBlock(planks4Stairs);
            ModLoader.addName(planks4Stairs, "Jungle Wood Stairs");
            //**
            ModLoader.addRecipe(new ItemStack(planks2Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.planks, 1, 1)});
            ModLoader.addRecipe(new ItemStack(planks3Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.planks, 1, 2)});
            ModLoader.addRecipe(new ItemStack(planks4Stairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), new ItemStack(Block.planks, 1, 3)});
            //*\\
            ModLoader.registerBlock(sandStairs);
            ModLoader.addName(sandStairs, "Sand Stairs");
            ModLoader.registerBlock(gravelStairs);
            ModLoader.addName(gravelStairs, "Gravel Stairs");
            //**
            ModLoader.addRecipe(new ItemStack(sandStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.sand});
            ModLoader.addRecipe(new ItemStack(gravelStairs, 4), new Object [] {"#  ", "## ", "###", Character.valueOf('#'), Block.gravel});
            /*
            ModLoader.registerBlock(redstoneBlock);
            ModLoader.addName(redstoneBlock, "Redstone Block");
            ModLoader.addRecipe(new ItemStack(redstoneBlock, 1), new Object [] {"###", "###", "###", Character.valueOf('#'), Item.redstone});
            redstoneBlock.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/moblocks/redstoneBlock.png");
             */
    
            ModLoader.registerBlock(goldFence);
            ModLoader.addName(goldFence, "Gold Fence");
            ModLoader.addRecipe(new ItemStack(goldFence, 4), new Object [] {"###", "###", Character.valueOf('#'), Item.ingotGold});
    
            ModLoader.registerBlock(ironFence);
            ModLoader.addName(ironFence, "Iron Fence");
            ModLoader.addRecipe(new ItemStack(ironFence, 6), new Object [] {"###", "###", "   ", Character.valueOf('#'), Item.ingotIron});
            
            ModLoader.registerBlock(diamondFence);
            ModLoader.addName(diamondFence, "Diamond Fence");
            ModLoader.addRecipe(new ItemStack(diamondFence, 10), new Object [] { "###", "###", Character.valueOf('#'), Item.diamond});
           
            ModLoader.registerBlock(bedrockFence);
            ModLoader.addName(bedrockFence, "Bedrock Fence");
            ModLoader.addRecipe(new ItemStack(bedrockFence, 4), new Object [] {"###", "###", Character.valueOf('#'), Block.bedrock});
            
            ModLoader.registerBlock(stoneFence);
            ModLoader.addName(stoneFence, "Stone Fence");
            ModLoader.addRecipe(new ItemStack(stoneFence, 4), new Object [] {"###", "###", Character.valueOf('#'), Block.stone});
            
            ModLoader.registerBlock(glassFence);
            ModLoader.addName(glassFence, "Glass Fence");
            ModLoader.addRecipe(new ItemStack(glassFence, 4), new Object [] {"###", "###", Character.valueOf('#'), Block.glass});
           
            ModLoader.registerBlock(mossystoneFence);
            ModLoader.addName(mossystoneFence, "Mossystone Fence");
            ModLoader.addRecipe(new ItemStack(mossystoneFence, 4), new Object [] {"###", "###", Character.valueOf('#'), Block.cobblestoneMossy});
             
            ModLoader.registerBlock(brickFence);
            ModLoader.addName(brickFence, "Brick Fence");
            ModLoader.addRecipe(new ItemStack(brickFence, 4), new Object [] {"###", "###", Character.valueOf('#'), Item.brick});
            
            ModLoader.registerBlock(brickFence);
            ModLoader.addName(brickFence, "Brick Fence");
            ModLoader.addRecipe(new ItemStack(brickFence, 8), new Object [] {"###", "###", Character.valueOf('#'), Block.brick});
            //*\\
            ModLoader.registerBlock(woolFence);
            ModLoader.addName(woolFence, "Wool Fence");
            ModLoader.registerBlock(wool1Fence);
            ModLoader.addName(wool1Fence, "Orange Wool Fence");
            ModLoader.registerBlock(wool2Fence);
            ModLoader.addName(wool2Fence, "Magenta Wool Fence");
            ModLoader.registerBlock(wool3Fence);
            ModLoader.addName(wool3Fence, "Light Blue Wool Fence");
            ModLoader.registerBlock(wool4Fence);
            ModLoader.addName(wool4Fence, "Yellow Wool Fence");
            ModLoader.registerBlock(wool5Fence);
            ModLoader.addName(wool5Fence, "Lime Wool Fence");
            ModLoader.registerBlock(wool6Fence);
            ModLoader.addName(wool6Fence, "Pink Wool Fence");
            ModLoader.registerBlock(wool7Fence);
            ModLoader.addName(wool7Fence, "Gray Wool Fence");
            ModLoader.registerBlock(wool8Fence);
            ModLoader.addName(wool8Fence, "Light Gray Wool Fence");
            ModLoader.registerBlock(wool9Fence);
            ModLoader.addName(wool9Fence, "Cyan Wool Fence");
            ModLoader.registerBlock(wool10Fence);
            ModLoader.addName(wool10Fence, "Purple Wool Fence");
            ModLoader.registerBlock(wool11Fence);
            ModLoader.addName(wool11Fence, "Blue Wool Fence");
            ModLoader.registerBlock(wool12Fence);
            ModLoader.addName(wool12Fence, "Brown Wool Fence");
            ModLoader.registerBlock(wool13Fence);
            ModLoader.addName(wool13Fence, "Green Wool Fence");
            ModLoader.registerBlock(wool14Fence);
            ModLoader.addName(wool14Fence, "Red Wool Fence");
            ModLoader.registerBlock(wool15Fence);
            ModLoader.addName(wool15Fence, "Black Wool Fence");
            //**
            ModLoader.addRecipe(new ItemStack(woolFence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 0)});
            ModLoader.addRecipe(new ItemStack(wool1Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 1)});
            ModLoader.addRecipe(new ItemStack(wool2Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 2)});
            ModLoader.addRecipe(new ItemStack(wool3Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 3)});
            ModLoader.addRecipe(new ItemStack(wool4Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 4)});
            ModLoader.addRecipe(new ItemStack(wool5Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 5)});
            ModLoader.addRecipe(new ItemStack(wool6Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 6)});
            ModLoader.addRecipe(new ItemStack(wool7Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 7)});
            ModLoader.addRecipe(new ItemStack(wool8Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 8)});
            ModLoader.addRecipe(new ItemStack(wool9Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 9)});
            ModLoader.addRecipe(new ItemStack(wool10Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 10)});
            ModLoader.addRecipe(new ItemStack(wool11Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 11)});
            ModLoader.addRecipe(new ItemStack(wool12Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 12)});
            ModLoader.addRecipe(new ItemStack(wool13Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 13)});
            ModLoader.addRecipe(new ItemStack(wool14Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 14)});
            ModLoader.addRecipe(new ItemStack(wool15Fence, 4), new Object [] {"###", "###", Character.valueOf('#'), new ItemStack(Block.cloth, 1, 15)});
    }
    public void takenFromCrafting(EntityPlayer entityplayer, ItemStack itemstack, IInventory iinventory)
    {
    if(itemstack.itemID == mod_MoBlocks.bedrockStairs.blockID)
    {
            entityplayer.addStat(bedrock, 1);
    }
    }
    //*\\
    public boolean onTickInGame(float f, Minecraft minecraft)
    {
      if(minecraft.currentScreen == null)
      {
       creativeInventory = null;
      }
      return true;
    }
    public boolean onTickInGUI(float f, Minecraft minecraft, GuiScreen guiscreen)
    {
      if((guiscreen instanceof GuiContainerCreative) && !(creativeInventory instanceof GuiContainerCreative) && !minecraft.theWorld.isRemote)
      {
       Container container = ((GuiContainer)guiscreen).inventorySlots;
       List list = ((ContainerCreative)container).itemList;
       int i = 0;
       list.add(new ItemStack(stoneStairs, 1, i));
       list.add(new ItemStack(dirtStairs, 1, i));
       //list.add(new ItemStack(bedrockStairs, 1, i));
       list.add(new ItemStack(ironStairs, 1, i));
       list.add(new ItemStack(goldStairs, 1, i));
       list.add(new ItemStack(diamondStairs, 1, i));
       list.add(new ItemStack(glassStairs, 1, i));
       list.add(new ItemStack(clayStairs, 1, i));
       list.add(new ItemStack(lapisStairs, 1, i));
       list.add(new ItemStack(mossystoneStairs, 1, i));
       //*\\       
       list.add(new ItemStack(woolStairs, 1, i));
       list.add(new ItemStack(wool1Stairs, 1, i));
       list.add(new ItemStack(wool2Stairs, 1, i));
       list.add(new ItemStack(wool3Stairs, 1, i));
       list.add(new ItemStack(wool4Stairs, 1, i));
       list.add(new ItemStack(wool5Stairs, 1, i));
       list.add(new ItemStack(wool6Stairs, 1, i));
       list.add(new ItemStack(wool7Stairs, 1, i));
       list.add(new ItemStack(wool8Stairs, 1, i));
       list.add(new ItemStack(wool9Stairs, 1, i));
       list.add(new ItemStack(wool10Stairs, 1, i));
       list.add(new ItemStack(wool11Stairs, 1, i));
       list.add(new ItemStack(wool12Stairs, 1, i));
       list.add(new ItemStack(wool13Stairs, 1, i));
       list.add(new ItemStack(wool14Stairs, 1, i));
       list.add(new ItemStack(wool15Stairs, 1, i));
       list.add(new ItemStack(sandStairs, 1, i));
       list.add(new ItemStack(gravelStairs, 1, i));
       //*\\
       list.add(new ItemStack(Crafting2, 1, i));
       list.add(new ItemStack(Crafting3, 1, i));
       list.add(new ItemStack(Crafting4, 1, i));
      //*\\
      list.add(new ItemStack(planks2Stairs, 1, i));
      list.add(new ItemStack(planks3Stairs, 1, i));
      list.add(new ItemStack(planks4Stairs, 1, i));
      //*\\
      //list.add(new ItemStack(redstoneBlock, 1, i));
      
      list.add(new ItemStack(stoneFence, 1, i));
      //list.add(new ItemStack(bedrockStairs, 1, i));
      list.add(new ItemStack(ironFence, 1, i));
      list.add(new ItemStack(goldFence, 1, i));
      list.add(new ItemStack(diamondFence, 1, i));
      list.add(new ItemStack(glassFence, 1, i));
      list.add(new ItemStack(mossystoneFence, 1, i));
      list.add(new ItemStack(brickFence, 1, i));
      //*\\
      list.add(new ItemStack(wool1Fence, 1, i));
      list.add(new ItemStack(wool2Fence, 1, i));
      list.add(new ItemStack(wool3Fence, 1, i));
      list.add(new ItemStack(wool4Fence, 1, i));
      list.add(new ItemStack(wool5Fence, 1, i));
      list.add(new ItemStack(wool6Fence, 1, i));
      list.add(new ItemStack(wool7Fence, 1, i));
      list.add(new ItemStack(wool8Fence, 1, i));
      list.add(new ItemStack(wool9Fence, 1, i));
      list.add(new ItemStack(wool10Fence, 1, i));
      list.add(new ItemStack(wool11Fence, 1, i));
      list.add(new ItemStack(wool12Fence, 1, i));
      list.add(new ItemStack(wool13Fence, 1, i));
      list.add(new ItemStack(wool14Fence, 1, i));
      list.add(new ItemStack(wool15Fence, 1, i));
      }
      creativeInventory = guiscreen;
      return true;
    }


    private static GuiScreen creativeInventory;
    
   
    
    public String getVersion()
    {
            return "1.2.5";
    }

    
    
}