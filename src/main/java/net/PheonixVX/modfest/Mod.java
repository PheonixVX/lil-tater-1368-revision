package net.PheonixVX.modfest;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mod implements ModInitializer {

	public static final LilTaterBlock Lil_Tater = new LilTaterBlock(FabricBlockSettings.of(Material.METAL));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.BLOCK, new Identifier("modfest", "lil_tater"), Lil_Tater);
		Registry.register(Registry.ITEM, new Identifier("modfest", "lil_tater"), new BlockItem(Lil_Tater, new Item.Settings().group(ItemGroup.MISC)));
	}
}
