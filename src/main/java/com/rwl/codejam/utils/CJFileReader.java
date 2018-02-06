package com.rwl.codejam.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rwl
 */
public class CJFileReader {

    private int totalLine = 0;

    private final BufferedReader in;

    public CJFileReader(String path) throws FileNotFoundException, IOException {
        in = new BufferedReader(new FileReader(path));
        totalLine = new Integer(in.readLine());
    }
    
    public CJFileReader(File file) throws FileNotFoundException, IOException {
        in = new BufferedReader(new FileReader(file));
        totalLine = new Integer(in.readLine());
    }
    
    public int getTotalLineNumber(){
        return totalLine;
    }

    public String nextLine() throws IOException {
        return in.readLine();
    }

}
