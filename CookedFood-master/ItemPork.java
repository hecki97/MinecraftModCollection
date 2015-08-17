package net.minecraft.src;

public class ItemPork extends ItemFood
{
	private int isFull;
	
	public ItemPork(int par1, int par2, float f, boolean b)
    {
		super(par1, par2, true);
        setMaxStackSize(64);               
        isFull = par2;
    }
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        MovingObjectPosition movingobjectposition = getMovingObjectPositionFromPlayer(par2World, par3EntityPlayer, true);

        if (movingobjectposition == null)
        {
            return par1ItemStack;
        }

        if (movingobjectposition.typeOfHit == EnumMovingObjectType.TILE)
        {
            int i = movingobjectposition.blockX;
            int j = movingobjectposition.blockY;
            int k = movingobjectposition.blockZ;

            if (!par2World.canMineBlock(par3EntityPlayer, i, j, k))
            {
                return par1ItemStack;
            }

            if (!par3EntityPlayer.canPlayerEdit(i, j, k))
            {
                return par1ItemStack;
            }

            if (par2World.getBlockMaterial(i, j, k) == Material.lava)
            {
                par1ItemStack.stackSize--;

                if (par1ItemStack.stackSize <= 0)
                {
                    return new ItemStack(Item.porkCooked);
                }

                if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.porkCooked)))
                {
                    par3EntityPlayer.dropPlayerItem(new ItemStack(Item.porkCooked, 1, 0));
                }
            }
            
        }
		return par1ItemStack;
    }


}