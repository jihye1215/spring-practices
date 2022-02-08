package com.poscoict.container.videosystem.mixing;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poscoict.container.config.videosystem.mixing.VideoSystemConfig;
import com.poscoict.container.videosystem.DvDPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {VideoSystemConfig.class})
public class DvDPlayerMixingConfig02Test {
	
	@Autowired
	private DvDPlayer dvdPlayer;

	@Test
	public void testPlayerNotNull() {
		assertNotNull(dvdPlayer);
	}

}
