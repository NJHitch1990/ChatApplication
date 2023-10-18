package com.involveinnovation.chatserver.controller;

import com.involveinnovation.chatserver.controller.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController { // Creating our server

    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/message") // To send message, uri = /app/message, app prefix set in config
    @SendTo("/chatroom/public")
    private Message receivePublicMessage(@Payload Message message) {
        return message;
    }

    @MessageMapping("private-message")
    public Message receivePrivateMessage(@Payload Message message) {

        /*
         The part below is needed as we're sending this message to a particular user not to the
         public channel. Hence, we can't use @SendTo() with this method.
         We need to create the topics (i.e. the place we're sending the messages to) dynamically.
         */

        simpMessagingTemplate.convertAndSendToUser(
                message.getReceiverName(), "/private", message);
        // Will use user prefix set in config -> e.g. /user/David/private

        return message;
    }
}
