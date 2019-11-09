package com.sda.general.directorylister;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.concurrent.atomic.AtomicLong;



public class Lister {

    public static final String GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static long size(Path path) {

        final AtomicLong size = new AtomicLong(0);

        try {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

                    size.addAndGet(attrs.size());
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) {

                    System.out.println("skipped: " + file + " (" + exc + ")");
                    // Skip folders that can't be traversed
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) {

                    if (exc != null)
                        System.out.println("had trouble traversing: " + dir + " (" + exc + ")");
                    // Ignore errors traversing a folder
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            throw new AssertionError("walkFileTree will not throw IOException if the FileVisitor does not");
        }

        return size.get();
    }

public void listFilesForFolder(final File folder) {
            for (final File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {
                    System.out.println(GREEN + "["+fileEntry.getName()+"]" + " " + size(Paths.get(fileEntry.getPath()))/1024 +"KB");
                    listFilesForFolder(fileEntry);
                } else {
                    System.out.println(ANSI_RESET + fileEntry.getName() + " " + size(Paths.get(fileEntry.getPath()))/1024 +"KB");
                }
            }
        }
    }
