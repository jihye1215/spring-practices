package com.poscoict.container.videosystem.mixing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poscoict.container.config.videosystem.mixing.DvDPlayerConfig;
import com.poscoict.container.videosystem.DvDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DvDPlayerConfig.class})
public class DvDPlayerMixingConfig01Test {
	
	@Autowired
	private DvDPlayer dvdPlayer;

	@Test
	public void testPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}

}
