package net.minecraft.src;

import java.util.Random;

public class mod_AppleTree extends BaseMod
{

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.2.5";
	}

	@Override
	public void load() {
        
		
		ModLoader.addRecipe(new ItemStack(AppleTreeSapling, 4), new Object [] {"#", '#', Item.appleRed});
		
		
		
		
		//Registers the Leaves and sets its In-Game-Name (IGN)
        ModLoader.registerBlock(AppleTreeLeaves);
        ModLoader.addName(AppleTreeLeaves, "AppleTree Leaves");

        ModLoader.registerBlock(AppleTreeSapling);
                ModLoader.addName(AppleTreeSapling, "AppleTree Sapling");


                
                AppleTreeLeaves.blockIndexInTexture = ModLoader.addOverride("/terrain.png", "/appletreeleaves.png");
	}
                //Creates the blocks and adds its properties (ID, Name, How long it takes to break, Explosion Resistance, glowing value)
        public static final Block AppleTreeLeaves;

        public static final Block AppleTreeSapling;

        
        static
        {
                AppleTreeSapling = (new BlockAppleTreeSapling(245, ModLoader.addOverride("/terrain.png", "/appletreesapling.png"))).setStepSound(Block.soundGrassFootstep).setHardness(0.1F).setBlockName("Tree AppleTree Sapling");
                AppleTreeLeaves = (new BlockAppleTreeLeaves(246, 0).setStepSound(Block.soundGrassFootstep).setBlockName("AppleTreeLeaves").setHardness(0.25F).setResistance(1F).setLightValue(1F));
        
        }

        
        

        //Makes it naturally generate (P.S: to change the biome in which it spawns, change BiomeGenDesert to what you want! Like BiomeGenForest)

        //Biome Choices: Coming soon! All I know is Desert, Tiaga, and Forest XD

         //the int il = chunkx + rand.nextInt(16);, the int jl = rand.nextInt(64);, and int kl = chunkz + rand.nextInt(16); are where it spawns in a chunk!

        public void generateSurface(World world, Random rand, int chunkx, int chunkz)
                {                                               
        for (int l = 0; l<45; l++)
                {
                int il = chunkx + rand.nextInt(16);
                int jl = rand.nextInt(64);
                int kl = chunkz + rand.nextInt(16);
                }
                BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(chunkx, chunkz);
        WorldGenAppleTrees tree = new WorldGenAppleTrees(); 
                 if(biome instanceof BiomeGenDesert)
                 if(biome instanceof BiomeGenForest)
                 if(biome instanceof BiomeGenPlains){
                 for(int x = 0; x < 1; x++)
                        {
                         int Xcoord = chunkx + rand.nextInt(16);
                         int Zcoord = chunkz + rand.nextInt(16);
                         int i = world.getHeightValue(Xcoord, Zcoord);
                         tree.generate(world, rand, Xcoord, i, Zcoord);
         }}}}


