package com.goldheaven.youmi.receiver;

import android.content.Context;
import net.youmi.android.offers.EarnPointsOrderList;
import net.youmi.android.offers.OffersManager;
import net.youmi.android.offers.PointsReceiver;

public class MyYoumiPointsReceiver extends PointsReceiver {

	@Override
	protected void onEarnPoints(Context context, EarnPointsOrderList list) {
		// �� SDK ��ȡ���û�׬ȡ���ֵĶ���ʱ�����һʱ����ø÷���֪ͨ����
		// ���� EarnPointsOrderList ��һ�����ֶ����б������������ﴦ�������ϸ������
		  
	}

	@Override
	protected void onViewPoints(Context context) {
		// �����Ǹ���Ȥ��С���ܣ����û�׬ȡ����֮�󣬻���ǽ SDK ����֪ͨ������ʾһ����ȡ���ֵ���ʾ������û���������֪ͨ���ú����ᱻ���á�
		// ��ʱ��������������ʵ��һ����ת�����û���ת������ƺõ�һ�������˻����ҳ�棨��"�ҵ��˻�"֮��� Activity����
		// �ò����ǿ�ѡ�ģ������Ҫ�ر�֪ͨ��������ʾ�������
		// PointsManager.getInstance(context).setEnableEarnPointsNotification(false)
	}

}
