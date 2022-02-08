package com.poscoict.container.videosystem;

public class DvDPlayer {
	private DigitalVideoDisc dvd;
	
	public DvDPlayer() {
		
	}

	
	public DvDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}


	public void play() {
		dvd.play();
	}


	public DigitalVideoDisc getDvd() {
		return dvd;
	}


	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

}
