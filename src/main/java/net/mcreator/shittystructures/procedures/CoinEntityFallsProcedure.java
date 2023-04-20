package net.mcreator.shittystructures.procedures;

import net.minecraft.world.entity.Entity;

public class CoinEntityFallsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
