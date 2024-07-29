package com.message.messagesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.message.messagesystem.message.Message;
import com.message.messagesystem.service.MessageService;

@RestController
@RequestMapping("/message")
@CrossOrigin
public class MessageController {
	@Autowired
	private MessageService messageService;
	
	@PostMapping("/add")
	public String add(@RequestBody Message message) {
		messageService.saveMessage(message);
		return "new message";
	}
	
	@GetMapping("/getAll")
	 public List<Message> getAllStudents(){
		return messageService.getMessages();
	}
}