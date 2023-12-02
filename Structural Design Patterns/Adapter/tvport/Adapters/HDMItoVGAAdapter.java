package tvport.Adapters;

import tvport.interfaces.HDMI;
import tvport.interfaces.VGA;

public class HDMItoVGAAdapter implements HDMI {
  private final VGA vga;

  public HDMItoVGAAdapter(VGA vga) {
    System.out.println("Connecting the HDMI/VGA adapter...");
    this.vga = vga;
  }

  @Override
  public void setImage(String image) {
    System.out.println("Converting the image from HDMI to VGA");
    vga.setImage(image);
  }

  @Override
  public void setSound(String sound) {
    System.out.println("Sorry, We don't work with sound");
  }
}
