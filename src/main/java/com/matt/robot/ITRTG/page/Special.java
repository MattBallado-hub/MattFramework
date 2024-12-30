package com.matt.robot.ITRTG.page;

import com.matt.robot.ITRTG.ITRTGTest;

public class Special extends ITRTGTest {

	private static int special_x = 1179, special_y = 146;
	private static int finish_x = 1040, finish_y = 400;
	private static int flee_x = 623, flee_y = 232;
	private static int jackyLee_x = 1238, jackyLee_y = 400;
	private static int mysticMode_x = 1715, mysticMode_y = 800;
	private static int offenseAura_x = 1068, offenseAura_y = 800;
	private static int transformationAura_x = 750, transformationAura_y = 875;
	private static int elementalManipulation_x = 750, elementalManipulation_y = 1000;
	private static int ionioiHeroSummon_x = 1400, ionioiHeroSummon_y = 750;

	public static void jackyLee() {
		mouse.click(special_x, special_y);
		mouse.click(finish_x, finish_y);
		mouse.click(jackyLee_x, jackyLee_y);
		mouse.click(mysticMode_x, mysticMode_y, 600);
		mouse.click(offenseAura_x, offenseAura_y, 600);
		mouse.click(transformationAura_x, transformationAura_y, 600);
		mouse.click(elementalManipulation_x, elementalManipulation_y, 600);
		mouse.click(ionioiHeroSummon_x, ionioiHeroSummon_y);
		mouse.click(flee_x, flee_y);
	}

	public static void gods() {

	}
	
}
