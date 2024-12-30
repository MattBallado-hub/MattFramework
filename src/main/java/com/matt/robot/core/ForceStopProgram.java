package com.matt.robot.core;

import java.awt.MouseInfo;
import java.awt.Point;

public class ForceStopProgram {

	public static void ProgramStopper() {
		System.out.println("Starting the program...");
		Thread stopThread = new Thread(() -> {
			while (true) {
				Point mouseLocation = MouseInfo.getPointerInfo().getLocation();
				if (mouseLocation.getX() == 0 || mouseLocation.getY() == 0) {
					System.out.println("Stopping the program...");
					System.exit(0);
				}
			}
		});
		stopThread.start();
	}
}
