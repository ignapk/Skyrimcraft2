package net.skyrimcraft.src.entity;

import net.minecraft.entity.monster.EntityMob;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityImperialGuard extends EntityMob
{
	public EntityImperialGuard(World par1World) {
		super(par1World);
		setSize(1.0F, 1.75F);
		//if player's faction is stormcloak, attack...
	}
	
	protected void addRandomArmor()
    {
        this.setCurrentItemOrArmor(0, new ItemStack(Item.swordIron)); //imperial sword...
        /*this.setCurrentItemOrArmor(1, new ItemStack(SkyrimItems.imperialHelmet));
        this.setCurrentItemOrArmor(2, new ItemStack(SkyrimItems.imperialChestplate));
        this.setCurrentItemOrArmor(3, new ItemStack(SkyrimItems.imperialLeggings));
        this.setCurrentItemOrArmor(4, new ItemStack(SkyrimItems.imperialBoots));*/
    }
}