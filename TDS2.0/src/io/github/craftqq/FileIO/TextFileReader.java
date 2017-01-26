package io.github.craftqq.FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextFileReader 
{
	
	private TextFileReader()
	{
		
	}
	
	public static String[] readFile(String name) throws FileNotFoundException
	{
		ArrayList<String> al = new ArrayList<String>();
		try
		{
			FileReader fr = new FileReader(name);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while(s != null)
			{
				al.add(s);
				s = br.readLine();
			}
			br.close();
		}
		catch(FileNotFoundException FNFE)
		{
			throw FNFE;
		}
		catch(IOException IOE)
		{
			System.out.println(IOE);
			IOE.printStackTrace();
		}
		return al.toArray(new String[0]);
	}
	
	public static String[] readFile(File file) throws FileNotFoundException
	{
		ArrayList<String> al = new ArrayList<String>();
		try
		{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while(s != null)
			{
				al.add(s);
				s = br.readLine();
			}
			br.close();
		}
		catch(FileNotFoundException FNFE)
		{
			throw FNFE;
		}
		catch(IOException IOE)
		{
			System.out.println(IOE);
			IOE.printStackTrace();
		}
		return al.toArray(new String[0]);
	}
	
}
