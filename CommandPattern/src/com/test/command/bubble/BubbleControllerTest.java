package com.test.command.bubble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.command.bubble.BubbleController;
import com.example.command.bubble.LargeBubbleCircleMachine;
import com.example.command.bubble.LargeBubbleCircleMachineBlowCommand;
import com.example.command.bubble.LargeBubbleCircleMachineStartCommand;
import com.example.command.bubble.LargeBubbleCircleMachineStopCommand;
import com.example.command.bubble.LargeBubbleSquareMachine;
import com.example.command.bubble.LargeBubbleSquareMachineBlowCommand;
import com.example.command.bubble.LargeBubbleSquareMachineStartCommand;
import com.example.command.bubble.LargeBubbleSquareMachineStopCommand;
import com.example.command.bubble.SmallBubbleCircleMachine;
import com.example.command.bubble.SmallBubbleCircleMachineBlowCommand;
import com.example.command.bubble.SmallBubbleCircleMachineStartCommand;
import com.example.command.bubble.SmallBubbleCircleMachineStopCommand;
import com.example.command.bubble.SmallBubbleSquareMachine;
import com.example.command.bubble.SmallBubbleSquareMachineBlowCommand;
import com.example.command.bubble.SmallBubbleSquareMachineStartCommand;
import com.example.command.bubble.SmallBubbleSquareMachineStopCommand;

class BubbleControllerTest {

	LargeBubbleCircleMachine largeBubbleCircleMachine;
	SmallBubbleCircleMachine smallBubbleCircleMachine;
	LargeBubbleSquareMachine largeBubbleSquareMachine;
	SmallBubbleSquareMachine smallBubbleSquareMachine;
	LargeBubbleCircleMachineStartCommand lcStartCommand;
	LargeBubbleCircleMachineStopCommand lcStopCommand;
	LargeBubbleCircleMachineBlowCommand lcBlowCommand;

	LargeBubbleSquareMachineStartCommand lsStartCommand;
	LargeBubbleSquareMachineStopCommand lsStopCommand;
	LargeBubbleSquareMachineBlowCommand lsBlowCommand;

	SmallBubbleCircleMachineStartCommand scStartCommand;
	SmallBubbleCircleMachineStopCommand scStopCommand;
	SmallBubbleCircleMachineBlowCommand scBlowCommand;

	SmallBubbleSquareMachineBlowCommand ssBlowCommand;
	SmallBubbleSquareMachineStartCommand ssStartCommand;
	SmallBubbleSquareMachineStopCommand ssStopCommand;

	@BeforeEach
	public void setup() {
		largeBubbleCircleMachine = new LargeBubbleCircleMachine();
		smallBubbleCircleMachine = new SmallBubbleCircleMachine();
		largeBubbleSquareMachine = new LargeBubbleSquareMachine();
		smallBubbleSquareMachine = new SmallBubbleSquareMachine();

		lcStartCommand = new LargeBubbleCircleMachineStartCommand(largeBubbleCircleMachine);
		lcStopCommand = new LargeBubbleCircleMachineStopCommand(largeBubbleCircleMachine);
		lcBlowCommand = new LargeBubbleCircleMachineBlowCommand(largeBubbleCircleMachine);

		lsStartCommand = new LargeBubbleSquareMachineStartCommand(largeBubbleSquareMachine);
		lsStopCommand = new LargeBubbleSquareMachineStopCommand(largeBubbleSquareMachine);
		lsBlowCommand = new LargeBubbleSquareMachineBlowCommand(largeBubbleSquareMachine);

		scStartCommand = new SmallBubbleCircleMachineStartCommand(smallBubbleCircleMachine);
		scStopCommand = new SmallBubbleCircleMachineStopCommand(smallBubbleCircleMachine);
		scBlowCommand = new SmallBubbleCircleMachineBlowCommand(smallBubbleCircleMachine);

		ssBlowCommand = new SmallBubbleSquareMachineBlowCommand(smallBubbleSquareMachine);
		ssStartCommand = new SmallBubbleSquareMachineStartCommand(smallBubbleSquareMachine);
		ssStopCommand = new SmallBubbleSquareMachineStopCommand(smallBubbleSquareMachine);

	}

	@Test
	public void LargeCircleBubbleMachineApp() {

		BubbleController controller = new BubbleController();

		controller.setCommand(lcStartCommand);

		String output = controller.processCommand();

		assertEquals("LargeBubbleCircleMachineStartCommand", output);

		controller.setCommand(lcBlowCommand);

		output = controller.processCommand();

		assertEquals("LargeBubbleCircleMachineBlowCommand", output);

		controller.setCommand(lcStopCommand);

		output = controller.processCommand();

		assertEquals("LargeBubbleCircleMachineStopCommand", output);

	}

	@Test
	public void SmallCircleBubbleMachineApp() {

		BubbleController controller = new BubbleController();

		controller.setCommand(scStartCommand);

		String output = controller.processCommand();

		assertEquals("SmallBubbleCircleMachineStartCommand", output);

		controller.setCommand(scBlowCommand);

		output = controller.processCommand();

		assertEquals("SmallBubbleCircleMachineBlowCommand", output);

		controller.setCommand(scStopCommand);

		output = controller.processCommand();

		assertEquals("SmallBubbleCircleMachineStopCommand", output);

	}

	@Test
	public void LargeSquareBubbleMachineApp() {

		BubbleController controller = new BubbleController();

		controller.setCommand(lsStartCommand);

		String output = controller.processCommand();

		assertEquals("LargeBubbleSquareMachineStartCommand", output);

		controller.setCommand(lsBlowCommand);

		output = controller.processCommand();

		assertEquals("LargeBubbleSquareMachineBlowCommand", output);

		controller.setCommand(lsStopCommand);

		output = controller.processCommand();

		assertEquals("LargeBubbleSquareMachineStopCommand", output);

	}

	@Test
	public void SmallSquareBubbleMachineApp() {

		BubbleController controller = new BubbleController();

		controller.setCommand(ssStartCommand);

		String output = controller.processCommand();

		assertEquals("SmallBubbleSquareMachineStartCommand", output);

		controller.setCommand(ssBlowCommand);

		output = controller.processCommand();

		assertEquals("SmallBubbleSquareMachineBlowCommand", output);

		controller.setCommand(ssStopCommand);

		output = controller.processCommand();

		assertEquals("SmallBubbleSquareMachineStopCommand", output);

	}

}
