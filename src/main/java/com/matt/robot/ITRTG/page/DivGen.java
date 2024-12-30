package com.matt.robot.ITRTG.page;

import com.matt.robot.ITRTG.ITRTGTest;

public class DivGen extends ITRTGTest {

	private static int divGen_x = 1182, divGen_y = 66;
	private static int add2_x = 1802, add2_y = 468;

	public static void divGen() {
		mouse.click(divGen_x, divGen_y);
		mouse.click(add2_x, add2_y);
	}

}
