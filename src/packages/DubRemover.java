package packages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JProgressBar;

/**
 *
 * @author user
 */
public class DubRemover
{
    private int leximet = 0;
    private int shkrimet = 0;
    
    /*
    Konstruktori
    */
    public DubRemover()
    {
    }
    
    public void NoDubFiles(String a, String b, JProgressBar jpb, boolean hasHeaders)
	    throws FileNotFoundException, IOException
    {
	BufferedReader reader = new BufferedReader(new FileReader(a));
	Set<String> lines = new HashSet<>();
	String line;
	
	int i = 0;
	String headers = "";
	if(hasHeaders == true){
	    headers = reader.readLine();
	    i++;
	}
	
	while ((line = reader.readLine()) != null) {
	    if(hasHeaders == true && i == 0){
	    }
	    else {
		lines.add(line);
		i++;
	    }
	    leximet = i;     
	}
	reader.close();
	
	BufferedWriter writer = new BufferedWriter(new FileWriter(b));
	if(hasHeaders == true){
	    writer.write(headers);
	    writer.newLine();
	    shkrimet++;
	}
	for (String unique : lines) {
	    writer.write(unique);
	    writer.newLine();
	    shkrimet++;
	    if(jpb != null)
		jpb.setValue((int)leximet / shkrimet);
	}
	writer.close();
    }
    
    public int rreshta_in(){
	return leximet;
    }
    
    public int rreshta_out(){
	return shkrimet;
    }
}