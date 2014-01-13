package sao.mods.client.renderer;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public abstract class RenderSAO extends Render
{
    @Override
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
        return this.getPath();
    }

    protected abstract ResourceLocation getPath();
}