package com.matt.robot.core;

import java.awt.Color;
import java.awt.event.InputEvent;

public class MouseActions extends RobotCore {

	public void moveTo(int x, int y) {
		robot.mouseMove(x, y);
		delay(50);
	}

	public void click() {
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		delay(50);
	}

	public void click(int x, int y) {
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		delay(50);
	}

	public void click(int x, int y, int delay) {
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		delay(delay);
	}

	public int getRed(int x, int y) {
		robot.mouseMove(x, y);
		Color color = robot.getPixelColor(x, y);
		delay(50);
		return color.getRed();
	}
	
	public int getGreen(int x, int y) {
		robot.mouseMove(x, y);
		Color color = robot.getPixelColor(x, y);
		delay(50);
		return color.getGreen();
	}
	
	public int getBlue(int x, int y) {
		robot.mouseMove(x, y);
		Color color = robot.getPixelColor(x, y);
		delay(50);
		return color.getBlue();
	}

	public void rightClick() {
		robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		delay(50);
	}

	public void scroll(int amount) {
		robot.mouseWheel(amount);
		delay(50);
	}
}
