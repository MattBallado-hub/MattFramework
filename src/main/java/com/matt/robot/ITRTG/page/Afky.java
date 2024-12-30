package com.matt.robot.ITRTG.page;

import com.matt.robot.ITRTG.ITRTGTest;

public class Afky extends ITRTGTest {

	private static int afky_x = 1743, afky_y = 56;
	private static int cap_x = 1373, cap_y = 473;
	private static int cloneHP_x = 1373, cloneHP_y = 473;
	private static int cloneCount_x = 1373, cloneCount_y = 473;
	
	public static void afkyGod() {
		mouse.click(afky_x, afky_y);
		mouse.click(cap_x, cap_y);
		mouse.click(cloneHP_x, cloneHP_y);
		mouse.click(cloneCount_x, cloneCount_y);
		mouse.click(afky_x, afky_y);
	}
	
}
