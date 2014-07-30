package com.goldheaven.youmi;

import net.youmi.android.AdManager;
import net.youmi.android.offers.OffersManager;

import com.goldheaven.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class YoumiUserPointActivity  extends Activity{
	
	private static final String TAG = "YouMiUserPointActivity";
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "启动用户有米积分兑换页面");
        super.onCreate(savedInstanceState);            
        setContentView(R.layout.youmi_userpoint);
      
        TextView userYoumiPoint =  (TextView) findViewById(R.id.user_youmi_point);

		userYoumiPoint.setText("122");
        
        TextView text =  (TextView) findViewById(R.id.zhuanQian);
        text.setClickable(true);
        text.setFocusable(true);
        text.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i(TAG, "点击进入有米任务主页");
				Intent intent = new Intent();
				intent.setClass(YoumiUserPointActivity.this, YoumiActivity.class);
				startActivity(intent);
				
			}
		});
        
    }
	
	
	@Override
	protected void onDestroy() {
		
	}
}
