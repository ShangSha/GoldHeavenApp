package com.goldheaven.youmi;


import net.youmi.android.AdManager;
import net.youmi.android.offers.OffersManager;

import com.goldheaven.ADActivity;
import com.goldheaven.IndexActivity;
import com.goldheaven.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class YoumiActivity extends Activity{
	
	private static final String TAG = "YouMiActivity";

	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "��������������ҳ");
        super.onCreate(savedInstanceState);            
        setContentView(R.layout.youmi);
      
        
        Button task1 = (Button) findViewById(R.id.task1);
        task1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
		
				AdManager.getInstance(YoumiActivity.this).init("ee6a63e204914eda",
						"6f7e2a256359c1db", true );
		        OffersManager.getInstance(YoumiActivity.this).onAppLaunch();
		        //չʾȫ������ǽ
		        OffersManager.getInstance(YoumiActivity.this).showOffersWall();		
			}
		});
        
        Button task2 = (Button) findViewById(R.id.task2);
        task2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
		
				AdManager.getInstance(YoumiActivity.this).init("ee6a63e204914eda",
						"6f7e2a256359c1db", true );
		        OffersManager.getInstance(YoumiActivity.this).onAppLaunch();
		        //չʾȫ������ǽ
		        OffersManager.getInstance(YoumiActivity.this).showOffersWall();		
			}
		});
        
        
        TextView text =  (TextView) findViewById(R.id.jiFen);
        text.setClickable(true);
        text.setFocusable(true);
        text.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
		
				Log.i(TAG, "��������û����׻��ֶһ�ҳ��");
				Intent intent = new Intent();
				intent.setClass(YoumiActivity.this, YoumiUserPointActivity.class);
				startActivity(intent);
			}
		});
        
    }
	
	
	@Override
	protected void onDestroy() {
		OffersManager.getInstance(this).onAppExit();
	}
}
