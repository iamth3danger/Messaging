package com.message.messagesystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.message.messagesystem.message.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Integer>{

}

