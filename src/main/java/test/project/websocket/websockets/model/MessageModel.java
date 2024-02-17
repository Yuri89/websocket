package test.project.websocket.websockets.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageModel {

    public MessageModel(String from, String text, String time) {
        this.from = from;
        this.text = text;
        this.time = time;
    }

    private String from;
    private String text;
    private String time;

    // getters and setters
}
