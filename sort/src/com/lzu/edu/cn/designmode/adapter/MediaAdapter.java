package com.lzu.edu.cn.designmode.adapter;
/**
 * 
 * @author junqiangliu
 *	适配器实现媒体播放接口 可以播放vlc以及mp4文件
 */
public class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer advancedMusicPlayer;
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer=new VlcPlayer();
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer=new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}

}
