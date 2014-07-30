package com.goldheaven.youmi.receiver;

import android.content.Context;
import android.util.Log;
import net.youmi.android.offers.EarnPointsOrderInfo;
import net.youmi.android.offers.EarnPointsOrderList;
import net.youmi.android.offers.OffersManager;
import net.youmi.android.offers.PointsReceiver;

public class MyYoumiPointsReceiver extends PointsReceiver {
	private static final String TAG = "MyYoumiPointsReceiver";
	
	@Override
	protected void onEarnPoints(Context context, EarnPointsOrderList list) {
		// 当 SDK 获取到用户赚取积分的订单时，会第一时间调用该方法通知您。
		// 参数 EarnPointsOrderList 是一个积分订单列表，您可以在这里处理积分详细订单。
		if(list!=null && !list.isEmpty()){
			int size = list.size();
			for (int i = 0; i < size; i++) {
				EarnPointsOrderInfo order = list.get(i);
				Log.i(TAG, order.getCustomUserID());
			}
		}
		
		
	}

	@Override
	protected void onViewPoints(Context context) {
		// 这里是个有趣的小功能，当用户赚取积分之后，积分墙 SDK 会在通知栏上显示一条获取积分的提示，如果用户点击了这个通知，该函数会被调用。
		// 这时候您可以在这里实现一个跳转，让用户跳转到您设计好的一个积分账户余额页面（如"我的账户"之类的 Activity）。
		// 该操作是可选的，如果需要关闭通知栏积分提示，请调用
		// PointsManager.getInstance(context).setEnableEarnPointsNotification(false)
	}

}
