package net.mcreator.shittystructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class FuckYouRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.hurt(new DamageSource("fuck you").bypassArmor(), 20);
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 10, Explosion.BlockInteraction.DESTROY);
	}
}
