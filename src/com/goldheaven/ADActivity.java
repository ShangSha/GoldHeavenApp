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
		Log.i(TAG, "����AD");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad);
        
        AdManager.getInstance(this).init("ee6a63e204914eda",
				"6f7e2a256359c1db", false);
        
        RelativeLayout adLayout=(RelativeLayout)findViewById(R.id.adLayout);
        //demo 1 ����Banner : ����������32dp
        DiyBanner banner = new DiyBanner(this, DiyAdSize.SIZE_MATCH_SCREENx32);//����߶�Ϊ32dp��AdSize����������Banner    
        //demo 2 ����Banner : ��320dp����32dp
        //DiyBanner banner = new DiyBanner(this, DiyAdSize.SIZE_320x32);//����߶�Ϊ32dp��AdSize����������Banner 
        //������Banner���뵽������
        adLayout.addView(banner);
        
        DiyManager.showRecommendWall(ADActivity.this);
    }
}
