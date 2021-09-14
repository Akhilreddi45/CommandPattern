package com.example.command.bubble;

public class SmallBubbleCircleMachineStartCommand implements Command {

	SmallBubbleCircleMachine machine;

	public SmallBubbleCircleMachineStartCommand(SmallBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "SmallBubbleCircleMachineStartCommand";
	}

}
