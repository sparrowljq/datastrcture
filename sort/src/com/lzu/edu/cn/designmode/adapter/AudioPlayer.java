package com.lzu.edu.cn.designmode.adapter;
/**
 * 
 * @author junqiangliu
 * 自动播放器仅支持mp3文件的播放 所以使用适配器来支持其他格式文件的支持
 */
public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("播放mp3文件:"+fileName);
		}else if(audioType.equalsIgnoreCase("vlc")||
				audioType.equalsIgnoreCase("mp4")) {
			mediaAdapter=new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("播放文件"+audioType+"格式不支持");
		}
	}

}
