package com.tsr.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.env.Environment;

@Configuration
@Import({ DevConfig.class, TestConfig.class })
@ComponentScan(basePackages = { "com.tsr.profile" })
public class RootConfig {
	@Autowired
	private Environment env;

	@Bean
	public Team team() {
		Team team = null;

		team = new Team();
		team.setTeamNo(Integer.parseInt(env.getProperty("teamNo")));
		team.setTeamName(env.getProperty("teamName"));

		return team;
	}

}
