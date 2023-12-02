package tvport;

import tvport.Adapters.HDMItoOldMonitorAdapter;
import tvport.Adapters.HDMItoVGAAdapter;
import tvport.devices.Computer;
import tvport.devices.OldMonitor;
import tvport.devices.TV;

public class Client {
  public static void main(String[] args) {
    Computer pc = new Computer();
    TV tv = new TV();
    pc.connectPort(tv);
    pc.sendImageAndSound("Cat and rainbow", "Sans the skeleton sounds");

    // Using Object adapter
    System.out.println("------ Object Adapter ------");
    Computer pc2 = new Computer();
    OldMonitor monitor = new OldMonitor();
    //        pc2.connectPort(OldMonitor); don't work, that's the reason why we have to create an
    // adapter
    pc2.connectPort(new HDMItoVGAAdapter(monitor));
    pc2.sendImageAndSound("Skeleton the Papyrus", "Eletronic music");

    // Using Class adapter
    System.out.println("------ Class Adapter ------");
    Computer pc3 = new Computer();
    HDMItoOldMonitorAdapter monitorAdaptee = new HDMItoOldMonitorAdapter();
    pc3.connectPort(monitorAdaptee);
    pc3.sendImageAndSound("Skeleton the Sans", "Rock music");
  }
}
