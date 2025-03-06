
package net.mcreator.turtken.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.turtken.entity.TurtkenEntity;
import net.mcreator.turtken.client.model.ModelTurtken;

public class TurtkenRenderer extends MobRenderer<TurtkenEntity, ModelTurtken<TurtkenEntity>> {
	public TurtkenRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTurtken<TurtkenEntity>(context.bakeLayer(ModelTurtken.LAYER_LOCATION)), 2.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(TurtkenEntity entity) {
		return ResourceLocation.parse("turtken:textures/entities/regularturt.png");
	}
}
