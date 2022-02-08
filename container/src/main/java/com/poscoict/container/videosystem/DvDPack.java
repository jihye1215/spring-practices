package com.poscoict.container.videosystem;

import java.util.List;

public class DvDPack {
	private String title;
	private List<DigitalVideoDisc> dvds;
	
	public DvDPack(String title, List<DigitalVideoDisc> dvds) {
		this.title = title;
		this.dvds = dvds;
	}

}
