package com_pravi_Dec12;

import java.util.Scanner;

public class MediaPlayerElc 
{

	public static void main(String[] args) 
	{
		
		MusicPlayer1 m=new MusicPlayer1("o saiyaa");
		m.play();
		m.stop();
		m.pause();
		
		System.out.println();
		
		VideoPlayer v=new VideoPlayer("o sakii");
		v.play();
		v.stop();
		v.pause();
		
				
	}

	private static String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}

}

