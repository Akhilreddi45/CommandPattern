package com.example.command.bubble;

public class BubbleControllerApplication {

	public static void main(String[] args) {

		BubbleController controller = new BubbleController();

		LargeBubbleCircleMachine largeCircleMachine = new LargeBubbleCircleMachine();
		LargeBubbleCircleMachineStartCommand lcStartCommand = new LargeBubbleCircleMachineStartCommand(
				largeCircleMachine);
		LargeBubbleCircleMachineStopCommand lcStopCommand = new LargeBubbleCircleMachineStopCommand(largeCircleMachine);
		LargeBubbleCircleMachineBlowCommand lcBlowCommand = new LargeBubbleCircleMachineBlowCommand(largeCircleMachine);

		LargeBubbleSquareMachine largeSquareMachine = new LargeBubbleSquareMachine();
		LargeBubbleSquareMachineStartCommand lsStartCommand = new LargeBubbleSquareMachineStartCommand(
				largeSquareMachine);
		LargeBubbleSquareMachineStopCommand lsStopCommand = new LargeBubbleSquareMachineStopCommand(largeSquareMachine);
		LargeBubbleSquareMachineBlowCommand lsBlowCommand = new LargeBubbleSquareMachineBlowCommand(largeSquareMachine);

		SmallBubbleCircleMachine smallBubbleCircleMachine = new SmallBubbleCircleMachine();
		SmallBubbleCircleMachineStartCommand scStartCommand = new SmallBubbleCircleMachineStartCommand(
				smallBubbleCircleMachine);
		SmallBubbleCircleMachineStopCommand scStopCommand = new SmallBubbleCircleMachineStopCommand(
				smallBubbleCircleMachine);
		SmallBubbleCircleMachineBlowCommand scBlowCommand = new SmallBubbleCircleMachineBlowCommand(
				smallBubbleCircleMachine);

		SmallBubbleSquareMachine smallBubbleSquareMachine = new SmallBubbleSquareMachine();
		SmallBubbleSquareMachineBlowCommand ssBlowCommand = new SmallBubbleSquareMachineBlowCommand(
				smallBubbleSquareMachine);
		SmallBubbleSquareMachineStartCommand ssStartCommand = new SmallBubbleSquareMachineStartCommand(
				smallBubbleSquareMachine);
		SmallBubbleSquareMachineStopCommand ssStopCommand = new SmallBubbleSquareMachineStopCommand(
				smallBubbleSquareMachine);

		controller.setCommand(lcStartCommand);
		controller.processCommand();
		controller.setCommand(lcBlowCommand);
		controller.processCommand();
		controller.setCommand(lcStopCommand);
		controller.processCommand();
		System.out.println();
		System.out.println("*************************************************");
		System.out.println();
		controller.setCommand(lsStartCommand);
		controller.processCommand();
		controller.setCommand(lsBlowCommand);
		controller.processCommand();
		controller.setCommand(lsStopCommand);
		controller.processCommand();
		System.out.println();
		System.out.println("*************************************************");
		System.out.println();
		controller.setCommand(scStartCommand);
		controller.processCommand();
		controller.setCommand(scBlowCommand);
		controller.processCommand();
		controller.setCommand(scStopCommand);
		controller.processCommand();
		System.out.println();
		System.out.println("*************************************************");
		System.out.println();
		controller.setCommand(ssStartCommand);
		controller.processCommand();
		controller.setCommand(ssBlowCommand);
		controller.processCommand();
		controller.setCommand(ssStopCommand);
		controller.processCommand();

	}

}
