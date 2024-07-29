package com.message.messagesystem.service;

import java.util.List;

import com.message.messagesystem.message.Message;

public interface MessageService {
	public Message saveMessage(Message message);
	public List<Message> getMessages();
}
