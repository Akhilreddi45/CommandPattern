package com.example.command.bubble;

public class SmallBubbleSquareMachineStopCommand implements Command {

	SmallBubbleSquareMachine machine;

	public SmallBubbleSquareMachineStopCommand(SmallBubbleSquareMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "SmallBubbleSquareMachineStopCommand";
	}

}
