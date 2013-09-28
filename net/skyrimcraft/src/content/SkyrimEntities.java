package net.skyrimcraft.src.content;

import net.minecraft.client.model.ModelBiped;
import net.skyrimcraft.src.base.SkyrimRegistry;
import net.skyrimcraft.src.entity.EntityImperialGuard;
import net.skyrimcraft.src.render.RenderImperialGuard;

public class SkyrimEntities
{
	public static void register()
	{
		SkyrimRegistry.registerEntity(EntityImperialGuard.class, "Imperial Guard", 0xfff0a0, 0x445fec, new RenderImperialGuard(new ModelBiped(), 0.5F));
	}
}