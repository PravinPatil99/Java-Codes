package com_pravi_Dec12;

public class MusicPlayer1 implements AdvanceMediaPlayer
{

	String song;
	
	public MusicPlayer1(String song) {
		super();
		this.song = song;
		
		if(this.song.equals(""))
		{
			System.err.println("Title is not be empty string.");
			System.exit(0);
		}
		
	}

	@Override
	public void play() 
	{
		
		System.out.println("Palying song:"+this.song);
		
	}

	@Override
	public void stop() 
	{
		System.out.println("Stopping song:"+this.song);
		
	}

	@Override
	public void pause() 
	{
		System.out.println("pausing song:"+this.song);
		
	}
	

}

