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
		// �� SDK ��ȡ���û�׬ȡ���ֵĶ���ʱ�����һʱ����ø÷���֪ͨ����
		// ���� EarnPointsOrderList ��һ�����ֶ����б������������ﴦ�������ϸ������
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
		// �����Ǹ���Ȥ��С���ܣ����û�׬ȡ����֮�󣬻���ǽ SDK ����֪ͨ������ʾһ����ȡ���ֵ���ʾ������û���������֪ͨ���ú����ᱻ���á�
		// ��ʱ��������������ʵ��һ����ת�����û���ת������ƺõ�һ�������˻����ҳ�棨��"�ҵ��˻�"֮��� Activity����
		// �ò����ǿ�ѡ�ģ������Ҫ�ر�֪ͨ��������ʾ�������
		// PointsManager.getInstance(context).setEnableEarnPointsNotification(false)
	}

}
