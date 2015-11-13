package com.will.music.activity;

import com.will.music.R;

import android.os.Bundle;

public class SystemSettingActivity extends SettingActivity  {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.systemsetting);
		
		setBackButton();
		setTopTitle(getResources().getString(R.string.systemsetting_title));
	}
}
