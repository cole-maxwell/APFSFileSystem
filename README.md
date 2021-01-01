# APFSFileSystem
---- Program Description ----<br />

The /fs package contains the file system foundation classes, FileSystem & FSElement. <br />
The /apfs package contains the APFS file system elements, where APFS extends FileSystem,<br />
ApfsElement extends FSElement, and ApfsDirectory, ApfsFile, and ApfsLink extend ApfsElement.<br />
Other types of file systems like FAT32 or NTFS can added moduluary using the factory methods and <br />
composite and proxy design patterns established for the APFS file system here.<br />

---- Compile & Run ----<br />

**_cd_** to **_/APFSFileSystem_** and type **_ant -f build.xml_**.<br />

---- Prerequisite Steps & Environment Setup ----<br />

1. Install Ant from http://ant.apache.org/.
2. Configure your _ANT_HOME_ environment variable to reference the topmost directory of the Ant distribution.
3. Configure your _PATH_ environment variable to reference _ANT_HOME_ in a relative manner, by including _PATH=%ANT_HOME%\bin;_ for Windows or _PATH=$(ANT_HOME)/bin:_ for Linux.
4. Download the JUnit 5 JAR files from https://junit.org/junit5/.
5. Configure your _JUNIT_ environment variable to point to the directory containing those JAR files.

JUnit API JAR files:
* junit-jupitar-api.jar
* junit-jupitar-engine.jar
* junit-jupitar-params.jar
* apiguardian.jar
* opentest4j.jar

JUnit Platform JAR files:
* junit-platform-commons.jar
* junit-platform-engine.jar
* junit-platform.launcher.jar
* junit-platform-runner.jar:
* junit-platform-suite-api.jar
