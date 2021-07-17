package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@Configuration 
public class MailConfig {
	
	@Autowired JavaMailSender javaMailSender;
	
	
	public void sendMail(String para, String assunto, String texto) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("trabalhoapiserratec@gmail.com");
		message.setTo(para);
		message.setSubject(assunto);
		message.setText(texto);
		javaMailSender.send(message);
	}

}
