package br.com.bunbismuth.adapter.tvPort.adapters;

import br.com.bunbismuth.adapter.tvPort.intefaces.HDMI;
import br.com.bunbismuth.adapter.tvPort.intefaces.VGA;

public class HDMIToVGAAdapter implements HDMI {
	private final VGA vga;

	public HDMIToVGAAdapter(VGA vga) {
		System.out.println("Conecting the HDMI/VGA adapter...");
		this.vga = vga;
	}

	@Override
	public void setImage(String image) {
		System.out.println("Converting the image from HDMI to VGA");
		vga.setImage(image);
	}
	
	@Override
	public void setSound(String sound) {
		System.out.println("Sorry, We don`t work with sound");
	}
}
