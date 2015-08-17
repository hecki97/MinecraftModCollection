package net.minecraft.src;

public class BlockAdventure extends Block
{
    protected BlockAdventure(int par1, int par2)
    {
        super(par1, par2, Material.ground);
    }

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
    	ModLoader.openGUI(entityplayer, new GuiAdventure());
    }
    public int getBlockTextureFromSideAndMetadata(int i, int j)
    {
            return getBlockTextureFromSide(i);
    }

    public int getBlockTextureFromSide(int i)
    {
            
            if (i == 1)
            {
                    return mod_AdventureBlock.AdventureBlockTop;
            }
            else
            {
                    return mod_AdventureBlock.AdventureBlockSides;
            }
    }
}

