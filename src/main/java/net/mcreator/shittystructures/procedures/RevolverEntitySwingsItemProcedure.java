package net.mcreator.shittystructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.shittystructures.init.ShittyStructuresModEntities;
import net.mcreator.shittystructures.entity.CoinEntity;

public class RevolverEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = new CoinEntity(ShittyStructuresModEntities.COIN.get(), _level);
			entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
			if (entityToSpawn instanceof Mob _mobToSpawn)
				_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
			world.addFreshEntity(entityToSpawn);
		}
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo((entity.getLookAngle().x + 5), (entity.getLookAngle().y + 5), (entity.getLookAngle().z + 5), 1);
	}
}
