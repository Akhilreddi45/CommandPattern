package com.example.command.bubble;

public class SmallBubbleSquareMachineStartCommand implements Command {

	SmallBubbleSquareMachine machine;

	public SmallBubbleSquareMachineStartCommand(SmallBubbleSquareMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "SmallBubbleSquareMachineStartCommand";
	}

}
