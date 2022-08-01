package de.doubleslash.dip;

class DependencyInversionPrinzip {

  public static void main(String[] args) {
    Switch lightSwitch = new Switch(new Lamp());
    lightSwitch.press();
    lightSwitch.press();

    Switch circutSwitch = new Switch(new CircutBreaker());
    circutSwitch.press();
    circutSwitch.press();
  }
}
