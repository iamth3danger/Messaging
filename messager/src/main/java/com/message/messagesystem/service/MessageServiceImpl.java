package com.message.messagesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.message.messagesystem.message.Message;
import com.message.messagesystem.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService{
	
	@Autowired
	private MessageRepository messageRepository;

	@Override
	public Message saveMessage(Message message) {
		// TODO Auto-generated method stub
		return messageRepository.save(message);
	}

	@Override
	public List<Message> getMessages() {
		// TODO Auto-generated method stub
		return messageRepository.findAll();
	}
	
	
}
