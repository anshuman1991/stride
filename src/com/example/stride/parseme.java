package com.example.stride;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class parseme extends View {
	
	public parseme(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public void parse(String input_file)
	{
				//BufferedReader br = new BufferedReader(new FileReader("C:\\testing.txt"));
			double init_long=77.6070785522461;
		    double init_lat=12.919575838058407;
			
			int counter=0;
			String allLine="12.920977103494849;77.60753989219666\n12.92089344607752;77.60811924934387\n12.919847725996608;77.60786175727844";
			
			//while ((sCurrentLine = br.readLine()) != null) {
			while(counter<=2){	
			String sCurrentLine[]=allLine.split("\n");
			String seperated[]=sCurrentLine[counter].split(";");
				double longitude=Double.parseDouble(seperated[0]);
				double latitude=Double.parseDouble(seperated[1]);
				float position=Float.parseFloat(seperated[2]);
			counter++;
			
			}
 
	 
		

	}

}

