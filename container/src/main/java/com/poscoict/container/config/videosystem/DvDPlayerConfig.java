package com.poscoict.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscoict.container.videosystem.Avengers;
import com.poscoict.container.videosystem.DigitalVideoDisc;
import com.poscoict.container.videosystem.DvDPlayer;

@Configuration
public class DvDPlayerConfig {
	
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	// 주입(Injection) 하기1
	// Bean 생성 메소드를 직접 호출하는 방법
	// 생성자 주입
	// @Bean
	public DvDPlayer dvdPlayer01() {
		return new DvDPlayer(avengers());
	}
	
	// 주입(Injection) 하기2
	// 파라미터로 빈 전달하기
	// 생성자 주입
	// @Bean
	public DvDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DvDPlayer(dvd);
	}
	
	// 주입(Injection) 하기3
	// 파라미터로 빈 전달하기
	// setter 주입하기
	@Bean
	public DvDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DvDPlayer dvdPlayer = new DvDPlayer();
		dvdPlayer.setDvd(dvd);
		
		return dvdPlayer;
	}
	
	// 같은 타입의 빈을 생성할 경우
	@Bean(name = "dvdPlayer04")
	public DvDPlayer dvdPlayer04(DigitalVideoDisc dvd) {
		return new DvDPlayer(dvd);
	}
}
