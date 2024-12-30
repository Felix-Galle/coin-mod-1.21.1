package net.felix.coinmod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class crushed_amethyst extends Item {
    public crushed_amethyst(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.translatable("tooltip.coinmod.crushed_amethyst.tooltip.1"));
        tooltip.add(Text.translatable("tooltip.coinmod.crushed_amethyst.tooltip.2"));
        super.appendTooltip(stack, context, tooltip, type);
    }
}
