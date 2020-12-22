package edu.umb.cs680.hw09.fs;
import edu.umb.cs680.hw09.apfs.*;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ApfsFileSystemTest {

	@Test
	public void verifyRootDirectoryNameEquality() {
		APFS apfs = new APFS("new apfs", 1024);
		apfs.initFileSystem("new apfs", 1024);
		ApfsDirectory root = new ApfsDirectory(null, "root", 0, LocalDateTime.now(), null); 
		apfs.appendRootDir(root);
		Object expected = "root";
		Object actual = root.getName();
		assertEquals(expected, actual);
	}
}