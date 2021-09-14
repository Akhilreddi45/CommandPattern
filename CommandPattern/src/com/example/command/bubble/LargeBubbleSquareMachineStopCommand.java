package com.example.command.bubble;

public class LargeBubbleSquareMachineStopCommand implements Command {

	LargeBubbleSquareMachine machine;

	public LargeBubbleSquareMachineStopCommand(LargeBubbleSquareMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "LargeBubbleSquareMachineStopCommand";
	}

}
