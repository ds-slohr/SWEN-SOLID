package de.doubleslash.dip;

public class Switch {

  private final SwitchClient client;
  private boolean activated = false;

  public Switch(SwitchClient client) {
    this.client = client;
  }

  public void press() {
    activated = !activated;
    if (activated) {
      client.turnOn();
    } else {
      client.turnOff();
    }
  }

}
