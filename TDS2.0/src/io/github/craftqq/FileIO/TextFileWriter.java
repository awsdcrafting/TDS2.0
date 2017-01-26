package io.github.craftqq.FileIO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TextFileWriter 
{
	
	private TextFileWriter()
	{
		
	}
	
	public static void writeFile(String name, String[] lines)
	{
		try
		{
			FileWriter fw = new FileWriter(name);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String s: lines)
			{
				bw.write(s);
				bw.newLine();
			}
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	
	public static void writeFile(File file, String[] lines)
	{
		try
		{
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String s: lines)
			{
				bw.write(s);
				bw.newLine();
			}
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
}
