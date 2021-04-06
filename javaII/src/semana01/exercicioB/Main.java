package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        final File folder = new File("C:\\");
        listFilesForFolder(folder);
    }

    static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                 System.out.println(fileEntry.getName()+" E um diretorio");
            } else {
                System.out.println(fileEntry.getName()+" E um arquivo");
            }
        }
    }

}

