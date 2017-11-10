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
		
		//loads all files into the list directory
		p.printFiles(dir);

	}
	
}
