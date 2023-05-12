/**
 * @(#)FileSystemTester.java
 *
 * FileSystemTester application
 *
 * @author
 * @version 1.00 2011/3/29
 */

import java.io.*;
import java.util.*;

public class FileSystemTester {

    public static void main(String[] args)
    {
		// printFiles(new File("c:\\test"));
		ArrayList<File> files = getFiles(new File("c:\\test"));
		for (File f : files)
		{
			System.out.println(f.getPath());
		}
    }


	public static void printFiles(File file)
	{
    	System.out.println(file.getPath());
		//if (file.isDirectory()) {
			File[] files = file.listFiles();
         if (files != null) {
   			for (File f : files)
   			{
   	    		printFiles(f);
   			}
         }
		//}
	}

public static ArrayList<File> getFiles(File file)
{
	ArrayList<File> filelist = new ArrayList<File>();
	filelist.add(file);
	File[] files = file.listFiles();
   if (files != null) {
   	for (File f : files)
   	{
   		//ArrayList<File> filelist2 = getFiles(f);
   		for (File f2 : getFiles(f))
   		{
   			filelist.add(f2);
   		}
   	}
   }
	return filelist;
}

public static ArrayList<File> getFiles2(File file)
{
	ArrayList<File> filelist = new ArrayList<File>();
	if (!file.isDirectory())
	{
		filelist.add(file);
		return filelist;
	}
	else
	{
		File[] files = file.listFiles();
		filelist.add(file);
		for (File f : files)
		{
			ArrayList<File> filelist2 = getFiles(f);
			for (File f2 : filelist2)
			{
				filelist.add(f2);
			}
		}
		return filelist;
	}
}

	/* experiments that may or may not work
	public static void printFilesSimple(File file)
	{
		System.out.println(file.getPath());
		File[] files = file.listFiles(); // doesn't work for files
		for (File f : files)
		{
    		printFilesSimple(f);
		}
	}

    public static void printFiles2(File file)
    {
    	File[] files = file.listFiles();
    	if (!file.isDirectory() || files.length == 0)
    	{
			System.out.println(file.getPath());
    	}
    	else
    	{
			System.out.println(file.getPath());
    		for (File f : files)
    		{
	    		printFiles(f);
    		}
    	}
    }

    private static void traverse(File directory)
    {
        File[] files = directory.listFiles();

        for (int i = 0; i < files.length; i++)
       	{
            System.out.println(files[i]);
            if (files[i].isDirectory() && files[i].canRead())
            {
                traverse(files[i]);
            }
        }
    }*/

}
