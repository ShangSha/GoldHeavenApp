package com.goldheaven;


import net.youmi.android.AdManager;
import net.youmi.android.offers.OffersManager;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class IndexActivity extends Activity{
	
	private static final String TAG = "IndexActivity";

	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "启动淘金天堂首页");
        super.onCreate(savedInstanceState);            
        setContentView(R.layout.youmi);
      
        
        Button task1 = (Button) findViewById(R.id.task1);
        task1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
		
				AdManager.getInstance(IndexActivity.this).init("ee6a63e204914eda",
						"6f7e2a256359c1db", true );
		        OffersManager.getInstance(IndexActivity.this).onAppLaunch();
		        //展示全屏积分墙
		        OffersManager.getInstance(IndexActivity.this).showOffersWall();		
			}
		});
        
        Button task2 = (Button) findViewById(R.id.task2);
        task2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
		
				AdManager.getInstance(IndexActivity.this).init("ee6a63e204914eda",
						"6f7e2a256359c1db", true );
		        OffersManager.getInstance(IndexActivity.this).onAppLaunch();
		        //展示全屏积分墙
		        OffersManager.getInstance(IndexActivity.this).showOffersWall();		
			}
		});
    }
	
	
	@Override
	protected void onDestroy() {
		OffersManager.getInstance(this).onAppExit();
	}
}
