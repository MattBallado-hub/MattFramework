package com.matt.robot.ITRTG.page;

import com.matt.robot.ITRTG.ITRTGTest;

public class Planet extends ITRTGTest {

	private static int planet_x = 1268, planet_y = 61;
	private static int ubv2_x = 1441, ubv2_y = 301;
	private static int cap_x = 1699, cap_y = 495;
	private static int fight_x = 1734, fight_y = 639;
	private static int flee_x = 606, flee_y = 242;
	
	public static void ubv2() {
		mouse.click(planet_x, planet_y);
		mouse.click(ubv2_x, ubv2_y);
		mouse.click(cap_x, cap_y);
		mouse.click(fight_x, fight_y);
		keyboard.typeText("U U R T I F I F I R U W I E I V I R U T I W I E I V V V");
		mouse.click(flee_x, flee_y);
	}

}
