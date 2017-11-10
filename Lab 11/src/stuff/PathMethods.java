package stuff;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

//contains methods for paths and files
public class PathMethods {

	// prints out the name of every file in the directory in
	public void printFiles(File in) {
		// creates the array of filenames
		String[] filenames = in.list();

		// loops through array filenames and prints out each name
		for (String s : filenames) {
			System.out.println(s);
		}
	}

	// returns all the files in the directory in
	public File[] getFiles(File in) {

		// creates the array of files
		File[] files = in.listFiles();

		return files;
	}

	// returns all .txts in the directory in
	public File[] getTxt(File in) {

		// filter for .txt files
		PathFilter p = new PathFilter();

		// creates the array of .txt files and applies the filter
		File[] txt = in.listFiles(p);

		return txt;
	}

	// checks to see if there is any missing files in the directory in
	public void isMissing(File in) {
		// objects
		Path path;

		// variables
		String base = "C:\\Code\\Backup\\SPEED\\SPEED_20171102_";
		// flag to indicate if there is missing files (0 is no missing)
		int flag = 0;

		// loops through all 10 possible files and checks to see if the file exists
		for (int i = 1; i <= 10; i++) {
			path = Paths.get(base + i + "of10.txt.txt");
			// if the file at Path path does not exist, set the flag and print out
			if (!Files.exists(path)) {
				flag = 1;
				System.out.println("File " + i + " does not exist");
			}
		}
		// if there was no missing files, print out no missing
		if (flag == 0)
			System.out.println("No files are missing");

	}
}
