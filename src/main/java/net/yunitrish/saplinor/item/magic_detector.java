package net.yunitrish.saplinor.item;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.yunitrish.saplinor.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class magic_detector extends Item {

    public magic_detector(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(context.getWorld().isClient()) {
            BlockPos position_clicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;

            for(int i=0;i<= position_clicked.getY() + 64;i++) {
                Block blockBelow = context.getWorld().getBlockState(position_clicked.down(i)).getBlock();

                if(isValueBlock(blockBelow)) {
                    outputValuableCoordinates(position_clicked.down(i),player,blockBelow);
                    foundBlock = true;
                    break;
                }
            }
            if(!foundBlock) {
                player.sendMessage(new TranslatableText("item.saplinor.magic_detector.no_valuables"),false);
            }
        }

        context.getStack().damage(1,context.getPlayer(),player -> player.sendToolBreakStatus(player.getActiveHand()));

        return super.useOnBlock(context);
    }

    private void outputValuableCoordinates(BlockPos blockPos, PlayerEntity player, Block blockBelow) {
        player.sendMessage(new LiteralText("Found " + blockBelow.asItem().getName().getString() + " at " + "(" + blockPos.getX() + "," + blockPos.getY() + "," + blockPos.getZ() + ")" ),false);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(new TranslatableText("item.saplinor.magic_detector.tooltip.shift"));
        } else {
            tooltip.add(new TranslatableText("item.saplinor.magic_detector.tooltip"));
        }
    }

    private boolean isValueBlock(Block block) {
        return Registry.BLOCK.getOrCreateEntry(Registry.BLOCK.getKey(block).get()).isIn(ModTags.Blocks.MAGIC_DETECTOR_DETECTABLE_BLOCKS);
    }

}
