package com.poscoict.container.config.videosystem.mixing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 
 *  <------- JavaConfig1(DvDConfig) + JavaConfig2(DvDPlayerConfig)
 *   import
 *   
 *   JavaConfig1 + JavaConfig2
 *   
 */

@Configuration
@Import({DvDConfig.class, DvDPlayerConfig.class})
public class VideoSystemConfig {
	

}
