package com.matt.robot.ITRTG.page;

import com.matt.robot.ITRTG.ITRTGTest;

public class Ads extends ITRTGTest {

	private static int watchAd_x = 1656, watchAd_y = 257;
	private static int close_x = 842, close_y = 923;
	
	public static void ads() {
		mouse.click(watchAd_x, watchAd_y, 35000);
		mouse.click(close_x, close_y);
	}
	
}
