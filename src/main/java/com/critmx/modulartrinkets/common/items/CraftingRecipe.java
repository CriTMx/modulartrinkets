package com.critmx.modulartrinkets.common.items;

import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;

public class CraftingRecipe extends ShapedRecipe {
    public CraftingRecipe(ResourceLocation pId, String pGroup, int pWidth, int pHeight, NonNullList<Ingredient> pRecipeItems, ItemStack pResult) {
        super(pId, pGroup, pWidth, pHeight, pRecipeItems, pResult);
    }

    @Override
    public ItemStack assemble(CraftingContainer pInv) {
       boolean flag=false;
       for (int i=0; i<pInv.getContainerSize(); i++)
       {
           ItemStack itemUsed = pInv.getItem(i);
           if(!itemUsed.isEmpty())
           {
                //check if all used metal ingots are the same metal
           }

       }
       //check flag status
       //return result item with metal used as NBT, use metal used to determine result color
       return super.assemble(pInv);
    }
}
