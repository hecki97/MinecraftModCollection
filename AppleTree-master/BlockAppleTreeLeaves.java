package net.minecraft.src;

import java.util.Random;

public class BlockAppleTreeLeaves extends BlockLeavesBase
{

    protected BlockAppleTreeLeaves(int i, int j)
    {
                    super(i, j, Material.leaves, false);
                    baseIndexInPNG = j;
                    setTickRandomly(true);
    }

    public int getBlockColor()
    {
        double d = 0.5D;
        double d1 = 1.0D;
        return ColorizerFoliage.getFoliageColor(d, d1);
    }
    
    
    public int getRenderColor(int par1)
    {
        if ((par1 & 3) == 1)
        {
            return ColorizerFoliage.getFoliageColorPine();
        }

        if ((par1 & 3) == 2)
        {
            return ColorizerFoliage.getFoliageColorBirch();
        }
        else
        {
            return ColorizerFoliage.getFoliageColorBasic();
        }
    }

    /**
     * Returns a integer with hex for 0xrrggbb with this color multiplied against the blocks color. Note only called
     * when first determining what to render.
     */
    public int colorMultiplier(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        int i = par1IBlockAccess.getBlockMetadata(par2, par3, par4);

        if ((i & 3) == 1)
        {
            return ColorizerFoliage.getFoliageColorPine();
        }

        if ((i & 3) == 2)
        {
            return ColorizerFoliage.getFoliageColorBirch();
        }

        int j = 0;
        int k = 0;
        int l = 0;

        for (int i1 = -1; i1 <= 1; i1++)
        {
            for (int j1 = -1; j1 <= 1; j1++)
            {
                int k1 = par1IBlockAccess.getBiomeGenForCoords(par2 + j1, par4 + i1).getBiomeFoliageColor();
                j += (k1 & 0xff0000) >> 16;
                k += (k1 & 0xff00) >> 8;
                l += k1 & 0xff;
            }
        }

        return (j / 9 & 0xff) << 16 | (k / 9 & 0xff) << 8 | l / 9 & 0xff;
    }
    
    
    public int idDropped(int i, Random random)
    {
                    if(random.nextInt(3) == 0)
                    {
                    return mod_AppleTree.AppleTreeSapling.blockID;
                    } else
                    {
                                    return -1;
                    }
    }

public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
	 if (par1World.isRemote)
     {
         return;
     }

     int i = par1World.getBlockMetadata(par2, par3, par4);

