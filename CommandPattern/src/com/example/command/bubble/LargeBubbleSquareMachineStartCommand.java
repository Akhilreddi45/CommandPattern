package com.example.command.bubble;

public class LargeBubbleSquareMachineStartCommand implements Command {

	LargeBubbleSquareMachine machine;

	public LargeBubbleSquareMachineStartCommand(LargeBubbleSquareMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "LargeBubbleSquareMachineStartCommand";
	}

}
