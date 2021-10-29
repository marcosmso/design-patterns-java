package Bridge;

public class Remote {
  private IDevice device;

  public Remote(IDevice device){
    this.device = device;
  }

  public void togglePower(){
    if (device.isEnabled()){
      device.disable();
    } else {
      device.enable();
    }
  }

  public void channelUp(){
    int cur_channel = device.getChannel();
    device.setChannel(cur_channel + 1);
  }

  public void channelDown(){
    int cur_channel = device.getChannel();
    device.setChannel(cur_channel - 1);
  }

  public void setDevice(IDevice device) {
    this.device = device;
  }

  public static void main(String[] args){
    Radio radio = new Radio();
    TV tv = new TV();
    
    Remote universal_remote = new Remote(tv);
    universal_remote.channelUp();

    universal_remote.setDevice(radio);
    universal_remote.channelUp();

  }

}
