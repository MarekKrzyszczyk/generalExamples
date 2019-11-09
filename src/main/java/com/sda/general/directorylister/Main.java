package com.sda.general.directorylister;

import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Lister lister = new Lister();
        lister.listFilesForFolder(Paths.get(args[0]).toFile());
        }
    }
