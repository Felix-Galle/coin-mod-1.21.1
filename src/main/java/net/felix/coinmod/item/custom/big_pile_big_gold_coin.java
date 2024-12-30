package net.felix.coinmod.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class big_pile_big_gold_coin extends Item {
    public big_pile_big_gold_coin(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.coinmod.big_pile_big_gold_coin.tooltip.1"));
            tooltip.add(Text.translatable("tooltip.coinmod.big_pile_big_gold_coin.tooltip.2"));
        } else {
            tooltip.add(Text.translatable("tooltip.coinmod.general_tip.tooltip.1"));
        }
        super.appendTooltip(stack, context, tooltip, type);
    }
}
