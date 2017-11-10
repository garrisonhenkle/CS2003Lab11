package stuff;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class PathStuff {	
	
	//main
	public static void main(String[] args) {
		//PathMethods object to call other methods
		PathMethods p = new PathMethods();
		
		//variables
		File dir = new File("C:\\Code\\Backup\\SPEED");
		File[] directory;
		File[] textfiles;
		
		//prints all files in the array directory
		System.out.println("Files in " + dir + ":\n");
		p.printFiles(dir);
		
		//loads all files into the array directory
		directory = p.getFiles(dir);
		
		//loads all files into the array textfiles
		textfiles = p.getTxt(dir);
		
		//prints out all the files in the array textfiles
		System.out.println("Text files in " + dir + ":\n");
		for(File f: textfiles) {
			System.out.println(f);
		}
		
		//checks to see if there is any files missing from the SPEED .txt files
		p.isMissing(dir);

	}
	
}
