package com.example.stride;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class Drawmap extends View{
int width;
int height;
	public Drawmap(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public void onDraw(Canvas canvas)
	{
		
		//getting screen resolution

		Log.i("sk",width+" "+height+" hello in drawmap");
		Paint myPaint = new Paint();
        myPaint.setColor(Color.GREEN);
        myPaint.setStyle(Paint.Style.STROKE);
        myPaint.setStrokeWidth(3);
        float a=width/2;
        float b=height-200;
		String co_ords="0,200@MRD:200,200@Techpark";
		String co_ordsin[]=co_ords.split(":");
		Path path=new Path();
		path.moveTo(a,b);
		
		for(int i=0;i<co_ordsin.length;i++)
		{
			String node_all[]=co_ordsin[i].split("@");
			String x[]=node_all[0].split(",");
			String node_name=node_all[1];
			myPaint.setTextSize(10);
			myPaint.setColor(Color.BLUE);
			myPaint.setStrokeWidth(1);
			
			canvas.drawText(node_name,a+Float.parseFloat(x[0]),b-Float.parseFloat(x[1])-10,myPaint);
			
			myPaint.setColor(Color.GREEN);
			path.lineTo(a+Float.parseFloat(x[0]),b-Float.parseFloat(x[1]));
		}
		
        //canvas.drawRect(10, 10, 100, 100, myPaint);
        
       
        //path.lineTo(300,300);
       
        canvas.drawPath(path, myPaint);
        
	}

}
