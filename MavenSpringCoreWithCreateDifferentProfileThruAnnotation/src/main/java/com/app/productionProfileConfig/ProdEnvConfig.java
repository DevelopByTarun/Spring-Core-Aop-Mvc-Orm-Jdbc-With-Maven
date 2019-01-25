package com.app.productionProfileConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import com.app.bean.User;

@Configuration
@Profile("prod")
public class ProdEnvConfig {
	
	@Bean
	@Scope("prototype")
	@Lazy
	public User user(){
		return new User(111, "Production Profile User");
	}
}
