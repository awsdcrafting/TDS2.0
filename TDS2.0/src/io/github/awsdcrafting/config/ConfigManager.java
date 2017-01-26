package io.github.awsdcrafting.config;

import java.io.File;

public class ConfigManager
{
	private File configFile;

	public ConfigManager()
	{
		configFile = new File("Config.cfg");
		
	}

	public void load()
	{
		
		
		load(configFile);
	}
	
	public void load(String path){
		
		
		load(new File(path));
	}
	
	public void load(File file){
		
		
		
		
	}
	
}
