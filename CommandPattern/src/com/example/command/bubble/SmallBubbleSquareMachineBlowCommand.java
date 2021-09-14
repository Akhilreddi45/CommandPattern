package com.example.command.bubble;

public class SmallBubbleSquareMachineBlowCommand implements Command {

	SmallBubbleSquareMachine machine;

	public SmallBubbleSquareMachineBlowCommand(SmallBubbleSquareMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.blow();
		return "SmallBubbleSquareMachineBlowCommand";
	}

}
