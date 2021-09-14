package com.example.command.bubble;

public class LargeBubbleSquareMachineBlowCommand implements Command {

	LargeBubbleSquareMachine machine;

	public LargeBubbleSquareMachineBlowCommand(LargeBubbleSquareMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.blow();
		return "LargeBubbleSquareMachineBlowCommand";
	}

}
