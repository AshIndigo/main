package bcblocks.twoinputfurnace.tifcare;

import bcblocks.twoinputfurnace.InputFurnace;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InputFurnaceRecipes
{
    public InputFurnaceRecipes()
    {
    }

    public static ItemStack getSmeltingResult(int i, int j)
    {
        return getOutput(i, j);
    }

    private static ItemStack getOutput(int i, int j)
    {
        if (i == Item.coal.itemID && j == Item.ingotIron.itemID || i == Item.ingotIron.itemID && j == Item.coal.itemID)
        {
            return new ItemStack(Item.ingotGold, 1);
        }
        if (i == InputFurnace.item1 && j == InputFurnace.item2 || i == InputFurnace.item2 && j == InputFurnace.item1)
        {
            return new ItemStack(Item.ingotGold, 1);
        }
		return null;
    }
}