package de.doubleslash.dip;

public class Lamp implements SwitchClient {

  private boolean isOn;

  @Override
  public void turnOn() {
    this.isOn = true;
    System.out.println("Lamp is on");
  }

  @Override
  public void turnOff() {
    this.isOn = false;
    System.out.println("Lamp is off");
  }
}
