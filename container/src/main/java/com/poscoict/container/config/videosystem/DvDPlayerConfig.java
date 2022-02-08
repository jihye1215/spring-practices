package com.poscoict.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscoict.container.videosystem.DigitalVideoDisc;
import com.poscoict.container.videosystem.DvDPlayer;

@Configuration
public class DvDPlayerConfig {
	
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	@Bean
	public DvDPlayer dvdPlayer() {
		return new DvDPlayer();
	}
	
	// 주입(Injection) 하기1
	// 
	
}
