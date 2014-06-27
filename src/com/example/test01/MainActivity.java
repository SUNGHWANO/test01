package com.example.test01;

import org.apache.cordova.DroidGap;

import android.app.ActivityManager;
import android.os.Bundle;

public class MainActivity extends DroidGap {
	
	
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.init();
				
		appView.getSettings().setJavaScriptEnabled(true);
		finish finish = new finish(this, appView);
		appView.addJavascriptInterface(finish, "finish");
		
		super.loadUrl("file:///android_asset/www/main.html");
		
	}
	

	
}



