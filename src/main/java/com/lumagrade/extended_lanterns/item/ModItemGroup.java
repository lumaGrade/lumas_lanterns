package com.lumagrade.extended_lanterns.item;

import com.lumagrade.extended_lanterns.ExtendedLanterns;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TEMPLATE_GROUP = FabricItemGroupBuilder.build(new Identifier(ExtendedLanterns.MOD_ID, "template_group"), () -> new ItemStack(ModItems.TEMPLATE_ITEM));
}
