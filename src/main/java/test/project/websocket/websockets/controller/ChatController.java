package test.project.websocket.websockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import test.project.websocket.websockets.model.MessageModel;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public MessageModel send(MessageModel message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new MessageModel(message.getFrom(), message.getText(), time);
    }

}
