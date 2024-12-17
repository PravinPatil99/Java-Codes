package com_pravi_Dec12;

public class VideoPlayer implements AdvanceMediaPlayer
{

	String video;
	
	
	public VideoPlayer(String video) {
		super();
		this.video = video;
		if(this.video.equals(""))
		{
			System.err.println("Title is not be empty string.");
		}
	}

	@Override
	public void play() 
	{

System.out.println("playing video:"+this.video);
		
	}

	@Override
	public void stop() 
	{
		System.out.println("stop video:"+this.video);
		
	}

	@Override
	public void pause() 
	{
		System.out.println("puseing video:"+this.video);
	}
	

}
