package com.will.music.recevier;

import com.will.music.activity.BaseActivity;
import com.will.music.data.SystemSetting;
import com.will.music.service.DownLoadManager;
import com.will.music.service.MediaPlayerManager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoShutdownRecevier extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//更新配置文件
		new SystemSetting(context, true).setValue(SystemSetting.KEY_AUTO_SLEEP,"");
		
		//关闭程序
		context.sendBroadcast(new Intent(BaseActivity.BROADCASTRECEVIER_ACTON));
		//停止音乐
		context.startService(new Intent(MediaPlayerManager.SERVICE_ACTION).putExtra("flag", MediaPlayerManager.SERVICE_MUSIC_STOP));
		//停止下载
		context.startService(new Intent(DownLoadManager.SERVICE_ACTION).putExtra("flag", DownLoadManager.SERVICE_DOWNLOAD_STOP));
	}

}
