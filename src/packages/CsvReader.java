/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packages;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CsvReader {
    private File f;
    
    public CsvReader(){
    }
    
    /**
     * @param s type String, should be a proper file path.
     */
    public CsvReader(String s){
	f = new File(s);
    }
    /**
     * @param inf type File
     */
    public CsvReader(File inf){
	f = inf;
    }
    /**
     * @return returns the File object of the constructor
     */
    public File returnFile(){
	return f;
    }
    
    public int lineNumber() throws FileNotFoundException, IOException
    {
	FileReader fr = new FileReader(f);
    	BufferedReader bft = new BufferedReader(fr);
    	int gjatesia = 0;
    	String line;
    	while((line = bft.readLine()) != null){
	    gjatesia += 1;
    	}
	bft.close();
	fr.close();
	return gjatesia;
    }
    
    public ArrayList<String> lineSplitter(String s)
    {
	ArrayList<String> words = new ArrayList<>();
	boolean notInsideComma = true;
	int start = 0;
	// int end = 0;
	for(int i = 0; i < s.length()-1; i++)
	{
	    if(s.charAt(i)==',' && notInsideComma)
	    {
		words.add(s.substring(start,i));
		start = i + 1;
	    }
	    else if(s.charAt(i)=='"')
		notInsideComma =! notInsideComma;
	}
	words.add(s.substring(start));
	return words;
    }
}