package com.tenjava.entries.intronate67.t1;

import org.bukkit.entity.Player;

/**
 * Created by Server on 7/11/2014.
 */
public interface SubCommand{

    public boolean onCommand(final Player p, String[] args);

    public String help(Player p);

    public String permission();

}
