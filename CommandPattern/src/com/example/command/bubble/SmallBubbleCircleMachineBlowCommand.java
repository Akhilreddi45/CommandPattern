package com.example.command.bubble;

public class SmallBubbleCircleMachineBlowCommand implements Command {

	SmallBubbleCircleMachine machine;

	public SmallBubbleCircleMachineBlowCommand(SmallBubbleCircleMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.blow();
		return "SmallBubbleCircleMachineBlowCommand";
	}

}
