/*
 * Programmed by Shephalika Shekhar
 * Class to extract features from Iris.txt file
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.channels.ReadPendingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ReadDataset {
	
	protected List<double[]> features=new ArrayList<>();
	protected List<String> label=new ArrayList<>();
	protected static int numberOfFeatures;
	
	public List<double[]> getFeatures()
	{
		return features;
	}
	
	public List<String> getLabel() 
	{
		return label;
	}
	
	void read(String s) throws NumberFormatException, IOException {
		
		File file=new File(s);
		
	try {
		BufferedReader readFile=new BufferedReader(new FileReader(file));
		String line;
		while((line=readFile.readLine()) != null)
			{
			
			 String[] split = line.split(",");
             double[] feature = new double[split.length - 1];
             numberOfFeatures = split.length-1;
            for (int i = 0; i < split.length - 1; i++)
                feature[i] = Double.parseDouble(split[i]);
            features.add(feature);
             String labels = split[feature.length];
            label.add(labels);
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}


void display()
{
	Iterator<double[]> itr=features.iterator();
	Iterator<String> sitr=label.iterator();
	while(itr.hasNext())
	{ 
		double db[]=itr.next();
		for(int i=0; i<4;i++)
	{
		System.out.print(db[i]+" ");
	}	
		String s=sitr.next() ;
		System.out.println(s);
		//System.out.println();
	}
	
}
}