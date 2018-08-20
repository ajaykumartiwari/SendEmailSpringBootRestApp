/**
 * 
 */
package com.send.mail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.send.mail.domain.User;

/**
 * @author ajay
 *
 */
@Service
public class NotificationService {

	private JavaMailSender javaMailSender;
	
	@Autowired
	public NotificationService(JavaMailSender javaMailSender){
		this.javaMailSender = javaMailSender;
	}
	
	public void sendNotification(User user) throws MailException {
		//send a email
		SimpleMailMessage mail = new SimpleMailMessage();
		//mail.setTo(user.getEmailAddress());
		mail.setTo("abc@gmail.com");
		mail.setFrom("xyz@gmail.com");
		mail.setSubject("Zicos Demo Email Configuration");
		mail.setText("This is simple mail test example");
		
		javaMailSender.send(mail);
	}
}
