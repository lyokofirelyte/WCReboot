package com.github.lyokofirelyte.r3b00t;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Niam extends JavaPlugin implements CommandExecutor {

	String WC = "§dWC §5// §d";
	
	public void onEnable(){
		
		
	    	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
	        {
	          public void run()
	          {
	        	  Bukkit.broadcastMessage(WC + "The server has been running successfully for two minutes so we've automatically scheduled the next reboot for 24 hours from now.");
	          }
	        }
	        , 2400L);	
	    	
	    	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
	        {
	          public void run()
	          {
	        	  wcReboot();
	          }
	        }
	        , 1728000);	
	    	
	 }
	
	public void onDisable(){
		
	}
	
	
	  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		  
		  if (cmd.getName().equals("reboot")){
			  wcReboot();
		  }
		  return true;
	  }
	


public void wcReboot(){
	
	
	Bukkit.broadcastMessage(WC + "The server will be executing the daily reboot in 5 minutes. It be down around 60 seconds.");
	
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
    {
      public void run()
      {
    	  Bukkit.broadcastMessage(WC + "The server will be executing the daily reboot in 4 minutes. It be down around 60 seconds.");
      }
    }
    , 1200L);
	
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
    {
      public void run()
      {
    	  Bukkit.broadcastMessage(WC + "The server will be executing the daily reboot in 3 minutes. It be down around 60 seconds.");
      }
    }
    , 2400L);	
	
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
    {
      public void run()
      {
    	  Bukkit.broadcastMessage(WC + "The server will be executing the daily reboot in 2 minutes. It be down around 60 seconds.");
      }
    }
    , 3600L);	
	
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
    {
      public void run()
      {
    	  Bukkit.broadcastMessage(WC + "The server will be executing the daily reboot in 1 minute. It be down around 60 seconds.");
      }
    }
    , 4800L);
	
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
    {
      public void run()
      {
    	  Bukkit.broadcastMessage(WC + "The server is now rebooting. We've saved the world, don't worry! See you in 60.");
      }
    }
    , 6000L);	
	
	Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable()
    {
      public void run()
      {
    	  Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "stop");
      }
    }
    , 6100L);
}

}
