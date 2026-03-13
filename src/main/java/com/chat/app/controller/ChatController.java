package com.chat.app.controller;


import com.chat.app.model.ChatMessage;
import com.chat.app.repository.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;

import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.time.LocalDateTime;
import java.util.List;


@Controller

public class ChatController {

     @Autowired
     private ChatMessageRepository repository;

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatMessage sendMessage( ChatMessage chatMessage) {
        chatMessage.setTimeStamp(LocalDateTime.now());
       if(chatMessage.getType() == null || !chatMessage.getType().equals("JOIN")) {
           repository.save(chatMessage);
       }
        return chatMessage;

    }

    @GetMapping("chat")
    public String chat(){
        return "chat";
    }

    @GetMapping("/messages")
    @ResponseBody
    public List<ChatMessage> getMessages(){
        return repository.findAll();
    }
}
