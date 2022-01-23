package net.mcreator.bloodlust.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloodlust.network.BloodlustModVariables;

public class MilkDrinkenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999,
					(int) (entity.getCapability(BloodlustModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BloodlustModVariables.PlayerVariables())).BloodlustAppleEaten));
	}
}
