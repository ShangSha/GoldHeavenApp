package com.goldheaven.pay.activity;

import com.goldheaven.R;
import com.goldheaven.youmi.activity.YoumiUserPointActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class AlipayActivity extends Activity{
	
	private static final String TAG = "AlipayActivity";

	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "启动" + TAG);
        super.onCreate(savedInstanceState);            
        setContentView(R.layout.youmi_qqpay);
            
        TextView text =  (TextView) findViewById(R.id.back);
        text.setClickable(true);
        text.setFocusable(true);
        text.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
		
				Log.i(TAG, "点击进入用户有米积分兑换页面");
				Intent intent = new Intent();
				intent.setClass(AlipayActivity.this, YoumiUserPointActivity.class);
				startActivity(intent);
			}
		});

    }
}
