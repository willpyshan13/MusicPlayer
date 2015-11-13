package com.will.music.activity;

import com.will.music.R;

import android.os.Bundle;

public class AboutActivity extends SettingActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		setBackButton();
		setTopTitle(getResources().getString(R.string.about_title));
	}
}
