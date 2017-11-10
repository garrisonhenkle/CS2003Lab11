package stuff;

import java.io.File;
import java.io.FilenameFilter;

public class PathMethods {

	public void printFiles(File in) {
		String[] filenames = in.list();

		for (String s : filenames) {
			System.out.println(s);
		}
	}

	public File[] getFiles(File in) {

		File[] files = in.listFiles();

		return files;
	}
	
	public File[] getTxt(File in) {
		
		PathFilter p = new PathFilter();
		
		File[] txt = in.listFiles(p);
		
		return txt;
	}
}
