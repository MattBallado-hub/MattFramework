package com.matt.robot.core;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ScreenCapture extends RobotCore {

	public void captureScreen(String filePath) {
		try {
			Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
			BufferedImage screenImage = robot.createScreenCapture(screenRect);
			ImageIO.write(screenImage, "PNG", new File(filePath));
		} catch (Exception e) {
			throw new RuntimeException("Failed to capture screenshot: " + e.getMessage(), e);
		}
	}

}
