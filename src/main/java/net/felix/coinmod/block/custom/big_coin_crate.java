package net.felix.coinmod.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class big_coin_crate extends Block {
    public big_coin_crate(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.coinmod.big_coin_crate.tooltip.1"));
            tooltip.add(Text.translatable("tooltip.coinmod.big_coin_crate.tooltip.2"));
        } else {
            tooltip.add(Text.translatable("tooltip.coinmod.general_tip.tooltip.1"));
        }
        super.appendTooltip(stack, context, tooltip, options);
    }
}
