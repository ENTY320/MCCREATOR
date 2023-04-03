
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.trollmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.trollmod.block.NukeBlock;
import net.mcreator.trollmod.block.CitybombBlock;
import net.mcreator.trollmod.block.BoommondBlock;
import net.mcreator.trollmod.TrollmodMod;

public class TrollmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrollmodMod.MODID);
	public static final RegistryObject<Block> BOOMMOND = REGISTRY.register("boommond", () -> new BoommondBlock());
	public static final RegistryObject<Block> NUKE = REGISTRY.register("nuke", () -> new NukeBlock());
	public static final RegistryObject<Block> CITYBOMB = REGISTRY.register("citybomb", () -> new CitybombBlock());
}
