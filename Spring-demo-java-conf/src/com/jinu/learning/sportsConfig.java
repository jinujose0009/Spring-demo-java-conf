package com.jinu.learning;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jinu.learning")
@PropertySource("classpath:sport.properties")
public class sportsConfig {
	// define bean for our sad fortune service
		@Bean
		public FortuneService SadfortuneservieImp() {
			return new SadfortuneservieImp();
		}
		
		// define bean for our swim coach AND inject dependency
		@Bean
		public Coach hokeyCoach() {
			//HokeyCoach myHokeyCoach = new HokeyCoach(SadfortuneservieImp());
			
			//return myHokeyCoach;
			return new HokeyCoach(SadfortuneservieImp());
		}
}
