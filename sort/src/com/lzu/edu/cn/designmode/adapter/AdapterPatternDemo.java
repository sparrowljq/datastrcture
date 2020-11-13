package com.lzu.edu.cn.designmode.adapter;
/**
 * 
 * @author junqiangliu
 *	适配器模式是作为两个不兼容接口之间的桥梁，这种设计模式属于结构型设计模式，
 *	它结合了两个独立接口的功能。
 *	这种设计模式涉及到一个单一的类，该类负责加入独立的或者不兼容的接口功能。
 *	适配器模式：讲一个类的接口转化为用户希望的另外一个接口。适配器模式使得原本
 *	由于接口不兼容而不能一起工作的那些类可以一起工作。
 *	（本例中音频播放器只能播放mp3文件，通过使用一个更高级的音频播放器来播放vlc
 *	和mp4文件。）
 */
public class AdapterPatternDemo {
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3", "黄家驹.mp3");
		audioPlayer.play("mp4", "孤独.mp4");
		audioPlayer.play("vlc", "呵呵.vlc");
		audioPlayer.play("avi", "视频.avi");
	}
}
