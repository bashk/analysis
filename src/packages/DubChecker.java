/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package packages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author user
 */
public class DubChecker
{
    private int allLines = 0;
    private int uniqueLines = 0;
    
    public DubChecker()
    {
    }
    
    public void NoDubFiles(String a) throws FileNotFoundException, IOException
    {
	Set<String> lines;
	BufferedReader reader = null;
	try {
	    reader = new BufferedReader(new FileReader(a));
	    lines = new HashSet<String>();
	    String line;
	    while ((line = reader.readLine()) != null) {
		lines.add(line);
		allLines++;
	    }
	}
	finally{
	    if(reader != null)
		reader.close();  
	}
	uniqueLines = lines.size();
    }
    
    public int returnAllLines(){
	return allLines;
    }
    
    public int returnUniqueLines(){
	return uniqueLines;
    }
}
