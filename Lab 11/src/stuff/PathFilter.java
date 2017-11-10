package stuff;

import java.io.File;
import java.io.FilenameFilter;

public class PathFilter implements FilenameFilter{

	@Override
	public boolean accept(File f, String filter) {
		return filter.endsWith(".txt");
	}

}
