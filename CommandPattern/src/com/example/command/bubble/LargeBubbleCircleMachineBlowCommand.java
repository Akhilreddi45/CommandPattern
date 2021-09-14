package com.example.command.bubble;

public class LargeBubbleCircleMachineBlowCommand implements Command {

	LargeBubbleCircleMachine machine;

	public LargeBubbleCircleMachineBlowCommand(LargeBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.blow();
		return "LargeBubbleCircleMachineBlowCommand";
	}

}
