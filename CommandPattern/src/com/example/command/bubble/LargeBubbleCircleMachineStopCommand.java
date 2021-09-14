package com.example.command.bubble;

public class LargeBubbleCircleMachineStopCommand implements Command {

	LargeBubbleCircleMachine machine;

	public LargeBubbleCircleMachineStopCommand(LargeBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.start();
		return "LargeBubbleCircleMachineStopCommand";
	}

}
