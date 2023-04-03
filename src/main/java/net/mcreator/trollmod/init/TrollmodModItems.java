
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trollmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.trollmod.item.UranitemItem;
import net.mcreator.trollmod.item.FlashbangedItem;
import net.mcreator.trollmod.item.FlashbangItem;
import net.mcreator.trollmod.TrollmodMod;

public class TrollmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrollmodMod.MODID);
	public static final RegistryObject<Item> BOOMMOND = block(TrollmodModBlocks.BOOMMOND, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> NUKE = block(TrollmodModBlocks.NUKE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> FLASHBANG = REGISTRY.register("flashbang", () -> new FlashbangItem());
	public static final RegistryObject<Item> FLASHBANGED = REGISTRY.register("flashbanged", () -> new FlashbangedItem());
	public static final RegistryObject<Item> CITYBOMB = block(TrollmodModBlocks.CITYBOMB, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> URANITEM = REGISTRY.register("uranitem", () -> new UranitemItem());
	public static final RegistryObject<Item> URAN = block(TrollmodModBlocks.URAN, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
