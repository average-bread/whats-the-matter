package cursedbread.whatsthematter.matterblocks;

import cursedbread.whatsthematter.WhatsTheMatter;
import net.minecraft.core.block.Block;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.world.World;

import java.util.Random;

public class BlueMatter extends Block {
	public BlueMatter(String key, int id) {
		super(key, id, Material.stone);
	}
	int i = 5;
	protected int ticks = 0;

	public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
		if (world.getBlockId(x+1, y, z) == 0)  {
			world.setBlock(x+1, y, z, WhatsTheMatter.blueMatter.id);
		} if (world.getBlockId(x-1, y, z) == 0)  {
			world.setBlock(x-1, y, z, WhatsTheMatter.blueMatter.id);
		}  if (world.getBlockId(x, y, z+1) == 0)  {
			world.setBlock(x, y, z+1, WhatsTheMatter.blueMatter.id);
		} if (world.getBlockId(x, y, z-1) == 0)  {
			world.setBlock(x, y, z-1, WhatsTheMatter.blueMatter.id);
		}
		world.setBlock(x, y, z, Block.fluidWaterFlowing.id);
	}
}