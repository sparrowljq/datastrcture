package com.lzu.edu.cn.designmode.adapter;

public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVlc(String fileName) {
		//什么都不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("播放mp4文件:"+fileName);
		
	}

}
