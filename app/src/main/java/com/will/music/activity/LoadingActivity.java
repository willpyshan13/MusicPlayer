package com.will.music.activity;

import com.will.music.R;
import com.will.music.data.SystemSetting;
import com.will.music.util.QuickTimer;
import com.will.music.util.QuickTimer.OnTimeListener;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class LoadingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// 无标题
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		// 全屏
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// 竖屏幕
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		super.onCreate(savedInstanceState);

		// 加载进入图片
		ImageView view = new ImageView(this);
		LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT);
		view.setLayoutParams(params);
		view.setScaleType(ScaleType.FIT_XY);
		view.setImageResource(R.drawable.main_bg05);
		setContentView(view);

		// 执行跳转
		new QuickTimer().start(new OnTimeListener() {
			@Override
			public void onTimer() {
				new SystemSetting(LoadingActivity.this, true).setValue(SystemSetting.KEY_ISSTARTUP, "false");
				Intent it = new Intent(LoadingActivity.this, ListMainActivity.class);
				startActivity(it);
				finish();
			}
		}, 1000);
	}
}
