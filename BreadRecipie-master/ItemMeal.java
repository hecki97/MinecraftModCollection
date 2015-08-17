package net.minecraft.src;

public class ItemMeal extends Item{

	public ItemMeal(int par1)
    {
            super(par1);
            maxStackSize = 64;              
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

            if (par2World.getBlockMaterial(i, j, k) == Material.water)
            {
                par1ItemStack.stackSize--;

                if (par1ItemStack.stackSize <= 0)
                {
                    return new ItemStack(mod_BreadRecipie.dough);
                }

                if (!par3EntityPlayer.inventory.addItemStackToInventory(new ItemStack(mod_BreadRecipie.dough)))
                {
                    par3EntityPlayer.dropPlayerItem(new ItemStack(mod_BreadRecipie.dough.shiftedIndex, 1, 0));
                }
            }
        }
		return par1ItemStack;
		
    }
}
