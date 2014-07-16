package com.goldheaven;


import android.app.Activity;
import android.content.Intent;
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
        setContentView(R.layout.index);
        
        Button diyBtn = (Button) findViewById(R.id.diy);
		diyBtn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Log.i(TAG, "点击divButton");
				Intent intent = new Intent();
				intent.setClass(IndexActivity.this, ADActivity.class);
				startActivity(intent);
			}
		});
    }
	
}
