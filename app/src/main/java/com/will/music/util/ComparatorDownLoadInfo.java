package com.will.music.util;

import java.util.Comparator;

import com.will.music.entity.DownLoadInfo;

public class ComparatorDownLoadInfo implements Comparator<DownLoadInfo> {

	@Override
	public int compare(DownLoadInfo object1, DownLoadInfo object2) {
		return object1.getId()-object2.getId();
	}

}
