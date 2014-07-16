package com.goldheaven;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ADActivity extends Activity{

	private static final String TAG = "ADActivity";
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
		Log.i(TAG, "Æô¶¯AD");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad);
    }
}
