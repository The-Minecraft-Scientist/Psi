/*
 * This class is distributed as part of the Psi Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.spell.trick.potion;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;

import vazkii.psi.api.spell.Spell;

public class PieceTrickInvisibility extends PieceTrickPotionBase {

	public PieceTrickInvisibility(Spell spell) {
		super(spell);
	}

	@Override
	public MobEffect getPotion() {
		return MobEffects.INVISIBILITY;
	}

	@Override
	public boolean hasPower() {
		return false;
	}

}
