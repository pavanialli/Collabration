/*package com.niit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;


import com.niit.model.Message;
import com.niit.model.OutputMessage;

@Controller
public class ChatForumController {
	
	@Mapping("/chat_forum")        //send message
	@SendTo("/topic/message")       //Receive message
	public OutputMessage sendMessage(Message message){
		System.out.println("Calling the method sendMessage");
		System.out.println("Message: "+message.getMessage());
		
		
		return new OutputMessage(message,new Date());  //appending current date
		
}

}
*/