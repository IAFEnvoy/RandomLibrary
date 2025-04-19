package com.iafenvoy.random.library.object;

import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;

public class ToolUtil {
    public static float getDigSpeed(BlockState state, ItemStack stack) {
        float speed = stack.getMiningSpeedMultiplier(state);
        if (speed > 1.0F) {
            int level = EnchantmentHelper.getLevel(Enchantments.EFFICIENCY, stack);
            if (level > 0 && !stack.isEmpty())
                speed += level * level + 1;
        }
        return speed;
    }
}
