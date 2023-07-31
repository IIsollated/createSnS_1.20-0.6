package com.iisollated.create_scrapandsalvage.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class ScrapnelDirt extends Block {

    public ScrapnelDirt(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {

        if (!pEntity.this.getItemBySlot(EquipmentSlot.FEET) = ArmorItem.Type.BOOTS) {
            pEntity.hurt(pLevel.damageSources().cactus(), 1.5F);
        }
        super.stepOn(pLevel, pPos, pState, pEntity);

    }
}