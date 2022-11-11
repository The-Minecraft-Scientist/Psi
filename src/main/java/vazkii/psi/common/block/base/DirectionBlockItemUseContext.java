/*
 * This class is distributed as part of the Psi Mod.
 * Get the Source Code in github:
 * https://github.com/Vazkii/Psi
 *
 * Psi is Open Source and distributed under the
 * Psi License: https://psi.vazkii.net/license.php
 */
package vazkii.psi.common.block.base;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.core.Direction;

public class DirectionBlockItemUseContext extends BlockPlaceContext {

	private Direction horizontalFacing;

	public DirectionBlockItemUseContext(UseOnContext itemUseContext, Direction horizontalFacing) {
		super(itemUseContext);
		this.horizontalFacing = horizontalFacing;
	}

	@Override
	public Direction getHorizontalDirection() {
		return horizontalFacing.getAxis() == Direction.Axis.Y ? Direction.NORTH : horizontalFacing;
	}

	@Override
	public Direction getNearestLookingDirection() {
		return hitResult.getDirection();
	}

	@Override
	public Direction[] getNearestLookingDirections() {
		switch (this.hitResult.getDirection()) {
		case DOWN:
		default:
			return new Direction[] { Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST, Direction.UP };
		case UP:
			return new Direction[] { Direction.DOWN, Direction.UP, Direction.NORTH, Direction.EAST, Direction.SOUTH, Direction.WEST };
		case NORTH:
			return new Direction[] { Direction.DOWN, Direction.NORTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.SOUTH };
		case SOUTH:
			return new Direction[] { Direction.DOWN, Direction.SOUTH, Direction.EAST, Direction.WEST, Direction.UP, Direction.NORTH };
		case WEST:
			return new Direction[] { Direction.DOWN, Direction.WEST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.EAST };
		case EAST:
			return new Direction[] { Direction.DOWN, Direction.EAST, Direction.SOUTH, Direction.UP, Direction.NORTH, Direction.WEST };
		}
	}
}
