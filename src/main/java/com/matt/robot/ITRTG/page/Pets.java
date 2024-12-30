package com.matt.robot.ITRTG.page;

import com.matt.robot.ITRTG.ITRTGTest;

public class Pets extends ITRTGTest {

	private static int pets_x = 638, pets_y = 141;
	private static int petCampaign_x = 730, petCampaign_y = 141;
	private static int petDungeon_x = 820, petDungeon_y = 141;

	private static int growth_x = 982, growth_y = 392;

	private static int back_x = 1665, back_y = 258;
	private static int halfStats_x = 1758, halfStats_y = 329;
	private static int spread_x = 1560, spread_y = 258;

	private static int top_x = 1440, top_y = 250;
	private static int restartAll_x = 1073, restartAll_y = 263;
	private static int feed_x = 958, feed_y = 775;
	private static int close_x = 928, close_y = 965;
	private static int ok_x = 1764, ok_y = 692;

	private static int dungeon_x = 823, dungeon_y = 257;

	public static void petLevel() {
		mouse.click(pets_x, pets_y);
		mouse.click(back_x, back_y);
		mouse.click(halfStats_x, halfStats_y);
		mouse.click(spread_x, spread_y);
	}

	public static void petCampaign() {
		mouse.click(petCampaign_x, petCampaign_y);
		if (mouse.getRed(growth_x, growth_y) == 40 && mouse.getGreen(growth_x, growth_y) == 120 && mouse.getBlue(growth_x, growth_y) == 40) {
			mouse.click(top_x, top_y);
			mouse.click(restartAll_x, restartAll_y);
			mouse.click(feed_x, feed_y);
			mouse.click(close_x, close_y);
			mouse.click(ok_x, ok_y);
		}
	}

	public static void petDungeon() {
		mouse.click(petDungeon_x, petDungeon_y);
		mouse.click(dungeon_x, dungeon_y);
		// Volcano 995, 653 (40, 120, 40) - 1300, 653
		// Forest 995, 815 (40, 120, 40) - 1300, 815
		// 696, 341 startAll
		// 872, 343 maxDur
		// 1092, 342 startNow
		
	}

}
