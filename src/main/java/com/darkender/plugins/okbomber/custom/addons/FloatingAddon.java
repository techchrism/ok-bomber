package com.darkender.plugins.okbomber.custom.addons;

import com.darkender.plugins.okbomber.custom.TNTAddon;
import org.bukkit.entity.TNTPrimed;

public class FloatingAddon extends TNTAddon
{
    public FloatingAddon()
    {
        super("addon-floating");
    }
    
    @Override
    public boolean conflictsWith(TNTAddon other)
    {
        return other.equals(STICKY_ADDON);
    }
    
    @Override
    public String getName()
    {
        return "Floating";
    }
    
    @Override
    public String getDescription()
    {
        return "Causes the TNT to float upwards";
    }
    
    @Override
    public void onIgnite(TNTPrimed tnt)
    {
        tnt.setGravity(false);
        tnt.setVelocity(tnt.getVelocity().setY(1));
    }
}