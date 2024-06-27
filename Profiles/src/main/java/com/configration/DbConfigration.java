package com.configration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DbConfigration {
	@Value("${application.dburls}")
	private String dbUrl;

	@Value("${application.dbusername}")
	private String userName;

	@Value("${application.dbpassword}")
	private String password;

	@Bean
	@Profile("dev")
	public String getDevDbConnection() {
		System.out.println("dbUrls: " + this.dbUrl);
		System.out.println("userName: " + this.userName);
		System.out.println("password: " + this.password);
		return "DEV DB Connection successfully";
	}
	
	@Bean
	@Profile("sit")
	public String getSitDbConnection() {
		System.out.println("dbUrls: " + this.dbUrl);
		System.out.println("userName: " + this.userName);
		System.out.println("password: " + this.password);
		return "SIT DB Connection successfully";
	}
	
	@Bean
	@Profile("prod")
	public String getProdDbConnection() {
		System.out.println("dbUrls: " + this.dbUrl);
		System.out.println("userName: " + this.userName);
		System.out.println("password: " + this.password);
		return "PROD DB Connection successfully";
	}



}
