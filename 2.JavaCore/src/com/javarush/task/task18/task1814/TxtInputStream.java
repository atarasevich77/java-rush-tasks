package com.javarush.task.task18.task1814;

import java.io.*;
import java.util.Optional;

/* 
UnsupportedFileName
*/

public class TxtInputStream extends FileInputStream {

    private static final String FILE_TXT = ".txt";

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);

        if (!fileName.endsWith(FILE_TXT)) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }

}