     if ((i & 8) != 0 && (i & 4) == 0)
     {
         byte byte0 = 4;
         int j = byte0 + 1;
         byte byte1 = 32;
         int k = byte1 * byte1;
         int l = byte1 / 2;

         if (adjacentTreeBlocks == null)
         {
             adjacentTreeBlocks = new int[byte1 * byte1 * byte1];
         }

         if (par1World.checkChunksExist(par2 - j, par3 - j, par4 - j, par2 + j, par3 + j, par4 + j))
         {
             for (int i1 = -byte0; i1 <= byte0; i1++)
             {
                 for (int l1 = -byte0; l1 <= byte0; l1++)
                 {
                     for (int j2 = -byte0; j2 <= byte0; j2++)
                     {
                         int l2 = par1World.getBlockId(par2 + i1, par3 + l1, par4 + j2);

                         if (l2 == Block.wood.blockID)
                         {
                             adjacentTreeBlocks[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = 0;
                             continue;
                         }

                         if (l2 == Block.leaves.blockID)
                         {
                             adjacentTreeBlocks[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = -2;
                         }
                         else
                         {
                             adjacentTreeBlocks[(i1 + l) * k + (l1 + l) * byte1 + (j2 + l)] = -1;
                         }
                     }
                 }
             }

             for (int j1 = 1; j1 <= 4; j1++)
             {
                 for (int i2 = -byte0; i2 <= byte0; i2++)
                 {
                     for (int k2 = -byte0; k2 <= byte0; k2++)
                     {
                         for (int i3 = -byte0; i3 <= byte0; i3++)
                         {
                             if (adjacentTreeBlocks[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l)] != j1 - 1)
                             {
                                 continue;
                             }

                             if (adjacentTreeBlocks[((i2 + l) - 1) * k + (k2 + l) * byte1 + (i3 + l)] == -2)
                             {
                                 adjacentTreeBlocks[((i2 + l) - 1) * k + (k2 + l) * byte1 + (i3 + l)] = j1;
                             }

                             if (adjacentTreeBlocks[(i2 + l + 1) * k + (k2 + l) * byte1 + (i3 + l)] == -2)
                             {
                                 adjacentTreeBlocks[(i2 + l + 1) * k + (k2 + l) * byte1 + (i3 + l)] = j1;
                             }

                             if (adjacentTreeBlocks[(i2 + l) * k + ((k2 + l) - 1) * byte1 + (i3 + l)] == -2)
                             {
                                 adjacentTreeBlocks[(i2 + l) * k + ((k2 + l) - 1) * byte1 + (i3 + l)] = j1;
                             }

                             if (adjacentTreeBlocks[(i2 + l) * k + (k2 + l + 1) * byte1 + (i3 + l)] == -2)
                             {
                                 adjacentTreeBlocks[(i2 + l) * k + (k2 + l + 1) * byte1 + (i3 + l)] = j1;
                             }

                             if (adjacentTreeBlocks[(i2 + l) * k + (k2 + l) * byte1 + ((i3 + l) - 1)] == -2)
                             {
                                 adjacentTreeBlocks[(i2 + l) * k + (k2 + l) * byte1 + ((i3 + l) - 1)] = j1;
                             }

                             if (adjacentTreeBlocks[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l + 1)] == -2)
                             {
                                 adjacentTreeBlocks[(i2 + l) * k + (k2 + l) * byte1 + (i3 + l + 1)] = j1;
                             }
                         }
                     }
                 }
             }
         }
     
     int k1 = adjacentTreeBlocks[l * k + l * byte1 + l];

     if (k1 >= 0)
     {
         par1World.setBlockMetadata(par2, par3, par4, i & -9);
     }
     else
     {
         removeLeaves(par1World, par2, par3, par4);
     }
 }
    }     
    

    private void removeLeaves(World world, int i, int j, int k)
    {
                    dropBlockAsItem(world, i, j, k, world.getBlockMetadata(i, j, k), 0);
                    world.setBlockWithNotify(i, j, k, 0);
    }

    public int quantityDropped(Random random)
    {
                    return random.nextInt(5) != 0 ? 0 : 1; //1 / # = chance | EX: 2 = 50% chance (1/2 = .5 chance)
                                                                                                                    //Random from 0 - (#-1)
                                                                                                                    //if the random number = 0
                                                                                                                    //drops 1 item
    }

    public int idDropped(int i, Random random, int j)
    {
                    if(random.nextInt(1) == 0)
                                    return Item.appleRed.shiftedIndex;
                    return mod_AppleTree.AppleTreeSapling.blockID; // Your fruit of choice //
                    //return Block.sapling.blockID;
    }

    public void harvestBlock(World world, EntityPlayer entityplayer, int i, int j, int k, int l)
    {
                    if(!world.isRemote && entityplayer.getCurrentEquippedItem() != null && entityplayer.getCurrentEquippedItem().itemID == Item.shears.shiftedIndex)
                    {
                                    entityplayer.addStat(StatList.mineBlockStatArray[blockID], 1);
                                    dropBlockAsItem_do(world, i, j, k, new ItemStack(mod_AppleTree.AppleTreeLeaves.blockID, 1, l & 3)); 
                    } else
                    {
                                    super.harvestBlock(world, entityplayer, i, j, k, l);
                    }
    }

    public void dropBlockAsItemWithChance(World world, int i, int j, int k, int l, float f, int i1)
    {
                    super.dropBlockAsItemWithChance(world, i, j, k, l, f, i1);
                    if (!world.isRemote && (l & 3) == 0 && world.rand.nextInt(25) == 0)
                    {
                                    dropBlockAsItem_do(world, i, j, k, new ItemStack(Item.appleRed, 1, 0));
                    }
    }
    
     public boolean isOpaqueCube()
    {
                    return false;
    }

    public void onEntityWalking(World world, int i, int j, int k, Entity entity)
    {
                    super.onEntityWalking(world, i, j, k, entity);
    }

    int adjacentTreeBlocks[];
    private int baseIndexInPNG;
{

}}
