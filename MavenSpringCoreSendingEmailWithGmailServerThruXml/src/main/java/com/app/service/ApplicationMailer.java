package com.app.service;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
 
public class ApplicationMailer
{
    private MailSender mailSender;
     
    private SimpleMailMessage preConfiguredMessage;
    
	/**
	 * @param mailSender the mailSender to set
	 */
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	/**
	 * @param preConfiguredMessage the preConfiguredMessage to set
	 */
	public void setPreConfiguredMessage(SimpleMailMessage preConfiguredMessage) {
		this.preConfiguredMessage = preConfiguredMessage;
	}

	/**
     * This method will send compose and send the message
     * */
    public void sendMail(String to, String subject, String body)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
 
    /**
     * This method will send a pre-configured message
     * */
    public void sendPreConfiguredMail(String message)
    {
        SimpleMailMessage mailMessage = new SimpleMailMessage(preConfiguredMessage);
        mailMessage.setText(message);
        mailSender.send(mailMessage);
    }
}