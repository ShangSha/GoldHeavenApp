package com.goldheaven;

import net.youmi.android.AdManager;
import net.youmi.android.diy.DiyManager;
import net.youmi.android.diy.banner.DiyAdSize;
import net.youmi.android.diy.banner.DiyBanner;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;

public class ADActivity extends Activity{

	private static final String TAG = "ADActivity";
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "启动AD");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad);
        
        AdManager.getInstance(this).init("ee6a63e204914eda",
				"6f7e2a256359c1db", false);
        
        RelativeLayout adLayout=(RelativeLayout)findViewById(R.id.adLayout);
        //demo 1 迷你Banner : 宽满屏，高32dp
        DiyBanner banner = new DiyBanner(this, DiyAdSize.SIZE_MATCH_SCREENx32);//传入高度为32dp的AdSize来定义迷你Banner    
        //demo 2 迷你Banner : 宽320dp，高32dp
        //DiyBanner banner = new DiyBanner(this, DiyAdSize.SIZE_320x32);//传入高度为32dp的AdSize来定义迷你Banner 
        //将积分Banner加入到布局中
        adLayout.addView(banner);
        
        DiyManager.showRecommendWall(ADActivity.this);
    }
}
