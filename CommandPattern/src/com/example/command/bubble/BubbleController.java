package com.example.command.bubble;

public class BubbleController {

	Command command;

	public BubbleController() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String processCommand() {
		return command.execute();
	}

}
