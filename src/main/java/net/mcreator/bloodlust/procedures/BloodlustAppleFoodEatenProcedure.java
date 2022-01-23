package net.mcreator.bloodlust.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.bloodlust.network.BloodlustModVariables;

public class BloodlustAppleFoodEatenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(BloodlustModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new BloodlustModVariables.PlayerVariables())).BloodlustAppleEaten + 1;
			entity.getCapability(BloodlustModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BloodlustAppleEaten = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 99999,
					(int) (entity.getCapability(BloodlustModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new BloodlustModVariables.PlayerVariables())).BloodlustAppleEaten));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.HEAL, 1, 3));
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 200, 5));
	}
}
