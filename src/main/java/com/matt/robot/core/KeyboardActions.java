package com.matt.robot.core;

import java.awt.event.KeyEvent;

public class KeyboardActions extends RobotCore {

	public void typeText(String text) {
		for (char c : text.toCharArray()) {
			int keyCode = KeyEvent.getExtendedKeyCodeForChar(c);
			if (KeyEvent.CHAR_UNDEFINED != keyCode) {
				robot.keyPress(keyCode);
				robot.keyRelease(keyCode);
				delay(100);
			}
		}
	}

	public void pressShortcut(int... keys) {
		for (int key : keys) {
			robot.keyPress(key);
		}
		for (int key : keys) {
			robot.keyRelease(key);
		}
		delay(200);
	}

}
