package com.poscoict.container.config.videosystem.mixing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.poscoict.container.videosystem.DigitalVideoDisc;
import com.poscoict.container.videosystem.DvDPlayer;

/**
 *  JavaConfig2(DvDPlayerConfig) <----- JavaConfig1(DvDConfig)
 *                               import
 *  JavaConfig2 + JavaConfig1  
 */ 
@Configuration
@Import({DvDConfig.class})
public class DvDPlayerConfig {
	
	@Bean
	public DvDPlayer dvdPlayer(@Qualifier("avengersInfinityWar") DigitalVideoDisc dvd) {
		return new DvDPlayer();
	}
}
