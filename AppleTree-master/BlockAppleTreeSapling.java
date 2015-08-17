package net.minecraft.src;

import java.util.Random;

public class BlockAppleTreeSapling extends BlockFlower
{

    protected BlockAppleTreeSapling(int i, int j)
    {
                    super(i, j);
                    float f = 0.4F;
                    setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    public void updateTick(World world, int i, int j, int k, Random random)
    {
                    if(world.isRemote)
                    {
                                    return;
                    }
                    super.updateTick(world, i, j, k, random);
                    if(world.getBlockLightValue(i, j + 1, k) >= 9 && random.nextInt(25) == 0)
                    {
                                    int l = world.getBlockMetadata(i, j, k);
                                    if((l & 8) == 0)
                                    {
                                                    world.setBlockMetadataWithNotify(i, j, k, l | 8);
                                    } else
                                    {
                                                    growTree(world, i, j, k, random);
                                    }
                    }
    }

    public void growTree(World world, int i, int j, int k, Random random)
    {
                    int l = world.getBlockMetadata(i, j, k) & 3;
                    world.setBlock(i, j, k, 0);
                    Object obj = null;
                    if(l == 1)
                    {
                                    obj = new WorldGenTaiga2(true);
                    } else
                    if(l == 2)
                    {
                                    obj = new WorldGenForest(true);
                    }
                    else
                    {
                                    obj = new WorldGenAppleTrees();
                                   
                    }
                    if (!((WorldGenerator) (obj)).generate(world, random, i, j, k))
                    {
                                    world.setBlockAndMetadata(i, j, k, blockID, l);
                    }
    }

    public int idDropped(int i, Random random)
    {
                    return mod_AppleTree.AppleTreeSapling.blockID;
    }

public boolean blockActivated(World world, int i, int j, int k, EntityPlayer entityplayer)
{
                            ItemStack equipped = entityplayer.getCurrentEquippedItem();
                            if (equipped == null)
                            {
                                                            return false;
                            }
                            if ((equipped.getItem() == Item.dyePowder) && (equipped.getItemDamage() == 15)) //if bone meal
                            {
                                                            growTree(world, i, j, k, world.rand);
                                                            equipped.stackSize -= 1;
                            }
                            return false;
}

}