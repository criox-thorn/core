package io.github.criox_thorn.criox_core;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class CrioxCoreItems {
	public static final Item CRIOX = new Item(new QuiltItemSettings());
	public static void register(ModContainer mod) {
		Registry.register(Registries.ITEM, new Identifier(mod.metadata().id(), "criox"), CRIOX);
	}
}
