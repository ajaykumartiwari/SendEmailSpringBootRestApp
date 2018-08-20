/**
 * 
 */
package com.send.mail.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.send.mail.service.NotificationService;

/**
 * @author ajay
 *
 */
@RestController
public class RegistrationController {

	private Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	NotificationService notificationService;

	private final JavaMailSender javaMailSender;

	@Autowired
	RegistrationController(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	@RequestMapping("/send-mail")
	SimpleMailMessage send() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo("ayz@gmail.com");
		// mailMessage.setReplyTo("someone@localhost");
		mailMessage.setFrom("abc@gmail.com");
		mailMessage.setCc("abc@gmail.com");
		mailMessage.setSentDate(new Date());
		mailMessage.setSubject("demo mail send");
		mailMessage.setText("mail send successfully [...]");
		
		javaMailSender.send(mailMessage);
		return mailMessage;
	}

	
}
