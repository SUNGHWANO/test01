package com.example.test01;

import org.apache.cordova.DroidGap;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Vibrator;
import android.support.v4.app.NotificationCompat;
import android.webkit.WebView;

public class finish {
	private WebView mAppView;
	private DroidGap mGap;
	//private MainActivity ma;
	
	public finish(DroidGap gap, WebView view){
		this.mAppView = view;
		this.mGap = gap;
	}
	
	@android.webkit.JavascriptInterface
	public void notif() {
		NotificationManager notimng = (NotificationManager)mGap.getSystemService(mGap.NOTIFICATION_SERVICE);
    PendingIntent pIntent = PendingIntent.getActivity(mGap, 0, 
    		new Intent(mGap,MainActivity.class), PendingIntent.FLAG_UPDATE_CURRENT);
    
   Notification notice = new NotificationCompat.Builder(mGap)
    .setContentTitle("제목")
    .setContentText("내용")
    .setSmallIcon(R.drawable.ic_launcher)
    .setTicker("안녕")
    .setAutoCancel(true)
    .setContentIntent(pIntent)
    .build();
    		
    notimng.notify(0, notice);
    
		/*
  	if ( notimng != null ) {
			notimng.cancel(0);
		}
  	*/
    
    Vibrator vibe = (Vibrator)mGap.getSystemService(mGap.VIBRATOR_SERVICE);         
    vibe.vibrate(1000);
    
	}

}