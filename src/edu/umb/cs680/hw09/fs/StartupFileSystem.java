package edu.umb.cs680.hw09.fs;

import edu.umb.cs680.hw09.apfs.*;
import java.time.LocalDateTime;

public class StartupFileSystem {
	public static void main(String[] args)
	{
        APFS apfs = new APFS("new apfs", 1024);
        APFS apfs2 = new APFS("second apfs", 1024);
        apfs.initFileSystem("new apfs", 1024);

        System.out.println(apfs.getCapacity());
        System.out.println(apfs.getName());

        ApfsDirectory root = new ApfsDirectory(null, "root", 0, LocalDateTime.now(), null); 
        ApfsDirectory home = new ApfsDirectory(root, "home", 0, LocalDateTime.now(), null);
        ApfsDirectory applications = new ApfsDirectory(root, "applications", 0, LocalDateTime.now(), null);
        ApfsDirectory code = new ApfsDirectory(home, "code", 0, LocalDateTime.now(), null);
        
        ApfsFile a = new ApfsFile(null, "a.txt", 8, LocalDateTime.now(), null);
        ApfsFile b = new ApfsFile(null, "b.txt", 16, LocalDateTime.now(), null);
        ApfsFile c = new ApfsFile(null, "c.txt", 32, LocalDateTime.now(), null);
        ApfsFile d = new ApfsFile(null, "d.txt", 64, LocalDateTime.now(), null);
        ApfsFile e = new ApfsFile(null, "e.txt", 128, LocalDateTime.now(), null);
        ApfsFile f = new ApfsFile(null, "f.txt", 256, LocalDateTime.now(), null);

        ApfsLink x = new ApfsLink(home, "linkToApplications", 0, LocalDateTime.now(), applications);
        ApfsLink y = new ApfsLink(code, "linkToFileB", 0, LocalDateTime.now(), b); 

        System.out.println(apfs.getRootDir().name);
        
        apfs.appendRootDir(root);
        System.out.println(apfs.getRootDir().name);
        root.appendChild(applications);
        root.appendChild(home);
        home.appendChild(code);
        applications.appendChild(a);
        applications.appendChild(b);
        home.appendChild(c);
        home.appendChild(d);
        home.appendChild(x);
        code.appendChild(e);
        code.appendChild(f);
        code.appendChild(y);

        for (FSElement apfsElement: home.getLinks())   {
            System.out.println("Link Name: " + apfsElement.getName());
            System.out.println("Link Size: " + apfsElement.getSize());
            System.out.println("Link Creation time: " + apfsElement.getCreationTime());
            System.out.println("Is link: " + apfsElement.isDirectory());
            System.out.println("Is directory: " + apfsElement.isDirectory());
            System.out.println("Is file: " + apfsElement.isDirectory());
            System.out.println("Link Parent name: " + apfsElement.getParent().getName());
            System.out.println("Link Target name: " + apfsElement.getTarget().getName());
            System.out.println("Link Target size: " + apfsElement.getTarget().getSize());
            System.out.println("Link Target Creation Time: " + apfsElement.getTarget().getCreationTime());
            System.out.println();
        }
        for (FSElement apfsElement: code.getLinks())   {
            System.out.println("Link Name: " + apfsElement.getName());
            System.out.println("Link Size: " + apfsElement.getSize());
            System.out.println("Link Creation time: " + apfsElement.getCreationTime());
            System.out.println("Is link: " + apfsElement.isDirectory());
            System.out.println("Link Parent name: " + apfsElement.getParent().getName());
            System.out.println("Link Target name: " + apfsElement.getTarget().getName());
            System.out.println("Link Target size: " + apfsElement.getTarget().getSize());
            System.out.println("Link Target Creation Time: " + apfsElement.getTarget().getCreationTime());
            System.out.println();
        }
	}
}




