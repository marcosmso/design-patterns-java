package Bridge;

public class TV implements IDevice{
  boolean isEnabled = true;
  int volume = 0;
  int channel = 1;

  public boolean isEnabled(){
    return this.isEnabled;
  }

  public void enable(){
    this.isEnabled = true;
  }

  public void disable(){
    this.isEnabled = false;
  }
  
  public int getVolume(){
    return this.volume;
  }

  public void setVolume(int volume){
    this.volume = volume;
  }

  public void setChannel(int channel){
    this.channel = channel;
    System.out.println("Changed TV channel to " + this.channel);
  }

  public int getChannel(){
    return this.channel;
  }
}
