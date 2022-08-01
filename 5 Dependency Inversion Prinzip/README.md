# Aufgabenstellung
Es soll ein Schalter implementiert werden, der beliebige Komponenten ein- und ausschalten kann.

# Lösung
![PlantUML model](https://www.plantuml.com/plantuml/png/VO-n2i9038RtUugCElG53eTY9q5my0bYckBXDLToEHtKT_UG2Wh5CT_F_oLfiw5Q6QFRYR4EI0p7Mp0wTp6mcFiUm8CLbOEirejy66f04NEU7N1t3I1PkA9nx-6KKcIK2kbTzB-xdcwkUPYKSwws3qbDy-UkpQF6Unod1Tm5fM9RPRomkfQbhz--0000)

<!--
@startuml
Interface SwitchClient
SwitchClient : turnOn()
SwitchClient : turnOff()
class Switch {
- activated: boolean
- client: SwitchClient
  }
  Switch : press()

Switch o-- SwitchClient
SwitchClient <|-- Lamp
SwitchClient <|-- CircutBreaker
@enduml
-->
