package io.github.awsdcrafting.config;

import java.io.File;
import java.io.FileNotFoundException;

import io.github.craftqq.FileIO.TextFileReader;

public class ConfigManager
{
	private File defaultConfigFile;

	public ConfigManager()
	{
		defaultConfigFile = new File("Config.cfg");

	}

	public void load()
	{
		load(defaultConfigFile);
	}

	public void load(String path)
	{
		load(new File(path));
	}

	public void load(File file)
	{
		String[] config = null;
		try
		{
			config = TextFileReader.readFile(file);
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		for(int i = 0;i<config.length;i++){
			if(config[i].startsWith("#")){
				continue;
			}
			
			
			
			
		}
	}

}
