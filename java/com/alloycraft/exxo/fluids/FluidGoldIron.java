package com.alloycraft.exxo.fluids;

import com.alloycraft.exxo.Alloycraft;
import com.alloycraft.exxo.AlloycraftBlocks;

import net.minecraftforge.fluids.Fluid;

public class FluidGoldIron extends Fluid {

	public FluidGoldIron(String fluidName) {
		super(fluidName);
		this.viscosity = 20;
		this.block = AlloycraftBlocks.goldironfluidblock;
		this.canBePlacedInWorld();
		boolean canBePlacedInWorld = true;
		// TODO Auto-generated constructor stub
	}

}
