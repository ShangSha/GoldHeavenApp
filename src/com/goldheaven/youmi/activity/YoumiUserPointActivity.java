package com.goldheaven.youmi.activity;

import net.youmi.android.offers.PointsChangeNotify;
import net.youmi.android.offers.PointsManager;

import com.goldheaven.R;
import com.goldheaven.pay.activity.AlipayActivity;
import com.goldheaven.pay.activity.QQPayActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
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
        
        TextView alipay =  (TextView) findViewById(R.id.alipay);
        alipay.setClickable(true);
        alipay.setFocusable(true);
        alipay.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i(TAG, "点击支付宝兑奖页面");
				Intent intent = new Intent();
				intent.setClass(YoumiUserPointActivity.this, AlipayActivity.class);
				startActivity(intent);				
			}
		});
        
        TextView qq =  (TextView) findViewById(R.id.qq);
        qq.setClickable(true);
        qq.setFocusable(true);
        qq.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i(TAG, "点击qq兑奖页面");
				Intent intent = new Intent();
				intent.setClass(YoumiUserPointActivity.this, QQPayActivity.class);
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
