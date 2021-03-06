package edu.gatech.ccbs;

import java.awt.Container;

import javax.swing.*;

public class PilotFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	public String aircraftName;
	private JTextArea clearanceArea;
	
	public PilotFrame(String aircraftName) {
		this.aircraftName = aircraftName;
		clearanceArea = new JTextArea();
		clearanceArea.setEditable(false);
		clearanceArea.append("Clearances for ");
		clearanceArea.append(aircraftName);
		clearanceArea.append("\n\n");
		Container cp = getContentPane();
		cp.add(clearanceArea);
		this.setSize(320, 240);
	}

	public void appendClearance(String clearance) {
		clearanceArea.append(clearance);
	}
}
