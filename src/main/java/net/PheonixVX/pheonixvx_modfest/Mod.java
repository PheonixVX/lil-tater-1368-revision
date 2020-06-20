package net.PheonixVX.pheonixvx_modfest;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Mod implements ModInitializer {

	public static final LilTaterBlock Lil_Tater = new LilTaterBlock(FabricBlockSettings.of(Material.METAL));
	public static final ItemGroup ModfestGroup = FabricItemGroupBuilder.create(new Identifier("pheonix_modfest", "modfestgroup")).icon(() -> new ItemStack(Items.DRAGON_BREATH)).build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.BLOCK, new Identifier("pheonixvx_modfest", "lil_tater"), Lil_Tater);
		Registry.register(Registry.ITEM, new Identifier("pheonixvx_modfest", "lil_tater"), new BlockItem(Lil_Tater, new Item.Settings().group(ModfestGroup)));
	}
}
