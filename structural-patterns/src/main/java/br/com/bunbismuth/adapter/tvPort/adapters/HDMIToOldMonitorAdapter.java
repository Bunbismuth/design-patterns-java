package br.com.bunbismuth.adapter.tvPort.adapters;

import br.com.bunbismuth.adapter.tvPort.devices.OldMonitor;
import br.com.bunbismuth.adapter.tvPort.intefaces.HDMI;

public class HDMIToOldMonitorAdapter extends OldMonitor implements HDMI {

	public HDMIToOldMonitorAdapter() {
		super();
		System.out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter...");
	}

	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to VGA");
		super.setImage(image);
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, We don`t work with sound");
	}
}
