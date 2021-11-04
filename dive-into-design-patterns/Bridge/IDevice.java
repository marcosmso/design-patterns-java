package Bridge;

public interface IDevice {
  public boolean isEnabled();
  public void enable();
  public void disable();
  public int getVolume();
  public void setVolume(int percent);
  public void setChannel(int channel);
  public int getChannel();
}
