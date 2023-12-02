package tvport.Adapters;

import tvport.devices.OldMonitor;
import tvport.interfaces.HDMI;

public class HDMItoOldMonitorAdapter extends OldMonitor implements HDMI {

  public HDMItoOldMonitorAdapter() {
    super();
    System.out.println("Wrapping the VGA's Old Monitor interface with a HDMI adapter");
  }

  @Override
  public void setImage(String image) {
    System.out.println("Converting the image from HDMI to VGA");
    super.setImage(image);
  }

  @Override
  public void setSound(String sound) {
    System.out.println("Sorry, we don't work with sound");
  }
}
