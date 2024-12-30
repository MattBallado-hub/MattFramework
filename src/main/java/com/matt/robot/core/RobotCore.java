package com.matt.robot.core;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RobotCore {

	protected Robot robot;
	private static final Logger logger = Logger.getLogger(RobotCore.class.getName());

	public RobotCore() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			logger.log(Level.SEVERE, "Failed to initialize Robot: " + e.getMessage(), e);
			throw new RuntimeException(e);
		}
	}

	protected void delay(int milliseconds) {
		robot.delay(milliseconds);
	}

}
