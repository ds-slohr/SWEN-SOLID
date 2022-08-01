package de.doubleslash.dip;

public class CircutBreaker implements SwitchClient {

  private boolean circutActive;

  @Override
  public void turnOn() {
    circutActive = true;
    System.out.println("Circut is active");
  }

  @Override
  public void turnOff() {
    circutActive = false;
    System.out.println("Circut is inactive");
  }
}
