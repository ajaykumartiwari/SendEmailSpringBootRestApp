/**
 * 
 */
package com.send.mail.service;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * @author ajay
 *
 */
@Configuration
@PropertySource("classpath:application.properties")
public class MailConfiguration {

	@Value("${spring.mail.host}")
	private String host;
	@Value("${spring.mail.username}")
	private String username;
	@Value("${spring.mail.password}")
	private String password;
	@Value("${spring.mail.properties.mail.smtp.auth}")
	private String auth;
	@Value("${spring.mail.port}")
	private int port;
	@Value("${spring.mail.properties.mail.smtp.starttls.enable}")
	private String fallback;

	@Bean
	public JavaMailSender javaMailSender() {
		JavaMailSenderImpl msender = new JavaMailSenderImpl();
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.auth", auth);
		// mailProperties.put("mail.smtp.ssl.enable",ssl);
		// mailProperties.put("spring.mail.properties.mail.smtp.socketFactory.class",socketclass);
		mailProperties.put("mail.smtp.starttls.enable", fallback);
		msender.setJavaMailProperties(mailProperties);
		msender.setHost(host);
		msender.setPort(port);
		msender.setUsername(username);
		msender.setPassword(password);
		return msender;
	}
}
