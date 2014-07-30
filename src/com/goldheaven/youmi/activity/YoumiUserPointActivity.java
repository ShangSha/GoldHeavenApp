package com.goldheaven.youmi.activity;

import net.youmi.android.AdManager;
import net.youmi.android.offers.OffersManager;
import net.youmi.android.offers.PointsChangeNotify;
import net.youmi.android.offers.PointsManager;

import com.goldheaven.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class YoumiUserPointActivity  extends Activity implements PointsChangeNotify{
	
	private static final String TAG = "YouMiUserPointActivity";
	
	private TextView userYoumiPoint;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "启动用户有米积分兑换页面");
        super.onCreate(savedInstanceState);            
        setContentView(R.layout.youmi_userpoint);
      
        userYoumiPoint =  (TextView) findViewById(R.id.user_youmi_point);
        int myPointBalance = PointsManager.getInstance(this).queryPoints();
		userYoumiPoint.setText(myPointBalance+"");
        
		PointsManager.getInstance(this).registerNotify(this);
		
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
		PointsManager.getInstance(this).unRegisterNotify(this);
	}


	@Override
	public void onPointBalanceChange(int pointsBalance) {
		userYoumiPoint.setText(pointsBalance+"");
	}
}
