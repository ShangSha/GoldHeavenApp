package com.goldheaven;


import net.youmi.android.AdManager;
import net.youmi.android.diy.DiyManager;
import net.youmi.android.diy.banner.DiyAdSize;
import net.youmi.android.diy.banner.DiyBanner;
import net.youmi.android.offers.OffersManager;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ADActivity extends Activity{

	private static final String TAG = "ADActivity";
	private Button showRecommendAppWallBtn;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "����AD");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad);
        
        AdManager.getInstance(this).init("ee6a63e204914eda",
				"6f7e2a256359c1db", true );
        OffersManager.getInstance(this).onAppLaunch();
        //չʾȫ������ǽ
        OffersManager.getInstance(this).showOffersWall();

    	//OffersManager.getInstance(this).showOffersWallDialog(this);
        
//        RelativeLayout adLayout=(RelativeLayout)findViewById(R.id.adLayout);
//        //demo 1 ����Banner : ����������32dp
//        DiyBanner banner = new DiyBanner(this, DiyAdSize.SIZE_MATCH_SCREENx32);//����߶�Ϊ32dp��AdSize����������Banner    
//        //demo 2 ����Banner : ��320dp����32dp
//        //DiyBanner banner = new DiyBanner(this, DiyAdSize.SIZE_320x32);//����߶�Ϊ32dp��AdSize����������Banner 
//        //������Banner���뵽������
//        adLayout.addView(banner);
        
        showRecommendAppWallBtn = (Button) findViewById(R.id.showRecommendAppWall);
        showRecommendAppWallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            	// չʾ����Ӧ���Ƽ�ǽ
            	//DiyManager.showRecommendWall(ADActivity.this);
            	
            }
        });
        //DiyManager.showRecommendWall(ADActivity.this);
    }
	
	
	@Override
	protected void onDestroy() {
		OffersManager.getInstance(this).onAppExit();
	}
}
