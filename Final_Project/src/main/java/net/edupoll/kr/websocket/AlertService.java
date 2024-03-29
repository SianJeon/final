package net.edupoll.kr.websocket;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;


@Component
public class AlertService {

	@Autowired
	Map users;
	
	public void alertNewMessage(String... targets) {
		for(String target: targets) {
			WebSocketSession session = (WebSocketSession)users.get(target);
			if(session ==null)
				continue;
			
			TextMessage txt = new TextMessage("{ \"type\" : \"newMessage\"}");
			try {
				session.sendMessage(txt);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
