package com.matt.robot.ITRTG;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.matt.robot.ITRTG.page.Ads;
import com.matt.robot.ITRTG.page.Afky;
import com.matt.robot.ITRTG.page.DivGen;
import com.matt.robot.ITRTG.page.Pets;
import com.matt.robot.ITRTG.page.Special;
import com.matt.robot.core.ForceStopProgram;
import com.matt.robot.core.KeyboardActions;
import com.matt.robot.core.MouseActions;
import com.matt.robot.core.ScreenCapture;

public class ITRTGTest {

	public static MouseActions mouse = new MouseActions();
	public static KeyboardActions keyboard = new KeyboardActions();
	public static ScreenCapture capture = new ScreenCapture();

	public static void main(String args[]) {
		ForceStopProgram.ProgramStopper();
		gui();
	}

	public static void gui() {
		JFrame frame = new JFrame("Idling To Rule The Gods");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(320, 300);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(new BorderLayout(10, 10));

		JLabel titleLabel = new JLabel("ITRTG Automation", JLabel.CENTER);
		frame.add(titleLabel, BorderLayout.NORTH);

		JPanel checkboxPanel = new JPanel();
		checkboxPanel.setLayout(new GridLayout(9, 1, 1, 1));

		JCheckBox afkyClone = new JCheckBox("Afky Clone");
		JCheckBox petLevel = new JCheckBox("Pet Level");
		JCheckBox petCampaign = new JCheckBox("Pet Campaign");
		JCheckBox divGen = new JCheckBox("Divinity Generator");
		JCheckBox specialJackyLee = new JCheckBox("Special - Jacky Lee");
		JCheckBox specialGods = new JCheckBox("Special - Gods");
		JCheckBox ubv2 = new JCheckBox("UBv2");
		JCheckBox tbs = new JCheckBox("TBS");
		JCheckBox ads = new JCheckBox("Watch Ads");

		checkboxPanel.add(afkyClone);
		checkboxPanel.add(petLevel);
		checkboxPanel.add(petCampaign);
		checkboxPanel.add(divGen);
		checkboxPanel.add(specialJackyLee);
		checkboxPanel.add(specialGods);
		checkboxPanel.add(ubv2);
		checkboxPanel.add(tbs);
		checkboxPanel.add(ads);

		frame.add(checkboxPanel, BorderLayout.WEST);

		JButton button = new JButton("Start");
		frame.add(button, BorderLayout.SOUTH);

		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int adsCounter = 0;

				while (true) {
					if (afkyClone.isSelected()) {
						Afky.afkyGod();
					}
					if (petLevel.isSelected()) {
						Pets.petLevel();
					}
					if (petCampaign.isSelected()) {
						Pets.petCampaign();
					}
					if (divGen.isSelected()) {
						DivGen.divGen();
					}
					if (specialJackyLee.isSelected()) {
						Special.jackyLee();
					}
					if (specialGods.isSelected()) {

					}
					if (ubv2.isSelected()) {
						break;
					}
					if (tbs.isSelected()) {

					}
					if (ads.isSelected()) {
						Ads.ads();
						if (++adsCounter == 10) {
							break;
						}
					}
				}
			}
		});

		frame.setVisible(true);
	}

}
