package com.example.stride;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
 
public class MainActivity extends Activity {
     
    Button btnShowLocation;
     
    // GPSTracker class
    GPSManager gps;
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int width  = getWindowManager().getDefaultDisplay().getWidth();
        int height = getWindowManager().getDefaultDisplay().getHeight();
        Drawmap d=new Drawmap(this);
        d.width=width;
        d.height=height;
        setContentView(d);
  
		//Log.i("sk",width+" "+height+"hello");
		//Toast.makeText(getApplicationContext(), width, Toast.LENGTH_LONG).show();
      /*   
        btnShowLocation = (Button) findViewById(R.id.btnShowLocation);
         
        // show location button click event
        btnShowLocation.setOnClickListener(new View.OnClickListener() {
             
            @Override
            public void onClick(View arg0) {        
                // create class object
                /*gps = new GPSManager(MainActivity.this);
 
                // check if GPS enabled     
                if(gps.canGetLocation()){
                     
                    double latitude = gps.getLatitude();
                    double longitude = gps.getLongitude();
                     
                    // \n is for new line
                    Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();    
                }else{
                    // can't get location
                    // GPS or Network is not enabled
                    // Ask user to enable GPS/network in settings
                    gps.showSettingsAlert();
                }
            	Intent i=new Intent(getApplicationContext(),CompassActivity.class);
            	startActivity(i);
                 
            }
        });
        */
    }
}
     
